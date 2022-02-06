package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithOperator());

        System.out.println("Первая операция");
        System.out.println(calculator.addition(4.1f, calculator.multiplication(15, 7), calculator.exponentiation(calculator.division(28, 5), 2)));
        calculator.saveMemory();//Результат сохраняем!

        System.out.println("Вторая операция");
        System.out.println(calculator.addition(4.4f, calculator.multiplication(15, 7), calculator.exponentiation(calculator.division(28, 5), 2)));
        System.out.println("Сохраненный результат - " + calculator.getMemory());//Получаем сохраненный результат//При повторном использовании этого метода результат стирается

        calculator.getMemory();//Стираем
        System.out.println("Сохраненный результат - " + calculator.getMemory());//Память очищена
    }
}