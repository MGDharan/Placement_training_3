import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

        for (int n : freq.keySet()) {
            pq.offer(n);
            if (pq.size() > k)
                pq.poll();
        }

        while (!pq.isEmpty())
            System.out.print(pq.poll() + " ");
    }
}
