package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        System.out.println(calculator.addition(4.1f,calculator.multiplication(15,7),calculator.exponentiation(calculator.division(28,5),2)));
        System.out.println("Циклов использования - " +calculator.getCountOperation());
    }
}