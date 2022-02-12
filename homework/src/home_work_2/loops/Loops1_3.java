/**Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить,
 Второе число это степень в которую возводят первое число.Возводимое число - может быть отрицательным и оно будет дробным.
 Степень - только положительная и целая. Math использовать нельзя.*/

package home_work_2.loops;

import java.util.Scanner;

public class Loops1_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ans = scn.next();
        String answ = scn.next();
        double value = num1Checker(ans);
        int powValue = num2Checker(answ);
        double product = 1;
        for (int i = 1; i <= powValue; i++) {
            product = product * value;
        }
        System.out.print(value + " ^ " + powValue + " = " + product);
    }

    public static double num1Checker(String ans) {
        try {
            Double.parseDouble(ans);
        } catch (Exception e) {
            System.out.println("String");
            System.exit(0);
        }
        double a = Double.parseDouble(ans);
        return a;
    }

    public static int num2Checker(String answ) {
        try {
            Integer.parseInt(answ);
        } catch (Exception e) {
            System.out.println("String");
            System.exit(0);
        }
        if (Integer.parseInt(answ)<0){
            System.exit(0);
        }
        int b = Integer.parseInt(answ);
        return b;
    }
}