// 2. Write a program to find the sum of elements in a given range [L, R] using a prefix sum array
public class Q2_PrefixSumRangeQuery {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int[] prefixSum = new int[arr.length];
        
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        
        int L = 1, R = 4;
        int sum = prefixSum[R] - (L > 0 ? prefixSum[L-1] : 0);
        System.out.println("Sum from index " + L + " to " + R + " is: " + sum);
    }
}