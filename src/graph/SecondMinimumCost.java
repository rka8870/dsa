package graph;

import java.util.*;

public class SecondMinimumCost {



    public class Stop{
        int node;
        int time;
        public Stop(int node, int time){
            this.node = node;
            this.time = time;
        }
    }

    public int secondMinimum(int n, int[][] edges, int time, int change) {
        int INF = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            List<Integer> list1 = graph.getOrDefault(u,new ArrayList<>());
            List<Integer> list2 = graph.getOrDefault(v,new ArrayList<>());
            list1.add(v);
            list2.add(u);
            graph.put(u,list1);
            graph.put(v,list2);
        }
        int[] d1 = new int[n+1];
        int[] d2 = new int[n+1];
        Arrays.fill(d1,INF);
        Arrays.fill(d2,INF);
        d1[1]=0;
        Comparator<Stop> comp = Comparator.comparing(x->-1*x.time);
        PriorityQueue<Stop> pq = new PriorityQueue<>(comp);
        pq.add(new Stop(1,0));
        while(!pq.isEmpty()){
            Stop curr = pq.poll();
            if(curr.node==n && d2[n]!=INF){
                return d2[n];
            }
            int div = curr.time/change;
            int timePassed = curr.time;
            if(div%2==1){
                timePassed = (div+1)*change;
            }
            for(int neighbour : graph.get(curr.node)){
                if(d1[neighbour] > timePassed + time ){
                    d2[neighbour] = d1[neighbour];
                    d1[neighbour] = timePassed + time;
                    pq.add(new Stop(neighbour,timePassed + time));
                }
                else if((d2[neighbour]>timePassed+time)){
                    d2[neighbour] = timePassed + time;
                    pq.add(new Stop(neighbour,d1[neighbour]));
                }
            }
        }

        return -1;
    }

}
