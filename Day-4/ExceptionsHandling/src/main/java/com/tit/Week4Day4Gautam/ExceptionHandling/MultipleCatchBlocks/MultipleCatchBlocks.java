package com.tit.Week4Day4Gautam.ExceptionHandling.MultipleCatchBlocks;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try{
            //trying operations on array
            int[] arr = {1,2,3,4,5};
            //index
            int index = 9;
            System.out.println("Value at Index : "+ index +" is " + arr[index]);
        }
        //Handling exception when user provide index that is not present in array
        //in this program output will be Array index Out Of Bounds Exception with message Invalid index!
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
        //Handling exception when provided array is Null
        catch(NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }

}
