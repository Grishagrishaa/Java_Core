package home_work_4.service;

import home_work_4.comparators.MyNullComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer <T extends Comparable<T>> {
    private T[] data;
    public DataContainer (T[] data){
        this.data = data;
    }
    //public DataContainer (){}

    public int add(T item){
        if(item == null){
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null){
                data[i] = item;
                return i;
            }
        }
        data = Arrays.copyOf(data,data.length +1);
        data[data.length-1] = item;
        return data.length-1;
    }
    
    public T get (int index){
        try{
            return data[index];

        }catch(IndexOutOfBoundsException exception){
            return null;
        }
    }

    public T[] getItems (){
        return data;
    }

    public boolean delete (int index){

        try{
            data[index] = null;
            Arrays.sort(data, new MyNullComparator());
            data = Arrays.copyOf(data, data.length-1);
            return true;
        }catch(IndexOutOfBoundsException exception){
            return false;
        }
    }
    public boolean delete (T item){
        for (int i = 0; i < data.length; i++) {
            if(Objects.equals(item,data[i])){
                return delete(i);
            }
        }
        return false;
    }

    public void sort(Comparator<T> comparator){//Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
        for (int i = 0; i < data.length-1 ; i++) {
            for (int j = data.length-1; j > 0 ; j--) {
                if(comparator.compare(data[j-1],data[j]) > 0){//*Первый аргумент больше*
                    T ram = data[j-1];
                    data[j-1] = data[j];
                    data[j] = ram;
                }
            }
        }

    }

    @Override
    public String toString() {
        Arrays.sort(data, new MyNullComparator());//Перемещаем null'ы в конец
        for (int i = 0; i < data.length ; i++) {
            if(data[i] == null){//находим начало null'ов
                data = Arrays.copyOf(data, i);//Просто обрезаем null'ы
                return "data = " + Arrays.toString(data);
            }
        }
        return "data = " + Arrays.toString(data);
    }
}
