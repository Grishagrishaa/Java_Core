/**Переворот числа
 Сформировать из введенного числа обратное по порядку входящих в него цифр и вывести на
 экран. Например, если введено число 3486, то надо вывести число 6843.
        */
package loops;

import java.util.Scanner;

public class HomeworkLoops5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("ВВеди число:");
        int answer = scn.nextInt();
        int length = HomeworkLoops5.diigitLength(answer);
        int newNumber = 0, partNumber = 0;
        while (answer != 0){
            //number >= 0 ? partNumber = 1 : False ;
            partNumber = (int) ((answer % 10) * Math.pow(10, length - 1));
            newNumber = newNumber + partNumber;
            answer /= 10;
            length--;
        }
        System.out.println(newNumber);
    }
public static int diigitLength(int answer){
    int count = 0;
    while(answer != 0){
         answer /= 10;
         count++;
        }
    return count;
    }
}
