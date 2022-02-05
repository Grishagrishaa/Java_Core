package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
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
