/**Максимальный из элементов массива с четными индексами
 В массиве найти максимальный элемент с четным индексом.
 Другая формулировка задачи: среди элементов массива с четными индексами, найти тот,
 который имеет максимальное значение.*/

package arrays;

public class HomeworkLoopsArrays7 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int length = array.length;
        int value = 0, maxValue = 0;
        for(int i = 0; i <= length-1; i++){
            i++;
            value = array[i];
            if(value>maxValue){
                maxValue = value;
            }
        }
        System.out.println(maxValue);
    }
}
