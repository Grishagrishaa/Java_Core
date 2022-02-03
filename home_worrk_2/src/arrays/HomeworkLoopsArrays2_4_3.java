/** Элементы массива, которые меньше среднего арифметического
 Найти в массиве те элементы, значение которых меньше среднего арифметического, взятого
 от всех элементов массива.
 */
package arrays;

public class HomeworkLoopsArrays2_4_3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        double average = HomeworkLoopsArrays2_4_3.average(array);
        System.out.println(average + " - Среднее арифметическое");
        for (int i : array) {
            if(i<average){
                System.out.println(i + " - Меньше среднего арифметического ");
            }
        }
    }

    public static Double average(int[] array){
        double  sum =0, average = 0;
        for (int j : array) {
        sum = sum + j;
        }
        average = sum / array.length;
        return average;
    }
}