// 20. Count all numbers with unique digits for a given number of digits
public class Q20_CountNumbersUniqueDigits {
    public static void main(String[] args) {
        int n = 2;
        int count = countNumbersWithUniqueDigits(n);
        System.out.println("Count of numbers with unique digits for n=" + n + ": " + count);
    }
    
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;
        
        int result = 10;
        int uniqueDigits = 9;
        int availableNumbers = 9;
        
        for (int i = 2; i <= n; i++) {
            uniqueDigits *= availableNumbers;
            result += uniqueDigits;
            availableNumbers--;
        }
        return result;
    }
}