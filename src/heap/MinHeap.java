package heap;

public class MinHeap {

    private int size = 1;
    private int capacity = 0;

    private int[] arr;

    public MinHeap(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity+1];
    }

    public void add(int num){
        if(size>capacity){
            System.out.println("Out of capacity");
            return;
        }
        arr[size] = num;
        int parent = size/2;
        int child = size;
        while(parent!=0 && arr[parent]>arr[child]){
            swap(parent,child);
            child = parent;
            parent = child/2;
        }
        size++;
    }

    public int delete(){
        if(size<=0){
            System.out.println("Heap is empty");
            return -1;
        }
        int result = arr[1];
        System.out.println(result);
        size--;
        arr[1] = arr[size];
        heapify(1);
        return result;
    }

    private void heapify(int index) {
        if(index>=size){
            return;
        }
        int left = 2*index;
        int right = 2*index + 1;
        int least = index;
        if(left>size && right>=size){
            return;
        }
        if(left<=size && arr[least]>arr[left]){
            least = left;
        }
        if(right<=size && arr[least]>arr[right]) {
            least = right;
        }
        if(index==least){
            return;
        }
        swap(index,least);
        heapify(least);
    }

    public int peek(){
        System.out.println(arr[1]);
       return arr[1];
    }

    public void print(){
        for(int i=1;i<size;i++){
            System.out.print(arr[i]+",");
        }
    }

    private void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
