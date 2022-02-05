package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {
    private long countOperation;
    ICalculator calculator;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator){
        this.calculator = calculator;
    }

    public long getCountOperation() {
        return countOperation;
    }

    @Override
    public float division(float dividend, float divisor) {
        ++countOperation;
        return calculator.division(dividend,divisor);
    }

    @Override
    public float multiplication(float multiplier1, float multiplier2) {
        ++countOperation;
        return calculator.multiplication(multiplier1,multiplier2);
    }

    @Override
    public float addition(float... nums) {
        ++countOperation;
        return calculator.addition(nums);
    }

    @Override
    public float exponentiation(float num, int degree) {
        ++countOperation;
        return calculator.exponentiation(num,degree);
    }

    @Override
    public float abs(int number) {
        ++countOperation;
        return calculator.abs(number);
    }

    @Override
    public float root(int rootMeaning) {
        ++countOperation;
        return calculator.root(rootMeaning);
    }
}
