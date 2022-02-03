package arrays;

import arrays.dto.IArraysOperation;

public class ForOperation2_3 implements IArraysOperation {
    public static void main(String[] args) {
        int[] array = ArraysUtils2_1.arrayFromConsole();
        printArray(array);
        printEvenElements(array);
        printReverse(array);
    }
    public static void printArray(int[] array) {
        System.out.println("Весь массив");
        for (int i = 0; i<array.length; i++) {
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printEvenElements(int[] array){
        System.out.println("Четные элементы");
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i]);
            if(i< array.length-2){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printReverse(int[] array){
        System.out.println("Реверс");
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i]);
            if(i>0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
