// 28. Implement two stacks in a single array
public class Q28_TwoStacksInArray {
    int size;
    int top1, top2;
    int[] arr;
    
    Q28_TwoStacksInArray(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }
    
    void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }
    
    void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }
    
    int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }
    
    int pop2() {
        if (top2 < size) {
            return arr[top2++];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Q28_TwoStacksInArray ts = new Q28_TwoStacksInArray(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        
        System.out.println("Popped from stack1: " + ts.pop1());
        System.out.println("Popped from stack2: " + ts.pop2());
    }
}