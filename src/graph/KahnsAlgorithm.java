package graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * This is a graph algorithm which solves usecases related to
 * topological sort, conditional elements in a graph
 * In degree of each node is calculated and graph is traversed with any node having degree as 0
 */
public class KahnsAlgorithm {

        public List<Integer> getOrder(int[][] edges , int k) {
            List<Integer>[] graph = new ArrayList[k];
            for(int i=0;i<k;i++){
                graph[i] = new ArrayList<>();
            }
            int[] degree = new int[k];

            // Create the graph using the edges / conditions
            for(int i=0;i<edges.length;i++){
                int[] edge = edges[i];
                graph[edge[0]].add(edge[1]);
                degree[edge[1]]++;
            }

            // Start processing the nodes. Start with all nodes which has the degree as 0.
            Queue<Integer> queue = new LinkedList<>();
            for(int i=0;i<k;i++){
                if(degree[i]==0){
                    queue.add(i);
                }
            }
            //Store the order till queue is empty
            List<Integer> ans = new ArrayList<>();
            while(!queue.isEmpty()){
                int node  = queue.poll();
                ans.add(node);
                for(int neighbour : graph[node]){
                    degree[neighbour]--;
                    if(degree[neighbour]==0){
                        queue.add(neighbour);
                    }
                }
            }
            return ans;
        }


}
