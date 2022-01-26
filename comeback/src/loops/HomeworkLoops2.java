/**Посчитать четные и нечетные цифры числа
 Посчитать четные и нечетные цифры введенного натурального числа. Например, если
 введено число 34560, то у него 3 четные цифры (4, 6 и 0) и 2 нечетные (3 и 5).
        */


package loops;

import java.util.Scanner;

public class HomeworkLoops2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи число:");
        int answer = scan.nextInt();
        int even = 0, odd = 0;
        int lastDigit;
        while (answer>0){
            lastDigit = answer % 10;
            if(lastDigit % 2 ==0){
                even++;
            }else {
                odd++;
            }
            answer/=10;
        }
        System.out.println("Четных чисел - " + odd);
        System.out.println("Нечетных - " + even);
    }
}


