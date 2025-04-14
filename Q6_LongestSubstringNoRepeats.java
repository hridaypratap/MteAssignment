// 6. Find the length of the longest substring without repeating characters
import java.util.HashSet;

public class Q6_LongestSubstringNoRepeats {
    public static void main(String[] args) {
        String s = "abcabcbb";
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0, left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        System.out.println("Length of longest substring without repeating characters: " + maxLen);
    }
}