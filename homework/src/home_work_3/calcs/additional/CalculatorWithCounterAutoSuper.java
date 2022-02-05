package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends implements ICalculator {
    private long countOperation;

    public long getCountOperation(){
        return countOperation;
    }

    public float division(float dividend, float divisor){
        ++countOperation;
        return super.division(dividend,divisor);
    }

    public float multiplication(float multiplier1, float multiplier2){
        ++countOperation;
        return super.multiplication(multiplier1,multiplier2);
    }

    public float addition(float...nums){
        ++countOperation;
        return super.addition(nums);
    }

    public float exponentiation(float num, int degree){
        ++countOperation;
        return super.exponentiation(num,degree);
    }

    public float abs(int number){
        ++countOperation;
        return super.abs(number);
    }

    public float root(int rootMeaning){
        ++countOperation;
        return super.root(rootMeaning);
    }
}
