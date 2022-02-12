/**2.2.1. Вывести все элементы в консоль.
 2.2.2. Вывести каждый второй элемент массива в консоль.
 2.2.3. Вывести все элементы массива в консоль в обратном порядке.
 */
package home_work_2.arrays;

import home_work_2.arrays.dto.IArraysOperation;

public class DoWhileOperation2_3 implements IArraysOperation {
    public static void main(String[] args) {
        int[] array = ArraysUtils2_1.arrayFromConsole();
        printArray(array);
        printEvenElements(array);
        printReverse(array);
    }

    public static void printArray(int[] array) {
        System.out.println("Весь массив");
        int i = 0;
        do{
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(", ");
            }
            i++;
        }while(i< array.length);
        System.out.println();
    }

    public static void printEvenElements(int[] array){
        System.out.println("Четные элементы");
        int i = 1;
        do{
            System.out.print(array[i]);
            if(i< array.length-2){
                System.out.print(", ");
            }
            i+=2;
        }while(i< array.length);
        System.out.println();
    }
    public static void printReverse(int[] array){
        System.out.println("Реверс");
        int i = array.length-1;
        do{
            System.out.print(array[i]);
            if(i>0){
                System.out.print(", ");
            }
            i-=1;

        }while(i>=0);
    }
}
