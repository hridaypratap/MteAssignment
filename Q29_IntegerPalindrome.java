// 29. Write a program to check if an integer is a palindrome without converting it to a string
public class Q29_IntegerPalindrome {
    public static void main(String[] args) {
        int x = 121;
        boolean isPalindrome = isPalindrome(x);
        System.out.println(x + " is palindrome: " + isPalindrome);
    }
    
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reverted = 0;
        while (x > reverted) {
            reverted = reverted * 10 + x % 10;
            x /= 10;
        }
        
        return x == reverted || x == reverted / 10;
    }
}