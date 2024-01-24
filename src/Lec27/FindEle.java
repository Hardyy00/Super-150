package Lec27;

public class FindEle {

    public static void main(String[] args) {

        int[] ar = {2,3,7,2,5,7,9,7};

        System.out.println(findEleForward(7,ar,0));
        System.out.println(findEleBackward(7,ar,ar.length-1));
    }

    private static int findEleForward(int ele ,int[] ar, int index){

        if(index==ar.length)
            return -1;

        if(ar[index]==ele)
            return index;

        return findEleForward(ele,ar,index+1);
    }

    private static int findEleBackward(int ele,int[] arr,int index){

        if(index==-1)
            return -1;

        if(arr[index]==ele)
            return index;

        return findEleBackward(ele,arr,index-1);
    }


}
