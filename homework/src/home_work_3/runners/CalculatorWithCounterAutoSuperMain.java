package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        float total =  calculator.addition(4.1f,calculator.multiplication(15,7),calculator.exponentiation(calculator.division(28,5),2));
        System.out.println(total);
        System.out.println("Циклов использования  - " + calculator.getCountOperation());
    }
}
