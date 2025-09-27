// 10. Generate all permutations of a given string
import java.util.ArrayList;
import java.util.List;

public class Q10_StringPermutations {
    public static void main(String[] args) {
        String s = "abc";
        List<String> result = new ArrayList<>();
        permute(s, 0, s.length() - 1, result);
        
        System.out.println("All permutations:");
        for (String perm : result) {
            System.out.println(perm);
        }
    }
    
    private static void permute(String s, int l, int r, List<String> result) {
        if (l == r) {
            result.add(s);
        } else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permute(s, l + 1, r, result);
                s = swap(s, l, i);
            }
        }
    }
    
    private static String swap(String s, int i, int j) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
        
    }
}


