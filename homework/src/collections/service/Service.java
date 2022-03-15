package collections.service;

import collections.comparators.MarkComparator;
import collections.comparators.StringLengthComparaotor;
import collections.dto.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {
    public static List<String> name1 = new ArrayList<>();


    public List<String> createNameList(String NamesString){//Заполнение листа именами
        int indexOf = 0;
        indexOf = NamesString.indexOf(",");
        String name = "";
        if(indexOf == -1){
            name = NamesString.substring(0,NamesString.indexOf("."));
            name1.add(name);
            return name1;
        }
        name = NamesString.substring(0,NamesString.indexOf(","));// индексОф -1 возвращает при неудаче
        name1.add( name);
        createNameList(NamesString.substring(indexOf+1));
        return name1;
    }

    public List<Student> nameComparator(List<Student> list){
        List<Student> nameSort = new ArrayList<>(list);
        nameSort.sort(new StringLengthComparaotor());
        return nameSort;
    }

    public List<Student> ageMarkFilter(List<Student> list){
        List<Student> ageMarkSort = new ArrayList<>(list);//Это копия, отдельный список
        //ageSort.sort(new AgeComparator());
        ageMarkSort.removeIf(student -> student.getAge() < 12);//фильтр по возрасту (3 задание)
        ageMarkSort.removeIf(student -> student.getMark() < 8);//фильтр по оценке (3 задание)
        System.out.println(averageAge(ageMarkSort) + "  - Средний возраст ");//средняя оценка (4)
        return ageMarkSort;
    }

    public float averageAge(List<Student> list){//(4.)
        float average = 0, i = 0,sum = 0;
        for (Student student : list) {
            int age = student.getAge();
            i++;// количество объектов
            sum += age;
            average = sum/i;
        }
        //System.out.println("count " + i);
        average = sum/i;
        return average;
    }

    public List<Student> getTop10 (List<Student> list){
        //Collections.reverse(list);
        List<Student> top10 = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            top10.add(list.get(i));
        }
        return top10;
    }
    public void everyAgeTop (List<Student> list){
        for (int i = 12; i <= 17; i++) {
            List<Student> sortedByAge = new ArrayList<>(list);
            int age = i;//ругалась среда разработки
            sortedByAge.removeIf(student -> student.getAge() != age);
            sortedByAge.sort(new MarkComparator());

            getTop10(sortedByAge);
            System.out.println("____________ТОП СРЕДИ_" + age + "_ЛЕТНИХ____________");
            System.out.println(getTop10(sortedByAge));
        }

    }
}
