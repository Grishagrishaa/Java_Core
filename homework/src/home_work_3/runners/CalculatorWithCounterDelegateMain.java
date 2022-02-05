package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calcComp = new CalculatorWithCounterAutoComposite();
        System.out.println(calcComp.addition(4.1f,calcComp.multiplication(15,7),calcComp.exponentiation(calcComp.division(28,5),2)));
        System.out.println("Циклов использования - " +calcComp.getCountOperation());
        //140.45999

        CalculatorWithCounterAutoAgregation calcAgrExt = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathExtends());
        System.out.println(calcAgrExt.addition(4.1f,calcAgrExt.multiplication(15,7),calcAgrExt.exponentiation(calcAgrExt.division(28,5),2)));
        System.out.println("Циклов использования - " +calcAgrExt.getCountOperation());
        //140.45999

        CalculatorWithCounterAutoAgregation calcAgrOperator = new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());
        System.out.println(calcAgrOperator.addition(4.1f,calcAgrOperator.multiplication(15,7),calcAgrOperator.exponentiation(calcAgrOperator.division(28,5),2)));
        System.out.println("Циклов использования - " +calcAgrOperator.getCountOperation());
        //140.45999

        CalculatorWithCounterAutoAgregation calcAgrCopy = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        System.out.println(calcAgrCopy.addition(4.1f,calcAgrCopy.multiplication(15,7),calcAgrCopy.exponentiation(calcAgrCopy.division(28,5),2)));
        System.out.println("Циклов использования - " +calcAgrCopy.getCountOperation());
        //140.45999

    }
}
