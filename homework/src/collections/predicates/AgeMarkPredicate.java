package collections.predicates;

import collections.dto.Student;

import java.util.function.Predicate;

public class AgeMarkPredicate implements Predicate<Student> {

    @Override
    public boolean test(Student std) {
        return (std.getMark() > 8 && std.getAge() > 12);
    }
}
