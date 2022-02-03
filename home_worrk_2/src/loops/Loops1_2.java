/**1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
 1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
 1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число*/

package loops;

import java.util.Scanner;

public class Loops1_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input a number:");
        int answer = 0, product = 1;
            answer = numChecker(scn.next());
        int length = findNumberLength(answer);
        while(length>0) {
            int digit = answer;
            digit = answer/pow(10, length-1);
            answer= answer % pow(10, length-1);
            System.out.print(digit);
            if(length>1){
                System.out.print(" * ");
            }else{
                System.out.print(" = ");
            }
            product *=digit;
            length--;
        }
        System.out.println(product);
    }


    public static Integer findNumberLength(int a){//Находим количество цифр числа
        int counter = 0;
        while(a!=0){
            a =a/10;
            counter++;
        }
        return counter;
    }


    public static int pow(int value, int powValue) {// Через Math была проблема приведения типов, сделал свой метод
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }
    public static int numChecker(String num){
        int x = 0;
        try {
            Double.parseDouble(num);
        }
        catch (Exception e) {
            System.out.println("Не число");
            System.exit(0);
        }
        try {
            x = Integer.parseInt(num);
        }
        catch (Exception e) {
            System.out.println("Дробное");
            System.exit(0);
        }
        return x;
    }
}
