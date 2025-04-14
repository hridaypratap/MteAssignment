// 15. Find the k-th smallest element in a sorted matrix
public class Q15_KthSmallestSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        
        int result = kthSmallest(matrix, k);
        System.out.println(k + "-th smallest element: " + result);
    }
    
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0], high = matrix[n-1][n-1];
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessEqual(matrix, mid);
            
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    
    private static int countLessEqual(int[][] matrix, int target) {
        int count = 0;
        int n = matrix.length, i = n - 1, j = 0;
        
        while (i >= 0 && j < n) {
            if (matrix[i][j] <= target) {
                count += i + 1;
                j++;
            } else {
                i--;
            }
        }
        return count;
    }
}