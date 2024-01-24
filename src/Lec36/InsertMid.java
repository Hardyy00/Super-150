package Lec36;

public class InsertMid {

    // partition of array
    public static void main(String[] args) {

        int[] arr = {5,7,2,3,8,9,1,4};
        int ans = insertAtMid(arr,0,arr.length-1);
        System.out.println(ans);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    // left side ele should be smaller and right side should be greater
    private static int insertAtMid(int[] arr,int si,int ei){

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
