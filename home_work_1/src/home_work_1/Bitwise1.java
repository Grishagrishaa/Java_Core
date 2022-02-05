package home_work_1;

public class Bitwise1 {
    public static void main(String[] args) {
        byte a = 42,b = 15;
        int c = a&b,d = a|b,e = a^b,f = a>>b,g = a<<b,h = ~a, n = ~b;
	    System.out.println(Integer.toBinaryString(a) + "," + Integer.toBinaryString(b) + " - " + "Двоичные значения;");
        System.out.println("~a =" + h + ';' + "~00101010 = 11010101" + "; Побитовый унарный оператор NOT.");
        System.out.println("~b = " + n + ';' + "~00001111 = 11110000" + "; Побитовый унарный оператор NOT.");
	    System.out.println("a&b = " + c + ';' + Integer.toBinaryString(c) + "; Побитовый AND.");
	    System.out.println("a|b = " + d + ';' + Integer.toBinaryString(d) + "; Побитовый OR.");
	    System.out.println("a^b = " + e + ';' + Integer.toBinaryString(e) + "; Побитовый исключающее OR.");
	    System.out.println("a>>b = " + f + ';' + Integer.toBinaryString(f) + "; Сдвиг вправо(на 15).");
	    System.out.println("a<<b = " + g + ';' + Integer.toBinaryString(g) + "; Сдвиг влево(на 15).");
	    System.out.println();
            byte a1 = -42,b1 = -15;
            int c1 = a1&b1,d1 = a1|b1,e1 = a1^b1,f1 = a1>>b1,g1 = a1<<b1, f2 = a1>>>b1, h1 = ~a, n1 = ~b1;
            System.out.println("11010110" + "," + "11110001" + " - " + " Отрицательные двоичные значения;");
            System.out.println("~b1 = " + n1 + ';' + "~11110001 = 1110" + "; Побитовый унарный оператор NOT.");
            System.out.println("~a1 = " + h1 + ';' + "~11010110 = 101001" + "; Побитовый унарный оператор NOT.");
            System.out.println("a1&b1 = " + c1 + ';' + " 11010110 & 11110001 = 11010000" + "; Побитовый AND.");
            System.out.println("a1|b1 = " + d1 + ';' + "11010110 | 11110001 = 11110111" + "; Побитовый OR.");
            System.out.println("a1^b1 = " + e1 + ';' + "11010110 ^ 11110001 = 100111" + "; Побитовый исключающее OR.");
            System.out.println("a1>>b1 = " + f1 + ';' + Integer.toBinaryString(f1) + "; Сдвиг вправо(на 15).");
            System.out.println("a1>>>b1 = " + f2 + ';' + Integer.toBinaryString(f2) + "; Сдвиг вправо (на 15) вместе с числом знака.");
            System.out.println("a1<<b1 = " + g1 + ';' + Integer.toBinaryString(g1) + "; Сдвиг влево(на 15).");
        //float a2 = 42.5F;
        //int a3 = ~a2;
        //Бинарные операторы отказываются работать с дробными аргументами (java: bad operand type float for unary operator '~')
        //Integer.toBinaryString выводит 32 бита, а нолики пустые стирает
     }
}
