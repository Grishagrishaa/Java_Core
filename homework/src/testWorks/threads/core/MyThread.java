package testWorks.threads.core;

import testWorks.threads.ThreadUtils;

public class MyThread extends Thread {
    @Override
    public void run() {
        ThreadUtils.threadInfo();
    }
}
