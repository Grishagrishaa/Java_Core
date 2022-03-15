package testWorks.threads.core;

import testWorks.threads.ThreadUtils;

import java.util.concurrent.TimeUnit;

public class InfinityWork implements Runnable {
    @Override
    public void run() {
        ThreadUtils.threadInfo();
        ThreadUtils.threadInfo();
        Thread current = Thread.currentThread();
        while(true){
            System.err.println("CURRENT THREAD - " + current.getId());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("ABOBUSSSSSSSSSSSSSSSSS");
            }
        }
    }
}
