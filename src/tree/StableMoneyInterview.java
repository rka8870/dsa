package tree;

import java.util.*;

public class StableMoneyInterview {


   /* [
    {
        "name": "A",
            "dependencies": [
        "B",
                "C"
    ]
    },
    {
        "name": "B",
            "dependencies": [
        "C",
                "D"
    ]
    },
    {
        "name": "C",
            "dependencies": [
        "D"
    ]
    },
    {
        "name": "D",
            "dependencies": []
    }
]*/



    public class Dependency {

        String name;
        List<String> dependencies;

        public Dependency(String name, List<String> dependencies){
            this.name = name;
            this.dependencies = dependencies;
        }
    }


    public String[] getDependencyOrder(List<Dependency> dependencyList){

        Map<String, Integer> map = new HashMap<>();

        int node = 0;

        for(Dependency dependency : dependencyList) {
            map.put(dependency.name,node);
            node++;
        }

        for(Dependency dependency : dependencyList) {

        }
        return null;

    }





    private List<Integer> getExceutionOrder( int[][] edges, int n){


        Map<Integer,List<Integer>> graph = new HashMap<>();

        int[] noOfDependency = new int[n];

        List<Integer> order = new ArrayList<>();

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            List<Integer> list = graph.getOrDefault(v,new ArrayList<>());
            list.add(u);
            graph.put(v, list);
            noOfDependency[u]++;
        }

        int startNode = -1;
        for(int i=0;i<n;i++){
            if(noOfDependency[i]==0) {
                startNode = i;
                break;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);

        while(!queue.isEmpty()){
            int curr = queue.poll();
            order.add(curr);
            for(int neighbour : graph.getOrDefault(curr,new ArrayList<>())){
                noOfDependency[neighbour]--;
                if(noOfDependency[neighbour]==0){
                    queue.add(neighbour);
                }
            }
        }
        return order;

    }





    }
