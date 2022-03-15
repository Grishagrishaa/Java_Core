package home_work_4.runners;

import home_work_4.service.DataContainer;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> data = new DataContainer<String>( new String[0]);

        System.out.println("____________________ПОПЫТКА НЕКОРРЕКТНОЙ ВСТАВКИ____________");
        System.out.println(data.add(null));// Элемент вставить нельзя, возвращает -1

        int index0 = data.add("АБВГДЕ");//МЕТОД ADD
        int index1 = data.add("АБВГД");
        int index2 = data.add("АБВГ");
        int index3 = data.add("АБВ");
        int index4 = data.add("АБ");
        int index5 = data.add("А");

        System.out.println("____________________МЕТОД GET_______________________________");
        String text2 = data.get(index0);//МЕТОД GET НАГЛЯДНО
        System.out.println(text2);//

        System.out.println("____________________РЕЗУЛЬТАТЫ УДАЛЕНИЯ_____________________");
        System.out.println(data.delete(4));//УДАЛЕНИЕ ЭЛЕМЕНТА ПО ИНДЕКСУ
        System.out.println(data.delete("А"));//УДАЛЕНИЕ ПО КОНКРЕТНОМУ ЭЛЕМЕНТУ

        System.out.println("____________________Массив до сортировки____________________");
        System.out.println(data);

        data.sort(String::compareTo);//СОРТИРОВКА

        System.out.println("____________________Массив после сортировки_________________");
        System.out.println(data);
    }
}
