package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoComposite implements ICalculator {
    private CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();

    private long countOperation;

    private void incrementCountOperation(){
        ++countOperation;
    }

    public long getCountOperation(){
        return countOperation;
    }

    @Override
    public float division(float dividend, float divisor) {
        incrementCountOperation();
        return calculator.division(dividend,divisor);
    }

    @Override
    public float multiplication(float multiplier1, float multiplier2) {
        incrementCountOperation();
        return calculator.multiplication(multiplier1,multiplier2);
    }

    @Override
    public float addition(float... nums) {
        incrementCountOperation();
        return calculator.addition(nums);
    }

    @Override
    public float exponentiation(float num, int degree) {
        incrementCountOperation();
        return calculator.exponentiation(num,degree);
    }

    @Override
    public float abs(int number) {
        incrementCountOperation();
        return calculator.abs(number);
    }

    @Override
    public float root(int rootMeaning) {
        incrementCountOperation();
        return calculator.root(rootMeaning);
    }
}
