package ownCode.sort;

public class Code1_QuickSort {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,2,3,4,10,12,11};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    private static void quickSort(int[] arr, int l, int r) {
        if(l>r)
            return;
        int rand = (int) Math.random() * (r - l)+l;
        swap(arr,l,rand);
        int par=getPartion(arr,l,r);
        quickSort(arr, l, par-1);
        quickSort(arr, par+1, r);

    }

    private static int getPartion(int[] arr, int l, int r) {
        int index=l;
        int temp=arr[l];
//        l++;
        while(l<r){
            while(arr[r]>=temp&&l<r)
                r--;
            while(arr[l]<=temp&&l<r)
                l++;
            if(l<r)
                swap(arr, l, r);
        }
            swap(arr, l, index);
        return l;

    }

    private static void swap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


}
