package testWorks.threads;

import collections.dto.Student;
import home_work_1.PhoneNumber;
import testWorks.threads.api.ICall;

import java.util.Comparator;

public class LambdaMain1 {
      String name = "";
    public static void main(String[] args) {
        ICall device = new ICall() {
            @Override
            public boolean call(String number) {
                return false;
            }
        };
        ICall device2 = new Phone();
        ICall device3 = (num) -> {
            System.out.println("Включаем прослушку. Набираем " + num + ".......");
            return true;
        };
        Comparator<Student> comp = (st1, st2) -> {
            return st1.getName().length() - st2.getName().length();
            };
        Comparator<Student> comp2 = (st1, st2) -> st1.getName().length() - st2.getName().length();
        System.out.println(callToNumber(device, "+375111111111"));
        System.out.println(callToNumber(device2,"+375222222222"));
        System.out.println(callToNumber(device3,"+375333333333"));
        }

    public static boolean callToNumber(ICall device, String number){
        return device.call(number);
    }
        }


