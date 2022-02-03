package arrays;

import arrays.dto.IArraysOperation;

public class ForEachOperation2_3 implements IArraysOperation {
    public static void main(String[] args) {
        int[] array = ArraysUtils2_1.arrayFromConsole();
        //printArray(array);
        //printEvenElements(array);
        printReverse(array);
    }


    public static void printArray(int []array){
        int iteration = 0;
        for (int i : array) {
            System.out.print(i);
            if(iteration < array.length - 1){
                System.out.print(", ");
            }
            iteration++;
        }
        System.out.println();
    }

    public static void printEvenElements(int []array){
        int iteration = 0;
        for (int i : array) {
            if(iteration % 2 != 0){
                System.out.print(i);
                if(iteration < array.length-2){
                    System.out.print(", ");
                }
            }
            iteration++;
        }
        System.out.println();
    }

    public static void printReverse(int[] array){
        int lastIndex = array.length-1;
        for (int i : array) {
            int iteration1 = 0;
                for (int j :array) {
                    if(iteration1 == lastIndex){
                        System.out.print(array[iteration1]);
                        if(lastIndex > 0){
                            System.out.print(", ");
                        }
                        lastIndex--;
                    }

                    iteration1++;
                }
        }
        System.out.println();
    }
}
