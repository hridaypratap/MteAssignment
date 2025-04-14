// 43. Solve the problem of finding the top K frequent elements in an array
import java.util.*;
import java.util.Map.Entry;

public class Q43_TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> result = topKFrequent(nums, k);
        
        System.out.print(k + " most frequent elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );
        
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll().getKey());
        }
        Collections.reverse(result);
        return result;
    }
}