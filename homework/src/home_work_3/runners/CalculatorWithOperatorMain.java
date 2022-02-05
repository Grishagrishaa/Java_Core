package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();//4.1 + 15 * 7 + (28 / 5) ^ 2.
        float total =  calc.addition(4.1f,calc.multiplication(15,7),calc.exponentiation(calc.division(28,5),2));
        System.out.println(total);
    }
}
