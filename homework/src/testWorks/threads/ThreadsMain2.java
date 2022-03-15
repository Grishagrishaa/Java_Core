package testWorks.threads;

import testWorks.threads.ThreadUtils;
import testWorks.threads.core.MyThread;

public class ThreadsMain2 {
    public static void main(String[] args) {
        ThreadUtils.threadInfo();

        MyThread th1 = new MyThread();
        th1.run();
    }
}
