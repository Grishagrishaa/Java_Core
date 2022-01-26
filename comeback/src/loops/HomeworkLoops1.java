/**Вероятность честных случайных чисел
 Проверить корректность работы генератора псевдослучайныx чисел языка
 программирования с помощью оценки вероятности выпадения четных чисел на выборке не
 меньше 1000 случайных чисел.
        */


package loops;

import java.util.Random;

public class HomeworkLoops1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        float count = 10000;
        float countEven = 0;
        int probability;
        for (int i = 0; i < count; i++){
            int number = rnd.nextInt();
            if(i % 2 == 0){
                countEven++;
            }
        }
        probability = Math.round((countEven/count)*100);
        System.out.println(countEven);
        System.out.println(count);
        System.out.println("Процент выпадения четного числа = " + probability + "%" );
    }
}

