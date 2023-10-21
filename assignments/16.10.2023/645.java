class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int dup = 0, m = 0;

        for (int i : nums) {
            if (set.contains(i)) {
                dup = i;
            }
            set.add(i);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                m = i;
            }
        }

        return new int[] {dup, m};
    }
}