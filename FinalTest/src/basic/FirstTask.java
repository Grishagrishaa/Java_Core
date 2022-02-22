package basic;
/*Суть: Создать два статических метода и вызвать их в main
        Задача:
        1. Создать метод, принимающий три целочисленных числа А, В и С.
        Если А больше В и С то вернуть сумму чисел А и С, иначе вернуть число В.
        2. Создать метод, принимающий три целочисленных числа А, В, С
        возвращающий среднее арифметической А, В, С.
        3. Распечатать в консоль результаты*/
public class FirstTask {
    public static void main(String[] args) {
        System.out.println(FirstTask.compareNumbers(81,3,45));
        System.out.println(FirstTask.arithmeticMean(2,3,45));
    }
    public static int compareNumbers(int a, int b, int c){
        if(a>b && a>c){
            return a + c;
        }
        return b;
    }

    public static double arithmeticMean(double a, double b, double c){
        return (a + b + c)/3;
    }
}
