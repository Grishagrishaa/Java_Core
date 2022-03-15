package testWorks.threads;

import testWorks.threads.core.InfinityWork;

public class ThreadsMain4 {
    public static void main(String[] args) {
        ThreadUtils.threadInfo();
        Runnable infinity = new InfinityWork();

        Thread th1 = new Thread(infinity);
        Thread th2 = new Thread(infinity);
        Thread th3 = new Thread(infinity);

        th1.start();
        th2.start();
        th3.start();

        th1.interrupt();
        th2.interrupt();
        th3.interrupt();
    }
}
