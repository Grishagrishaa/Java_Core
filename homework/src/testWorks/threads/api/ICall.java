package testWorks.threads.api;

public interface ICall {
    boolean call(String number);
    default boolean callToMother(){
        return call("+375-(25)-930-20-35");
    }
}
