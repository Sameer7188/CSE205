class Twitter {

    public class Tweet {
        int userId;
        int tweetId;
        public Tweet(int userId, int tweetId) {
            this.userId = userId; this.tweetId = tweetId;
        }
    }

    private List<Tweet> tweets;
    private Map<Integer, Set<Integer>> followings;

    public Twitter() {
        this.tweets = new ArrayList<>();
        this.followings = new HashMap<>();
    }

    
    
    public void postTweet(int userId, int tweetId) {
        tweets.add(new Tweet(userId, tweetId));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> newsFeed = new ArrayList<>();
        Set<Integer> follows = followings.get(userId);
        for (int i = tweets.size() -1; i >= 0; i--) {
            if (newsFeed.size() >= 10) return newsFeed;
            Tweet tweet = tweets.get(i);
            if (tweet.userId == userId 
            || (follows != null && follows.contains(tweet.userId))) {
                newsFeed.add(tweet.tweetId);
            }
        }
        
        return newsFeed;
    }
    
    public void follow(int followerId, int followeeId) {
        if (!followings.containsKey(followerId)) {
            followings.put(followerId, new HashSet<Integer>());
        }
        followings.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (followings.get(followerId) != null) {
            followings.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */