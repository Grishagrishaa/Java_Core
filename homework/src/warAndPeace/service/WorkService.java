package warAndPeace.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class WorkService {

    private Scanner scn = new Scanner(System.in);

    public String fileToString(String path) throws IOException {
        FileReader text = null;
        String stringToWrite;

            try {
                text = new FileReader(path);//Война и мир_книга.txt//Names.txt
            } catch (FileNotFoundException e) {
                System.out.println("FILE NOT FOUND.");
            }



        int symbol = -1;
        StringBuilder bld = new StringBuilder();
        while((symbol = text.read()) != -1){
            if(
                    symbol != ',' && symbol != '.'
                            && symbol != '!' && symbol != '?'
                            && symbol != ':' && symbol != ';'
                            && symbol != '-' && symbol != '"'
                            && symbol != '(' && symbol != ')'
                            //&& symbol != ' '
                            && symbol != '[' && symbol != '\n'
            )
            {
                bld.append((char) symbol);
            }
        }
        stringToWrite = bld.toString();
        return stringToWrite;
    }

    public List<String> fileToWordsList(String path, List<String> list) throws IOException {
        FileReader text = null;

            try {
                text = new FileReader(path);//Война и мир_книга.txt//Names.txt
            } catch (FileNotFoundException e) {
                System.out.println("FILE NOT FOUND");
            }


        List<String> words = list;
        int symbol = -1;
        StringBuilder bld = new StringBuilder();
        while((symbol = text.read()) != -1){
            if(
                    symbol != ',' && symbol != '.'
                            && symbol != '!' && symbol != '?'
                            && symbol != ':' && symbol != ';'
                            && symbol != ' ' && symbol != '-'
                            && symbol != '"' && symbol != '('
                            && symbol != ')' //&& symbol != ' '
                            && symbol != '[' && symbol != '\n'
            )
            {
                bld.append((char) symbol);
            }
            else{
                String word = bld.toString();
                if(word.length() != 0){
                    words.add(word);
                }
                bld.setLength(0);
            }
        }
        return words;
    }

    public Set<String> createSet(List<String> list, Set<String> set){//ИЗ ЛИСТА В СЕТ
        set.addAll(list);
        return set;
    }
    public Set<String> createSet(String stringText, Set<String> set){//ИЗ СТРИНГА В СЕТ, ПЕРЕГРУЗКА
        String[] wordsArray = stringText.split(" ");//СПЛИТИМ НА ОТДЕЛЬНЫЕ СЛОВА ПЕРЕДАННУЮ СТРОКУ

        set.addAll(Arrays.asList(wordsArray));//ПРЕВРАЩАЕМ МАССИВ СТРОК, СОСТОЯЩИЙ ИЗ СЛОВ, В СЕТ
        return set;
    }


    public Map<String, Integer> createMap(List<String> allWordsList, Map<String,Integer> map){//ДЕЛАЕМ МЭП ИЗ ЛИСТА СЛОВ
        for (String word : allWordsList) {

            if(!map.containsKey(word) ){
                map.put(word, 1);

            }else{
                map.replace(word, map.get(word),map.get(word) + 1 );
            }
        }
        return map;
    }

    public <K,V> void getTop(Map<K,V> map, Comparator<V> comparator, int topCount){
        List list = new ArrayList(map.entrySet());
        Collections.sort(list, comparator);
        try{
            for (int i = map.size() - 1; i > map.size() - 1 - topCount; i--) {
                System.out.println(list.get(i));
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("NOT ENOUGH ELEMENTS");
        }
    }
}

