// 21. How to count the number of 1s in the binary representation of numbers from 0 to n
public class Q21_CountSetBits {
    public static void main(String[] args) {
        int n = 5;
        int[] result = countBits(n);
        
        System.out.print("Count of 1's for numbers 0 to " + n + ": ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            result[i] = result[i & (i - 1)] + 1;
        }
        return result;
    }
}