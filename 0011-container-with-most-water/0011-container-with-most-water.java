class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int water = 0;
        int area = 0;

        while(left < right){
            if(height[left] > height[right]){
                area = height[right] * (right - left);
            }else{
                area = height[left] * (right - left);
            }

            if(area > water){
                water = area;
            }

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return water;
    }
}