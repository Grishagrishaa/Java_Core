package collections.comparators;

import collections.dto.Student;

import java.util.Comparator;

public class NewNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
