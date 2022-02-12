/**Сжать массив, удалив элементы, принадлежащие интервалу
 Сжать массив, удалив из него все элементы, величина которых находится в интервале [a, b].
 Освободившиеся в конце массива элементы заполнить нулями.*/
package home_work_2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkLoopsArrays2_4_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Начало интервала(индекс):");
        int from = scn.nextInt();
        System.out.println("Конец интервала(индекс):");
        int to = scn.nextInt();
        int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
        int a;
        for(int i = from; i <= to; i++) {
            array[i] = 0;
        }
        //Arrays.sort(array, from, to); Тогда нолики в начале(по возрастанию)
        for(int f = array.length-1; f > 0; f--){//по убыванию, чтобы нолики в конце
            for(int j = 0; j<f; j++){
                if(array[j]<array[j+1]){
                    a =array[j+1] ;
                    array[j+1]=array[j];
                    array[j]=a;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
