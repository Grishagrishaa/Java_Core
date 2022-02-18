package collections.main;

import collections.dto.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentMain2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 10_000 ; i++) {
            Student student  = new Student(rnd.nextInt(50000),createRealName(),
                    rnd.nextInt(7,17),rnd.nextFloat(10),
                    rnd.nextBoolean());
            studentList.add(student);
        }
        System.out.println(studentList);
    }

    public static String createRealName(){
        String[] names = {"Рыжик", "Барсик", "Мурзик",
                "Мурка", "Васька", "Томасина", "Бобик", "Кристина", "Пушок",
                "Дымка", "Кузя", "Китти", "Барбос", "Масяня", "Симба", "Альберт", "Виталя",
                "Негритос", "Андрей", "Мурзик","Витя", "Биба","Боба"};
        Random rnd = new Random();
        return names[rnd.nextInt(0,23)];
    }

}
