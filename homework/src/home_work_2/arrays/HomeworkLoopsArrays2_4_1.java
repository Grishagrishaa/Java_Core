/** Сумма четных положительных элементов массива
 В массиве, содержащем положительные и отрицательные целые числа, вычислить сумму
 четных положительных элементов.
 */
package home_work_2.arrays;

public class HomeworkLoopsArrays2_4_1 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10, 12};
        int count = 0;
        for(int i : array){
            boolean even = i % 2 == 0;
            boolean positive = i >= 0;
            if(even && positive){
                count++;
            }
        }
        System.out.println("Чисел подходящих условию - " +count);
    }
}
