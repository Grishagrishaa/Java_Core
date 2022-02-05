package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        float step1 = calc.division(28,5);
        calc.incrementCountOperation();

        float step2 = calc.exponentiation(step1,2);
        calc.incrementCountOperation();

        float step3 = calc.multiplication(15,7);
        calc.incrementCountOperation();

        float step4 = calc.addition(4.1f, step3,step2);
        calc.incrementCountOperation();

        System.out.println("Циклов использования - " + calc.getCountOperation());
        System.out.println(step4);
    }
}
