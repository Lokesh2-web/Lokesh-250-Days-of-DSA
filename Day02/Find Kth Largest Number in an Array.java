class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();

    }
}


// Another Solution is : --
// By using the Sorting Method
class Solution {
    public int findKthLargest(int[] nums, int k) {
       Arrays.sort(nums);
       retun nums[nums.length - k]; 
    }
}
