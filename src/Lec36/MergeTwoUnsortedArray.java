package Lec36;

public class MergeTwoUnsortedArray {

    public static int[] merge(int[] arr,int si,int ei){

        if(si==ei){
            int[] small = new int[]{arr[si]};
            return small;
        }

        int mid = (si+ei)/2;

        int[] fa = merge(arr,si,mid);
        int[] sa = merge(arr,mid+1,ei);

        return mergeArrays(fa,sa);
    }


    private static int[] mergeArrays(int[] num1, int[] num2){

        int i=0;
        int j =0;
        int[] nums = new int[num1.length + num2.length];
        int index = 0;


        while (i<num1.length && j<num2.length){

            if(num1[i]<num2[j]){
                nums[index++] = num1[i];
                i++;
            }else if(num1[i]>num2[j]){
                nums[index++] = num2[j];
                j++;
            }else{
                nums[index++] = num1[i];
                nums[index++] = num2[j];
                i++;
                j++;
            }
        }

        while(i<num1.length){
            nums[index++] = num1[i++];
        }

        while(j<num2.length){
            nums[index++] = num2[j++];
        }

        return nums;

    }

    public static void main(String[] args) {
        int[] arr = {2,9,1,7,5,11,4,3,2};

        int[] sorted = merge(arr,0, arr.length-1);
        for(int i : sorted){
            System.out.print(i + " ");
        }
    }

}
