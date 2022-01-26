/**Найти наибольшую цифру натурального числа
        С клавиатуры вводится натуральное число. Найти его наибольшую цифру.
        Например, введено число 764580. Наибольшая цифра в нем 8.
        */


package loops;

import java.util.Scanner;

public class HomeworkLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи число:");
        int answer = scan.nextInt();
        int digit;
        int maxDigit = 0;
        int countmaxDigit = 0;
        while (answer>0){
            digit = answer % 10;
            answer/=10;
            if(digit > maxDigit){
                maxDigit = digit;
                countmaxDigit = 1;
            }else if(maxDigit == digit){
                countmaxDigit++;
            }
        }
        System.out.println("Максимальное число " + maxDigit);
        System.out.println("Встретилось раз - " + countmaxDigit);
    }
}
