package collections.main;
import collections.comparators.MarkComparator;
import collections.dto.Student;
import collections.service.Service;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class StudentMain3 {
    public static void main(String[] args) throws Exception {
        Random rnd = new Random();
        Service service = new Service();
        //вызываем сервис с методами

        String stringNames = readFile();
        //Здесь получаем одну строки из имен из файла

        List<String> namesList = service.createNameList(stringNames);
        //Лист имён, с помощью метода
        List<Student> students = new ArrayList<>();
        //Лист с объектами студентов

        for (int i = 0; i <10_000 ; i++) {
            students.add(new Student(i,namesList.get(rnd.nextInt(namesList.size())),
                    rnd.nextInt(7,18), rnd.nextFloat(10), rnd.nextBoolean() ));
        }
        //Цикл заполнения листа студентами с использованием класса Random

        List<Student> sortedStudents = service.ageMarkFilter(students);
        // (3,4), Фильтрация по 3 заданию (age>12, mark>8) + вывод среднего возраста - 4 задание
        System.out.println("__________________ТОП 10 ПО ИМЕНАМ__________________");
        System.out.println(service.getTop10(service.nameComparator(sortedStudents)));
        //Фильтрация по длине имени - 5 задание, (от меньшего к большему)
        System.out.println("__________________ТОП 10 ПО ОЦЕНКАМ__________________");
        List<Student> markSort = new ArrayList<>(sortedStudents);
        //копия массива sortedStudents
        markSort.sort(new MarkComparator());//сортировка копии по оценкам
        System.out.println(service.getTop10(markSort));
        //Вывод топа оценок - 6 задание, (от большего к меньшему).
        service.everyAgeTop(sortedStudents);
        //Топ каждого возраста

    }


    public static String readFile() throws IOException {//чтение файла и создание строки студентов
        File file = Path.of("resources", "names.txt").toFile();//инициализация файла по адресу
        FileInputStream input = new FileInputStream(file); //объект стрима

        byte[] names = input.readAllBytes();//имена в массиве байт
        String stringValue = new String(names);//преобразование в строку массива байт
        input.close();//закрытие потока

        return stringValue;
    }
}







