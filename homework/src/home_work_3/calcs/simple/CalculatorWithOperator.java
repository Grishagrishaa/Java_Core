package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    public float division(float dividend, float divisor) {
        return dividend / divisor;
    }

    public float multiplication(float multiplier1, float multiplier2) {
        return multiplier1 * multiplier2;
    }
    public float difference(float subtrahend, float minuend) {
        return subtrahend - minuend;
    }

    public float addition(float...nums) {
        float total=0;
        for (float num : nums) {
            total += num;
        }
        return total;
    }

    public  float exponentiation(float num, int degree) {
        int absDegree = (degree < 0 ? -degree : degree);
        if(num>0){
            for (int i = 0; i < absDegree-1; i++) {//Цикл определяет количество умножений числа на самого себя
                num*=num;
            }
            if(degree<0){
                num = 1 / num;
            }
        }
        return num;
    }

    public float abs(int number){
        return (number < 0 ? -number : number);
    }

    public float root(int rootMeaning){
        float root=1;
        for (int i = 0;i < rootMeaning ; i++) {
            if(exponentiation(i,2) == rootMeaning){
                root = i;
                break;
            }
        }
            return root;

    }
}