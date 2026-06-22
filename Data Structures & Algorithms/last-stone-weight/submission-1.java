class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int stone : stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() > 1) {
            int heaviest = maxHeap.remove();
            int secondHeaviest = maxHeap.remove();

            if (heaviest != secondHeaviest) {
                maxHeap.add(heaviest - secondHeaviest);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.remove();
    }

}
