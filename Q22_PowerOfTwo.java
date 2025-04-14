// 22. How to check if a number is a power of two using bit manipulation
public class Q22_PowerOfTwo {
    public static void main(String[] args) {
        int num = 16;
        boolean isPowerOfTwo = isPowerOfTwo(num);
        System.out.println(num + " is power of two: " + isPowerOfTwo);
    }
    
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}