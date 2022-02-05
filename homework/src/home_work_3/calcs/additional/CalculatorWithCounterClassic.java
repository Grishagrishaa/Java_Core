package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends implements ICalculator {
    private long CountOperation;

    public void incrementCountOperation(){
        ++CountOperation;
    }

    public long getCountOperation(){
        return CountOperation;
    }
}
