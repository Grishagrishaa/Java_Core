package home_work_1;

public class Decrements {
    public static void main(String[] args) {
        int a = 2, b = 8;
        System.out.println(5 + a / b);//a/b = 0 (int)
        System.out.println((5 + a) / b);//7/8 = 0 (int)
        System.out.println((5 + a++) / b);//(5+2)/8=0 (int); a=3 после вычисления
        System.out.println((5 + a++) / --b);//(5+3)/7=1 (int); a = 4 после вычисления, b = 7 перед вычислением
        System.out.println((5 * a >> a++) / --b);//(5*4>>4)/6=(10100>>4)/6=1/6=0 (int); a = 5 после вычисления,b = 6 перед вычислением
        System.out.println((5 + 7 > 20 ? 68 : 22 * a >> a++) / --b);//if-then-else; (22*5>>5)/5=(1101110>>5)/5=00000011/5=3/5=0 (int); a = 6 после вычисления,b = 5 перед вычислением
        //Если значение Exp1 верно, то значение Exp2 будет значением всего выражения.(Exp1 ? Exp2 : Exp3;)
        //Если значение Exp1 ложно, то вычисляется Exp3 и его значение становится значением всего выражения.
        //System.out.println(Integer.toBinaryString(110));
        //System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * a >> a++)/--b);//Не робит
        System.out.println(6 - a > 3 && 12 * 12 <= 119);//оба операнда false - false, для AND нужно оба True для итогового True
        System.out.println(true && false);//Та же ситуация
    }
}
