package collections.service;

import collections.comparators.MarkComparator;
import collections.comparators.NewMarkComparator;
import collections.comparators.NewNameComparator;
import collections.dto.Student;
import collections.predicates.AgeMarkPredicate;
import collections.suppliers.StudentSupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*Коллекции, полиморфизм, DTO, Supplier*, Comparator:
1. Создать класс Student с полями^
	1.1 Порядковый номер (int)^
	1.2 Имя (Строка размером от 3 до 10 русских символов)^
	1.3 возраст (7-17)^
	1.4 оценка(0.0-10.0)^
	1.5 признак участия в олимпиадах (bool).^
2. Создать 10_000 объектов класс Student и поместить в коллекцию. Данные заполняются рандомно. Стандартного рандома для строк в jdk нету.^
	2.1 Заполнять имя рандомными русскими символами^
	2.2* Заполнять имя рандомными понятными именами^
	2.3** Заполнять имя рандомными понятными именами загруженными из файла.^
3. Отфильтровать студентов по нескольким признакам. По возрасту (тем кому 12 и выше), по оценке (выше 8).^
Отфильтрованных студентов поместить в отдельный список. Старый список дожен остаться неизменным.^
4. Вывести средний возраст отфильтрованных студентов^
5. Отсортировать отфильтрованных студентов по имени, от меньшему к большему. Выести топ 10
6. Отсортировать отфильтрованных студентов по оценке, от большего к меньшему. Выести топ 10
7. Отсортировать отфильтрованных студентов по возрасту и оценке одновременно. Вывести топ 10 в каждом возрасте.*/
public class Service2 {
    public void run(){
        StudentSupplier studentSupplier = new StudentSupplier();//SUPPLIER ВОЗВРАЩАЕТ МНЕ СТУДЕНТОВ ЧЕРЕЗ GET
        List<Student> origList = new ArrayList<>();//ОРИГИНАЛЬНЫЙ ЛИСТ СТУДЕНТОВ

        int count = 100;
        double averageAge = 0;

        //ЗАПОЛНЯЕМ ЛИСТ СТУДЕНТАМИ ЧЕРЕЗ МЕТОД GET
        for (int i = 0; i < count; i++) {
            Student aboltus = studentSupplier.get();
            aboltus.setStudentId(i);
            origList.add(aboltus);
            averageAge += aboltus.getAge();
        }
        System.out.println(origList);
        averageAge /= count;//СРЕДНИЙ ВОЗРАСТ
        System.out.println("AVERAGE AGE - " + averageAge);

        //СОРТИРУЕМ ПО ВОЗРАСТУ И ОЦЕНКЕ
        List<Student> sortedList = filter(origList,new AgeMarkPredicate());
        System.out.println(sortedList);

        System.out.println("TOP BY NAME");
        sortedList.sort(new NewNameComparator());
        getTop(sortedList,10);

        /*System.out.println("TOP 10 BY MARK1");
        sortedList.sort(new MarkComparator());
        getTop(sortedList,10);*/

        System.out.println("TOP  BY MARK");
        sortedList.sort(new NewMarkComparator());
        getTop(sortedList,10);

    }


    public static <X>  List<X> filter(List<X> data, Predicate<X> predicate){
        List<X> sorted = new ArrayList<>();
        for (X datum : data) {
            if (predicate.test(datum)){
                sorted.add(datum);
            }
        }
        return sorted;
    }

    public static <G> void getTop(List<G> list, int count){
        if(list.size()<count) count = list.size();


        for (int i = 0; i < count ; i++) {
            System.out.println(list.get(i));
        }

    }

}
