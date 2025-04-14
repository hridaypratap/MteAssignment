// 19. How to find the maximum product subarray
public class Q19_MaxProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int maxProduct = maxProduct(nums);
        System.out.println("Maximum product subarray: " + maxProduct);
    }
    
    public static int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        
        int max = nums[0], min = nums[0], result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            
            if (max > result) {
                result = max;
            }
        }
        return result;
    }
}