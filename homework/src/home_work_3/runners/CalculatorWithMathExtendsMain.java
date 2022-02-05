package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        float total =  calculator.addition(4.1f,calculator.multiplication(15,7),calculator.exponentiation(calculator.division(28,5),2));
        System.out.println(total);
    }
}
