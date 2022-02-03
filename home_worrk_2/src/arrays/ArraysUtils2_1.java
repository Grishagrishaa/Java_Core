/**2.1. Создать класс ArraysUtils. В этом классе написать следующие методы:
 2.1.1. Написать метод public static int[] arrayFromConsole() рядом с main. Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
 2.1.1.1. Пример int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole будет запрошена информация у пользователя,
 пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}. Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.
 2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main.
 Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
 Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
 2.1.2.1. Пример: int[] container = arrayRandom(5, 100). Результат:
 В методе arrayRandom будет создан массив размером 5 с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.
*/
 package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtils2_1 {
    public static void main(String[] args) {
        int[] container= arrayFromConsole();
        System.out.println("Literal" + Arrays.toString(container));
        int[] containerRandom = arrayRandom(3, 50);
        System.out.println("Random" + Arrays.toString(containerRandom));
    }
    public static int[] arrayFromConsole(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Input array length:");
        int length = scn.nextInt();
        int[] array = new int[length];
        System.out.print("Input elements: ");
        for (int i = 0; i < length ; i++) {
         array[i] = scn.nextInt();
     }
        return array;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion){
        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size ; i++) {
            array[i] = rnd.nextInt(maxValueExclusion);
        }
        return array;
    }
}
