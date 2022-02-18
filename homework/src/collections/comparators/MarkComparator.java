package collections.comparators;

import collections.dto.Student;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {// логика немного переделана, чтобы от меньшего к большему
        if(o2.getMark() - o1.getMark() < 0){
            return -1;
        }else if(o2.getMark() - o1.getMark() > 0){
            return 1;
        }else{
            return 0;
        }
    }

}
