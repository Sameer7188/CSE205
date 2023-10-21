class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }

        HashMap<Character,String> check = new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            
            char chr = pattern.charAt(i);
            if(check.containsKey(chr)){
                if(!check.get(chr).equals(words[i])){
                    return false;
                }
            }
            else if(check.containsValue(words[i])){
                return false;
            }
            else{
                check.put(chr,words[i]);
            }
        }
        return true;
    }
}