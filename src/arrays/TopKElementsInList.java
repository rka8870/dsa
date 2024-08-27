package arrays;

import java.util.*;

public class TopKElementsInList {
    public class Element{
        int num;
        int count;
        public Element(int num,int count){
            this.num = num;
            this.count = count;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            } else {
                map.put(num,1);
            }
        }
        Comparator<Element> comp = Comparator.comparing(x->-1*x.count);
        PriorityQueue<Element> pQueue = new PriorityQueue<Element>(comp);
        for(int num : map.keySet()){
            pQueue.add(new Element(num,map.get(num)));
        }
        int[] ans = new int[k];
        int j = 0;
        while(j<k && !pQueue.isEmpty()){
            ans[j] = pQueue.poll().num;
            j++;
        }
        return ans;
    }
}
