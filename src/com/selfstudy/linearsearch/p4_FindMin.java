package com.selfstudy.linearsearch;
//Find the MIn element
public class p4_FindMin {
    static void main(String[] args) {
        int [] arr = {10,20,30,-7,40,2,1,-17};
        int result = findMin(arr);
        System.out.println(result);

    }
    public static int findMin(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        int ans=arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }

        return ans;
    }
}
