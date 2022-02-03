package utils;

import java.util.Arrays;

public class Sorts4_1 {
    public static void main(String[] args) {
        int[] a = {10,9,8,7,6,5,4,3,2,1,54,64,2,5,754,47,86,1,414,4567,75,7,0};
        shake(a);
        bubble(a);

    }
    public static void bubble(int[] arr){
        for (int i = arr.length-1; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if(arr[j]>arr[j+1]){
                    int c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=c;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void shake(int[] arr2){
        int left = 0, right = arr2.length-1;
        int onOff = 1;
        while(left<right && onOff>0){
            onOff = 0;
            for (int i = left; i < right; i++) {
                if(arr2[i]>arr2[i+1]){
                    int c = arr2[i];
                    arr2[i]= arr2[i+1];
                    arr2[i+1]= c;
                    onOff = 1;
                }
            }
            right--;
            for (int i = right; i >left ; i--) {
                if(arr2[i-1]>arr2[i]){
                    int c = arr2[i];
                    arr2[i]= arr2[i-1];
                    arr2[i-1] = c;
                    onOff = 1;
                }
            }
            left++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}