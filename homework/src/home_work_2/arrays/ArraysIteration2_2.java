/**2.2 Создать класс ArraysIteration. В этом клссе написать перебор массива при помощи do....while, while, for, foreach.
 * Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив. Все задачи в одном классе, в отдельных методах.
 * Должно получиться 3 метода:
 2.2.1. Вывести все элементы в консоль.
 2.2.2. Вывести каждый второй элемент массива в консоль.
 2.2.3. Вывести все элементы массива в консоль в обратном порядке.
*/
 package home_work_2.arrays;

public class ArraysIteration2_2  {
    public static void main(String[] args) {
        int[] array = ArraysUtils2_1.arrayFromConsole();
        printArray(array);
        printEvenElements(array);
        printReverse(array);
    }
    public static void printArray(int []array){
        for (int i : array) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
    public static void printEvenElements(int []array){
        for (int i = 1; i < array.length; i = i + 2) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
    public static void printReverse(int []array){
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}
