package arrays;

import arrays.dto.IArraysOperation;

public class WhileOperation2_3 implements IArraysOperation {
    public static void main(String[] args) {
        int[] array = ArraysUtils2_1.arrayFromConsole();
        printArray(array);
        printEvenElements(array);
        printReverse(array);
    }


    public static void printArray(int[] array) {
        int i = 0;
        while (i<array.length){
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(", ");
            }
            i++;
        }
        System.out.println();
    }

    public static void printEvenElements(int[] array){
        int i = 1;
        while (i<array.length){
            System.out.print(array[i]);
            if(i<array.length-2){
                System.out.print(", ");
            }
            i = i +2;
        }
        System.out.println();
    }

    public static void printReverse(int[] array){
        int i = array.length-1;
            while (i>=0){
                System.out.print(array[i]);
                if(i>0){
                    System.out.print(", ");
                }
                i--;
        }
        System.out.println();
    }
}
