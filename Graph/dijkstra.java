import java.util.*;

class Solution {

    public int[] dijkstra(
            int V,
            ArrayList<ArrayList<ArrayList<Integer>>> adj,
            int src) {

        // distance array
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // PriorityQueue: [node, distance]
        PriorityQueue<int[]> pq =
            new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        pq.add(new int[]{src, 0});

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();
            int node = curr[0];
            int currDist = curr[1];

            // skip outdated entry
            if (currDist > dist[node]) continue;

            // relax neighbors
            for (ArrayList<Integer> edge : adj.get(node)) {

                int nextNode = edge.get(0);
                int weight = edge.get(1);

                if (dist[node] + weight < dist[nextNode]) {
                    dist[nextNode] = dist[node] + weight;
                    pq.add(new int[]{nextNode, dist[nextNode]});
                }
            }
        }
        return dist;
    }
}
