import java.util.*;

public class Dijkstra {
    static class Edge {
        int node, weight;
        Edge(int n, int w) { node = n; weight = w; }
    }

    public static void main(String[] args) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < 5; i++) graph.add(new ArrayList<>());

        graph.get(0).add(new Edge(1, 2));
        graph.get(0).add(new Edge(2, 4));
        graph.get(1).add(new Edge(2, 1));
        graph.get(1).add(new Edge(3, 7));

        int[] dist = new int[5];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<Edge> pq =
            new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        pq.add(new Edge(0, 0));

        while (!pq.isEmpty()) {
            Edge curr = pq.poll();
            for (Edge e : graph.get(curr.node)) {
                if (dist[e.node] > curr.weight + e.weight) {
                    dist[e.node] = curr.weight + e.weight;
                    pq.add(new Edge(e.node, dist[e.node]));
                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }
}
