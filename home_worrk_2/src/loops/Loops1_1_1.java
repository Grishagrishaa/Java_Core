/**1. Циклы. Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint,
 * если хотите можете добавить проверки на корректность ввода данных. Число положительное, максимум long:
 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
 Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
 1.1.1. Используя только цикл
 1.1.2.* Используя рекурсию*/
package loops;

public class Loops1_1_1 {
    public static void main(String[] args) {
        int answer = Integer.parseInt(args[0]);
        if(answer>65){
            System.out.println("Аргумент слишком велик");
            System.exit(0);
        }
        long multiplier = 1;
        for(int i = 1; i <= answer; i++) {
            multiplier *= i;
            System.out.print(i);
            if (i != answer) {
                System.out.print(" * ");
            } else {
                System.out.print(" = ");
            }
        }
        System.out.println(multiplier);
    }

}
    /**
    public static Integer checkNumber(int n){
        System.out.println("Число слишком большое, введите меньше:");
        Scanner scn = new Scanner(System.in);
        int answ = scn.nextInt();
        if(answ>10){
            checkNumber(n);
        }
        return answ;

    }*/

