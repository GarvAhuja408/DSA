import java.util.*;

class Main {

    static class Pair {
        int node, dist;

        Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    static void dijkstra(ArrayList<ArrayList<Pair>> graph, int V, int src) {

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);

        dist[src] = 0;
        pq.offer(new Pair(src, 0));

        while (!pq.isEmpty()) {

            Pair curr = pq.poll();
            int u = curr.node;

            for (Pair neighbor : graph.get(u)) {

                int v = neighbor.node;
                int weight = neighbor.dist;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new Pair(v, dist[v]));
                }
            }
        }

        System.out.println("Shortest distances from source " + src + ":");

        for (int i = 0; i < V; i++) {
            System.out.println(src + " -> " + i + " = " + dist[i]);
        }
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Pair(1, 2));
        graph.get(0).add(new Pair(2, 4));

        graph.get(1).add(new Pair(2, 1));
        graph.get(1).add(new Pair(3, 7));

        graph.get(2).add(new Pair(4, 3));

        graph.get(3).add(new Pair(4, 1));

        dijkstra(graph, V, 0);
    }
}