package home_work_3.calcs.api;

public interface ICalculator {

    public float division(float dividend, float divisor);

    public float multiplication(float multiplier1, float multiplier2);

    public float addition(float...nums);

    public float exponentiation(float num, int degree);

    public float abs(int number);

    public float root(int rootMeaning);

}
