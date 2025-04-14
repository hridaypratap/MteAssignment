// 16. Find the majority element in an array that appears more than n/2 times
public class Q16_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majority = findMajorityElement(nums);
        System.out.println("Majority element: " + majority);
    }
    
    public static int findMajorityElement(int[] nums) {
        int count = 0, candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }
}