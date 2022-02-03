/**Сумма цифр массива
 Найти сумму всех цифр целочисленного массива. Например, если дан массив [12, 104, 81], то
 сумма всех его цифр будет равна 1 + 2 + 1 + 0 + 4 + 8 + 1 = 17.*/
package arrays;

public class HomeworkLoopsArrays2_4_6 {
    public static void main(String[] args) {
        int[] array = {12,104,81};
        int num = 0,sum = 0;
        int count=0;
        for (int i : array) {// считаем количество чисел
            num = i;
            while(num !=0){
                num /=10;
                count++;
            }
            for(int j = count; j>0;j--){//делим число на части, в зависимости от количества символов
                sum = sum + i%10;
                i/=10;
            }
        }
        System.out.println(sum);
    }
}
