class Solution {

    public int minSetSize(int[] arr) {
        final int n = arr.length;
        final Map<Integer, Integer> eleFreq = new HashMap<>();
        for (int ele : arr) {
            eleFreq.compute(ele, (k, v) -> v == null ? 1 : 1 + v);
        }

        eleFreq.values().forEach(ele -> arr[ele - 1] = arr[ele - 1] > 0 ? -1 : arr[ele - 1] - 1);

        int count = 0;
        int target = n >> 1;
        for (int i = n - 1; i >= 0 && target > 0; i--) {
            if (arr[i] < 0) {
                int num = i + 1;
                int total = -arr[i];
                int req = target / num;
                if (target % num != 0) req++;
                int totalToUse = Math.min(req, total);
                count += totalToUse;
                target -= totalToUse * num;
            }
        }

        return count;
    }
}