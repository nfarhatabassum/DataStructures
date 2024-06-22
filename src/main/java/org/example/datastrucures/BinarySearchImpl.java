package org.example.datastrucures;

public class BinarySearchImpl {
    public static void main(String[] args) {
        int[] inputData = {-22,-15,1,7,20,25,30};
        System.out.println(recursiveBinarySearch(inputData,0,inputData.length,20));

    }
    //Iterative Approach
    //Recursive Approach
    public static int recursiveBinarySearch(int[] input,int start,int end,int value){
        if(start >= end){
            return -1;
        }
        int midpoint = (start+end)/2;
        System.out.println("mid point "+midpoint);
        if(input[midpoint]==value){
            return midpoint;
        }
        else if(input[midpoint]<value){
          return recursiveBinarySearch(input,midpoint+1,end,value);
        }
        else{
            return recursiveBinarySearch(input,start,midpoint,value);
        }
    }

}
