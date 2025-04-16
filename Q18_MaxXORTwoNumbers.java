// 18. Find the maximum XOR of two numbers in an array
public class Q18_MaxXORTwoNumbers {
    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};
        int maxXOR = findMaximumXOR(nums);
        System.out.println("Maximum XOR: " + maxXOR);
    }
    
    public static int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        
        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            HashSet<Integer> set = new HashSet<>();
            
            for (int num : nums) {
                set.add(num & mask);
            }
            
            int temp = max | (1 < i);
            for (int prefix : set) {
                if (set.contains(temp ^ prefix)) {
                    max = temp;
                    break;
                }
            }
        }
        return max;
    }
}
