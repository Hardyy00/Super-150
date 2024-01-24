package Lec36;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {5,7,2,3,8,9,1,4};
        quickSort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }

    private static void quickSort(int[] arr,int si,int ei){

        if(si>=ei){
            return;
        }

        int pi = insertAtMid(arr,si,ei);
        quickSort(arr,si,pi-1);
        quickSort(arr,pi+1,ei);
    }

    private static  int insertAtMid(int[] arr,int si,int ei){

        int item = arr[ei];
        int pi = si;

        for(int i=si;i<ei;i++){

            if(arr[i]<item){
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }
        }

        int temp = arr[pi];
        arr[pi] = arr[ei];
        arr[ei] = temp;

        return pi;

    }
}
