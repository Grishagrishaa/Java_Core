package loops;

public class Loops1_5 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
                if(j==10){
                    System.out.println( " ");
                }
            }
        }
    }
}
