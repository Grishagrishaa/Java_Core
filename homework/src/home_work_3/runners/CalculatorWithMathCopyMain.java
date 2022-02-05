package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc1 = new CalculatorWithMathCopy();//4.1 + 15 * 7 + (28 / 5) ^ 2.
        float total =  calc1.addition(4.1f,calc1.multiplication(15,7),calc1.exponentiation(calc1.division(28,5),2));
        System.out.println(total);
    }
}
