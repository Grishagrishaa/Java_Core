package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregation implements ICalculator {
    CalculatorWithMathExtends inheritance;
    CalculatorWithOperator operator;
    CalculatorWithMathCopy copy;

    private long countOperation;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends inheritance){
        this.inheritance = inheritance;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator operator){
        this.operator = operator;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy copy){
        this.copy = copy;
    }

    public long getCountOperation(){
        return countOperation;
    }

    @Override
    public float division(float dividend, float divisor) {
        ++countOperation;
        if(inheritance != null){
            return inheritance.division(dividend,divisor);
        }else if(operator != null){
            return operator.division(dividend,divisor);
        }else{
            return copy.division(dividend,divisor);
        }

    }

    @Override
    public float multiplication(float multiplier1, float multiplier2) {
        ++countOperation;
        if(inheritance != null){
            return inheritance.multiplication( multiplier1,multiplier2);
        }else if(operator != null){
            return operator.multiplication( multiplier1,multiplier2);
        }else{
            return copy.multiplication (multiplier1,multiplier2);
        }
    }

    @Override
    public float addition(float... nums) {
        ++countOperation;
        if(inheritance != null){
            return inheritance.addition(nums);
        }else if(operator != null){
            return operator.addition(nums);
        }else{
            return copy.addition(nums);
        }
    }

    @Override
    public float exponentiation(float num, int degree) {
        ++countOperation;
        if(inheritance != null){
            return inheritance.exponentiation(num,degree);
        }else if(operator != null){
            return operator.exponentiation(num,degree);
        }else{
            return copy.exponentiation(num,degree);
        }
    }

    @Override
    public float abs(int number) {
        ++countOperation;
        if(inheritance != null){
            return inheritance.abs(number);
        }else if(operator != null){
            return operator.abs(number);
        }else{
            return copy.abs(number);
        }
    }

    @Override
    public float root(int rootMeaning) {
        ++countOperation;
        return 0;
    }
}
