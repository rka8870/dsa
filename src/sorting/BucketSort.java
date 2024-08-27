package sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BucketSort {

    public int[] getMostFrequentElement(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<List<Integer>> list = new ArrayList<>(1000);
        list.add(0,null);
        for(int key:map.keySet()){
            if(list.size()> map.get(key)){
                list.get(map.get(key)).add(key);
            } else {
                List<Integer> newList = new ArrayList<>();
                newList.add(key);
                list.add(map.get(key),newList);
            }
        }
        List<Integer> an = new ArrayList<>();
        for(int i=list.size()-1;i>=0 && k>0 ;i--,k--){
            an.addAll(list.get(i));
        }
        ans = an.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }

}
