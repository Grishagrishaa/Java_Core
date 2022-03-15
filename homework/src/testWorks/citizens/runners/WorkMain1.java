package testWorks.citizens.runners;

import testWorks.citizens.dto.Passport;
import testWorks.citizens.service.WorkService1;
import testWorks.citizens.suppliers.PassportSupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkMain1 {
    public static void main(String[] args) {
        //WorkService1 service = new WorkService1();
        //service.run();

        List<Passport> passportList = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            passportList.add(new PassportSupplier().get());
        }
        System.out.println(passportList);
        Passport passport = search(passportList);
        System.out.println("_______________________");
        System.out.println(passport);

    }

    public static Passport search(List<Passport> passportList){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input ID");
        int result = scn.nextInt();
        for (Passport passport : passportList) {
            if(result == passport.getHumanId()) return passport;
        }
        return null;
    }
}
