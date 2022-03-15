package testWorks.threads;

public class ThreadUtils {
    public static void threadInfo(){
        Thread current = Thread.currentThread();
        System.err.println("_______________");
        System.err.println("id:  " + current.getId());
        System.err.println("name:  " + current.getName());
        System.err.println("state:  " + current.getState());
        System.err.println("group:  " + current.getThreadGroup());
        System.err.println("_______________");
    }
}
