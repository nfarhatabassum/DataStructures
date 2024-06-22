package org.example.datastrucures;

public class LinearSerachImpl {
    public static void main(String[] args) {
        int[] data = {20,15,-15,7,55,1,-22};
        System.out.println("Found "+linearSearch(data,7));
        System.out.println("Found "+linearSearch(data,17));
    }
    public static int linearSearch(int[] arrayInput,int value){
        for(int i=0;i<arrayInput.length;i++){
            if(arrayInput[i] == value){
                return i;
            }
        }
        return -1;
    }
}
