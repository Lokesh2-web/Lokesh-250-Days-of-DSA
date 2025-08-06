class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left +(right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }

            // Check which half is Sorted

            if(nums[left] <= nums[mid]){
                // This Means that Left part is Sorted
                if(target >= nums[left] && target <= nums[mid]){ 
                  // searching in the left part wether the elements present in it or not
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
              // This Means that right part is sorted
               // searching in the Right part wether the elements present in it or not
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
