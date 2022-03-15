package testWorks.threads;

import testWorks.threads.api.ICall;

public class Phone implements ICall {
    @Override
    public boolean call(String number) {
        System.out.println("Набираю " + number + "........");
        return true;
    }
}
