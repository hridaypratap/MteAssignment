// 37. Find all unique combinations of numbers that sum to a target
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q37_CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> combinations = combinationSum(candidates, target);
        
        System.out.println("Unique combinations that sum to " + target + ":");
        for (List<Integer> comb : combinations) {
            System.out.println(comb);
        }
    }
    
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
    
    private static void backtrack(List<List<Integer>> result, List<Integer> temp, 
                                 int[] candidates, int remain, int start) {
        if (remain < 0) return;
        if (remain == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);
            backtrack(result, temp, candidates, remain - candidates[i], i);
            temp.remove(temp.size() - 1);
        }
    }
}