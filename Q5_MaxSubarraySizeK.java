// 5. Find the maximum sum of any subarray of size K in a given array
public class Q5_MaxSubarraySizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int maxSum = 0, windowSum = 0;
        
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;
        
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSum);
    }
}