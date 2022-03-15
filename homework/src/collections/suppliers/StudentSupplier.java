package collections.suppliers;

import collections.dto.Student;

import java.util.Random;
import java.util.function.Supplier;

public class StudentSupplier implements Supplier<Student> {
    Random rnd = new Random();
    NameSupplier names = new NameSupplier();

    @Override
    public Student get() {
        return new Student(
                rnd.nextInt(10_000),
                names.get(),
                rnd.nextInt(7,18),
                rnd.nextFloat(10),
                rnd.nextBoolean()
        );
    }
}
