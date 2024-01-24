package Lec36;

public class Merge2SortedArray {

    private static int[] MergeArrays(int[] num1, int[] num2){

        int i=0;
        int j =0;
        int nums[] = new int[num1.length + num2.length];
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

        int[] num1 = {2,5,9,11,15};
        int[] num2 = {1,5,8,12,15,17};
        int[] num =  MergeArrays(num1,num2);



        for(int i : num){
            System.out.print(i + " ");
        }
    }
}
