package testWorks.threads;

import testWorks.threads.core.MyThread;
import testWorks.threads.core.MyWork;

public class ThreadsMain3 {
    public static void main(String[] args) {
        ThreadUtils.threadInfo();

        Thread th1 = new Thread(new MyWork());
        th1.start();

    }
}
