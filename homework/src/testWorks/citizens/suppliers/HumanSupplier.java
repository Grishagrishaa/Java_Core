package testWorks.citizens.suppliers;

import testWorks.citizens.dto.Citizen;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class HumanSupplier implements Supplier<Citizen> {
    Random rnd = new Random();

    @Override
    public Citizen get() {
        return new Citizen(
                new PassportSupplier().get(),
                new NameSupplier().get(),

                LocalDate.of(
                        rnd.nextInt(1900,2022),
                        rnd.nextInt(1,12),
                        rnd.nextInt(1,28)
                )
                );
    }
}
