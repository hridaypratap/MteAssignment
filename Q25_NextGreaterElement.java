// 25. Solve the problem of finding the next greater element for each element in an array
import java.util.Stack;

public class Q25_NextGreaterElement {
    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 25};
        int[] result = nextGreaterElements(nums);
        
        System.out.print("Next greater elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }
}