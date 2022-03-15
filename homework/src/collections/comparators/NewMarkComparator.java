package collections.comparators;

import collections.dto.Student;

import java.util.Comparator;

public class NewMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {//ЧТОБЫ ОТ БОЛЬШЕГО К МЕНЬШЕМУ МЕНЯЕМ МЕСТАМИ ЗНАКИ ПЕРЕД 1
        if(o1.getMark() - o2.getMark()<0){
            return 1;
        }else if(o1.getMark() - o2.getMark()>0){
            return -1;
        }else{
            return 0;
        }
    }
}
