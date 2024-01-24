package Lec41;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int largestRectangleArea(int[] heights) {

        return largestArea(heights);
    }

    private static int largestArea(int[] heights){

        Deque<Integer> stack = new ArrayDeque<>();
        int maxArea = Integer.MIN_VALUE;

        // here an element is removed because of its next smaller element and below this element lies its previous smaller element so we can calculate the length of rectangle

        for(int i=0;i<heights.length;i++){

            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){

                int currBar = stack.pop();      // index of bar for the area has to be cal..
//                int len = stack.isEmpty() ? i: (i-stack.peek()-1);
//                int area = len * heights[currBar];
//                maxArea = Math.max(maxArea,area);
                if(stack.pop()>=stack.peek()+1 && stack.pop()<=i-1){
                    maxArea = Math.max(maxArea,heights[currBar]*(i-1 +stack.peek()+1+1));
                }

            }

            stack.push(i);
        }

        // elements for which there is no next smaller element
        while(!stack.isEmpty()){

            int currBar = stack.pop();
            int len = stack.isEmpty() ? heights.length : (heights.length-stack.peek()-1);
            int area = len * heights[currBar];
            maxArea = Math.max(maxArea,area);
        }

        return maxArea;
    }

    // private static int largestArea(int[] heights){

    //     int[] previousSmallerElements = new int[heights.length];
    //     int[] nextSmallerElements = new int[heights.length];
    //     Deque<Integer> stack = new ArrayDeque<>();

    //     for(int i=0;i<heights.length;i++){
    //         while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
    //             stack.pop();
    //         }

    //         previousSmallerElements[i] = stack.isEmpty() ? -1 : stack.peek();

    //         stack.push(i);
    //     }

    //     stack.clear();

    //     for(int i=heights.length-1;i>=0;i--){

    //         while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
    //             stack.pop();
    //         }

    //         nextSmallerElements[i] = stack.isEmpty() ?  heights.length : stack.peek();

    //         stack.push(i);
    //     }

    //     int maxArea = Integer.MIN_VALUE;

    //     for(int i=0;i<heights.length;i++){

    //         int area = heights[i];
    //         area += (i-previousSmallerElements[i]-1) * heights[i];
    //         area += (nextSmallerElements[i]-i-1) * heights[i];

    //         maxArea = Math.max(maxArea,area);
    //     }

    //     return maxArea;
    // }
}
