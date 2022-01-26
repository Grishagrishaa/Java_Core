/**Ряд Фибоначчи
 Вывести на экран столько элементов ряда Фибоначчи, сколько указал пользователь.
 Например, если на ввод поступило число 6, то вывод должен содержать шесть первых чисел
 ряда Фибоначчи: 1 2 3 5 8 13.
        */


package loops;

import java.util.Scanner;

public class HomeworkLoops3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введи число:");
        int count = scn.nextInt();
        int n0 = 1, n1 = 1, n2 = 0;
        System.out.print(n2 +" " + n0 + " " + n1 + " ");
        for(int i = 1; i < count - 2; i++) {
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
    }
}
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987