// 36. Generate all subsets of a given array
import java.util.ArrayList;
import java.util.List;

public class Q36_AllSubsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = subsets(nums);
        
        System.out.println("All subsets:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
    
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }
    
    private static void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        result.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}