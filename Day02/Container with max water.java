class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int n = height.length;
        int right = n - 1;

        // Using Two Pointer Approach

        while(left < right) {
            int water =  Math.min(arr[left],arr[right]) * (right - left);
            res = Math.max(res,water);

            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return res;

    }
}
