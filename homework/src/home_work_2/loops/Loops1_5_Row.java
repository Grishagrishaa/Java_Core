package home_work_2.loops;

public class Loops1_5_Row {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 11; j++) {
                System.out.print(j + " * " + i + " = " + i*j);
                System.out.print("   ||   ");
                if(j==10){
                    System.out.println();

                }
            }
        }
    }
}
