package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    private List<List<Integer>> result;

    public List<List<Integer>> subsequence(int[] arr){
        result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            List<Integer> list = new ArrayList<>();
            list.add(arr[i]);
            solver(arr,i+1,list);
        }
        result.forEach(res -> System.out.println(res));
        return result;
    }

    private void solver(int[] arr, int i, List<Integer> list) {
        if(i>=arr.length){
            result.add(list);
            return;
        }
        solver(arr,i+1,new ArrayList<>(list));
        list.add(arr[i]);
        solver(arr,i+1,new ArrayList<>(list));
    }

}
