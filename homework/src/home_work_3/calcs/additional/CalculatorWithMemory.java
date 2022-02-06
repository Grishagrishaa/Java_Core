package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory implements ICalculator {
    ICalculator calculator;
    private float ram;
    private float rom;


    public CalculatorWithMemory(ICalculator calculator){
        this.calculator = calculator;
    }

    public void saveMemory(){
        rom =ram ;
    }

    public float getMemory(){
        ram = rom;
        rom = 0;
        return ram;
    }

    @Override
    public float division(float dividend, float divisor) {
        ram = calculator.division(dividend, divisor);
        return calculator.division(dividend, divisor);
    }

    @Override
    public float multiplication(float multiplier1, float multiplier2) {
        ram = calculator.multiplication(multiplier1, multiplier2);
        return ram;
    }

    @Override
    public float addition(float... nums) {
        ram = calculator.addition(nums);
        return ram;
    }

    @Override
    public float exponentiation(float num, int degree) {
        ram = calculator.exponentiation(num, degree);
        return ram;
    }

    @Override
    public float abs(int number) {
        ram = calculator.abs(number);
        return ram;
    }

    @Override
    public float root(int rootMeaning) {
        ram = calculator.root(rootMeaning);
        return ram;
    }
}
