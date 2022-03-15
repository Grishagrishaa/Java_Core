package testWorks.citizens.service;

import testWorks.citizens.dto.Citizen;
import testWorks.citizens.dto.Passport;
import testWorks.citizens.suppliers.HumanSupplier;
import testWorks.citizens.suppliers.PassportSupplier;

import java.util.*;

public class WorkService1 {
    public void run(){
        HumanSupplier citizen = new HumanSupplier();
        List<Citizen> list = new ArrayList<>();

        for (int i = 0; i < 10_000; i++) {
            list.add(citizen.get());
        }

        System.out.println(list.size());

        Set<Citizen> set = new HashSet<>();

        for (int i = 0; i < 10_000; i++) {
            set.add(citizen.get());
        }

        System.out.println(set.size());
    }


}
