// 4. Check if an array can be split into two parts such that the sum of the prefix equals the sum of the suffix
public class Q4_SplitArrayEqualSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        int totalSum = 0, leftSum = 0;
        
        for (int num : arr) totalSum += num;
        
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            if (leftSum == totalSum - leftSum) {
                System.out.println("Array can be split at index " + i);
                return;
            }
        }
        System.out.println("Array cannot be split with equal sum");
    }
}