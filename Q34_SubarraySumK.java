// 34. Solve the problem of finding the subarray sum equal to K using hashing
import java.util.HashMap;

public class Q34_SubarraySumK {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        int count = subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + count);
    }
    
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}