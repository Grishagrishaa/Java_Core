package collections.main;

import collections.dto.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentMain1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 10_000 ; i++) {
            Student student  = new Student(rnd.nextInt(50000),createRandomName(), rnd.nextInt(7,17),rnd.nextFloat(10),rnd.nextBoolean());
            studentList.add(student);
        }
        System.out.println(studentList);
    }

    public static String createRandomName(){
        String[]  alphabet = {"а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н",
                "о","п","р","с","т","у","ф","х","ц","ч","ш","щ","ъ","ы","ь","э","ю","я"};
        Random rnd = new Random();
        String name = "";
        int nameLength = rnd.nextInt(3,10);
        for (int i = 0; i <nameLength ; i++) {
            if(i == 0){
                name += alphabet[rnd.nextInt(33)].toUpperCase();

            }
            name += alphabet[rnd.nextInt(33)];
        }
        return name;
    }
}
