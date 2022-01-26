/**Вывести ряд чисел в диапазоне с шагом
 Вывести на экран ряд натуральных чисел от минимума до максимума с шагом. Напримеp,
 если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
 Минимум, максимум и шаг указываются пользователем (считываются с клавиатуры).
        */


package loops;

import java.util.Scanner;

public class HomeworkLoops4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите минимум:");
        int start = scn.nextInt();
        System.out.println("Введите шаг:");
        int step = scn.nextInt();
        System.out.println("Введите максимум:");
        int end = scn.nextInt();
        while(start <= end){
            System.out.print(start + " ");
            start = start + step;
        }
    }
}
