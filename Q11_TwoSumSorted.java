// 11. Find two numbers in a sorted array that add up to a target
public class Q11_TwoSumSorted {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                System.out.println("Numbers found: " + nums[left] + " and " + nums[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        System.out.println("No two numbers add up to target");
    }
}