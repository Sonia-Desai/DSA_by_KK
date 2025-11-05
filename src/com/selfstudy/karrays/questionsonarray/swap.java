package com.selfstudy.karrays.questionsonarray;

public class swap {
    public static void main(String [] args){
        System.out.println("Program Start...");
        int [] nums = { 10 , 20 , 30 , 40 , 50};
        Demo d = new Demo();
        d.test(nums);

        System.out.println("Program Ends...");

    }
}
 class Demo{
    public void test(int [] arr){
        printArray(arr);
        int temp = arr[0];
        int last = arr.length - 1;
        arr[0] = arr[last];
        arr[last] = temp;

        printArray(arr);

    }

    public void printArray(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(






        );
    }


}
