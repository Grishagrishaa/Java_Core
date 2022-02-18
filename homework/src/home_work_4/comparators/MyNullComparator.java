package home_work_4.comparators;

import java.util.Comparator;

public class MyNullComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        if(o2 == null){
            return -1;
        }else {
            return 1;
        }

    }
}
