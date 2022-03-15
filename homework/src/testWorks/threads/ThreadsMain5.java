package testWorks.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadsMain5 {
    static int a = 0;


    public static void main(String[] args) {
        int[][] b = new int[][]{{5,2,5},{5,2,3},{5,2,2},{5,2,2}};
        int a = 0;
        System.out.println(Arrays.deepToString(b));

        List<Integer> a1 = new ArrayList<>();
        List<Integer> b1 = new ArrayList<>();
        a1.add(2);
        a1.add(1);
        a1.add(0);
        System.out.println(a1);
        b1.add(a1.get(1));
        System.out.println(b1);
        System.out.println(a1);

      /*  Thread thread = new Thread(()-> {
            for (int i = 0; i < 100 ; i++) {
                a = a + 1;
            }
        });

        Thread thread2 = new Thread(()-> {
            for (int i = 0; i < 100 ; i++) {
                a = a - 1;
            }
        });

        thread.start();
        thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(a);*/
    }
}
