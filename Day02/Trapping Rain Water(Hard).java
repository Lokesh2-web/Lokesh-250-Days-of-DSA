class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int max = 0;
        int maxIndex = 0;
        int totalWater = 0;

        // To calculate the Height of the Maximum Building

        for(int i = 0; i < n; i++) {
            if(height[i] > max){
                max = height[i];
                maxIndex = i;
            }
        }
        

        // Part 1 :- To check the Left Max Building
        int leftMax = 0;

        for(int i = 0; i < maxIndex; i++){
            leftMax = Math.max(leftMax,height[i]);
            int water = Math.min(leftMax,max) - height[i];
            totalWater = totalWater + water;
        }

        leftMax = 0;

        for(int i = n - 1; i > maxIndex; i--){
            leftMax = Math.max(leftMax,height[i]);
            int water = Math.min(leftMax,max) - height[i];
            totalWater = totalWater + water;
        }

        return totalWater;


    }
}
