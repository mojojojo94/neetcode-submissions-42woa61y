class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // base case
        if (nums.length <= 1) {
            return nums;
        }

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length+1];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // now to put the frequecies in a bucket
        map.forEach((num, freq) -> {
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num); 
        });

        List<Integer> result = new ArrayList<>();

        for (int i = buckets.length -1; i > 0 && result.size() < k; i--) {
            if (buckets[i] != null) {
                result.addAll(buckets[i]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
