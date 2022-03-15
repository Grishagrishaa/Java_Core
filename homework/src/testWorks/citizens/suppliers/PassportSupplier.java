package testWorks.citizens.suppliers;

import testWorks.citizens.dto.Passport;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class PassportSupplier implements Supplier<Passport> {
    Supplier<String> madeBySupplier = new MadeBySupplier();

    @Override
    public Passport get() {
        Random rnd = new Random();
        return new Passport(
                rnd.nextInt(),
                madeBySupplier.get(),

                LocalDate.of(
                        rnd.nextInt(1900,2022),
                        rnd.nextInt(1,12),
                        rnd.nextInt(1,28)
                ),

                rnd.nextInt()
        );
    }
}
