public class MyHeap{
  public static void main(String[] args){
    int[] a = {1,2,3,4,5,6,7,8};
    HeapPrinter.print(a);
    heapify(a);
    HeapPrinter.print(a);
  }
  private static void pushDown(int[] data,int size, int index){
    int cur=index;
    int left=2*cur+1;
    int right=2*cur+2;
    int temp;
    while(left<size){
      //add out of bounds checking
      if(right<size){
        if(data[cur]>=Math.max(data[left],data[right])){
          return;
        }
        if(data[left]<=data[right]){
          temp = data[cur];
          data[cur]=data[right];
          data[right]=temp;
          cur=right;
        }
        else{
          temp=data[cur];
          data[cur]=data[left];
          data[left]=temp;
          cur=left;
        }
      }
      else{
        if(data[cur]>=data[left]){
          return;
        }
        else{
          temp=data[cur];
          data[cur]=data[left];
          data[left]=temp;
          cur=left;
        }
      }
      left=2*cur+1;
      right=2*cur+2;
    }
  }
  private static void pushUp(int[] data, int index){

  }
  public static void heapify(int[] data){
    for(int i=data.length-1;i>-1;i--){
      pushDown(data,data.length,i);
    }
  }
  public static void heapsort(int[] data){

  }
}
