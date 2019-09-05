package ownCode.sort;

public class Code2_HeaoSort {
    public static void main(String[] args) {
        int[] arr={1,3,7,5,3,2,1,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            heapify(i,arr);
        }
        int size=arr.length;
        while(size>0){

            heapInsert(arr,--size);
            swap(arr, size, 0);

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void heapInsert(int[] arr, int size) {
        int index=0;
        int l=2*index+1;
        int max;
        while(l<size){
            l=l+1<index||arr[l]>arr[l+1]?l :l+1;
            max=arr[index]>arr[l]?index:l;
            if(max==index)
                break;
            else
            {
                swap(arr,index ,max );
                index=max;
                l=2*index+1;
            }
        }

    }

    private static void heapify(int index, int[] arr) {
        while(arr[index]>arr[(index-1)/2]){
            swap(arr,index,(index-1)/2);
            index=(index-1)/2;
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
