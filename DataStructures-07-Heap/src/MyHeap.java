public class MyHeap {
    private final int [] heap=new int[20];
    private int size;
    private int parent (int index){ return (index-1)/2;}
    public boolean isFull(){return size==heap.length;}

    public void insert (int value){
        if(isFull()) throw new IllegalStateException();
        heap[size++]=value;
        bubbleUp();
    }
    public void bubbleUp(){
    int childIndex=size-1;
    while (childIndex>0 && heap[childIndex]>heap[parent(childIndex)]) {
        swap(childIndex, parent(childIndex));
        childIndex=parent(childIndex);
    }
    }
    private void swap(int first, int second) {
        int temp=heap[first];
        heap[first]=heap[second];
        heap[second]=temp;
    }
    public void print(){
        for(int i=0;i<size;i++) System.out.print(heap[i]+", ");
    }
}
