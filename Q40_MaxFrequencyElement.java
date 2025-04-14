// 40. Solve the problem of finding the element with maximum frequency in an array
import java.util.HashMap;
import java.util.Map;

public class Q40_MaxFrequencyElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4};
        int maxFreqElement = findMaxFrequencyElement(nums);
        System.out.println("Element with maximum frequency: " + maxFreqElement);
    }
    
    public static int findMaxFrequencyElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0, result = -1;
        
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            
            if (count > maxCount) {
                maxCount = count;
                result = num;
            }
        }
        return result;
    }
}