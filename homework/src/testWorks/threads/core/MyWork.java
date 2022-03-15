package testWorks.threads.core;

import testWorks.threads.ThreadUtils;

public class MyWork implements Runnable {

    @Override
    public void run() {
        ThreadUtils.threadInfo();
    }
}
