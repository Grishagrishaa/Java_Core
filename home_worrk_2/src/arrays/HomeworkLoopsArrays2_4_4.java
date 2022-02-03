/**Найти два наименьших (минимальных) элемента массива
 В одномерном массиве целых чисел определить два наименьших элемента. Они могут быть
 как равны между собой (оба являться минимальными), так и различаться.
*/
package arrays;

import java.util.Arrays;

public class HomeworkLoopsArrays2_4_4 {
    public static void main(String[] args) {
        int[] array = {5,2,3,4,2,6,7,4,9,10,11,12};
        Arrays.sort(array);
        int lowest1 = array[0];
        System.out.println(lowest1);
        if(array.length>=2) {//в случае, если массив будет состоять более чем из одного элемента(предупреждение ошибки)
            int lowest2 = array[1];
            System.out.println(lowest2);
        }
    }
}
