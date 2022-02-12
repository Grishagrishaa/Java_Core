package home_work_2.loops;

public class Loops1_1_2 {
    public static void main(String[] args) {
        int answer = Integer.parseInt(args[0]);
        if(answer<1){
            System.out.println("Аргумент слишком мал");
            System.exit(0);
        }else if(answer>65){
            System.out.println("Аргумент слишком велик");
            System.exit(0);
        }
        int answerCopy = answer;
        multiplier(answer, answerCopy);
        System.out.print(factorial(answer));

    }
    public static void multiplier(int n, int b ){
        if(b<1){
            System.out.print(" = ");
            return;
        }
        System.out.print(n-(b-1));
        if(b>1){
            System.out.print(" * ");
        }
        multiplier(n, b-1);
    }

    static long factorial(int x){
        if (x == 1){
            return 1;
        }
        return x * factorial(x - 1);
    }
}
