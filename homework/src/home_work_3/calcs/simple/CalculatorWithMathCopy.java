package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
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

    public float exponentiation(float num, int degree) {
        return (float)Math.pow(num, degree);
    }

    public float abs(int number){
        return Math.abs(number);
    }

    public float root(int rootMeaning){
        return (float) Math.cbrt(rootMeaning);
    }

}
