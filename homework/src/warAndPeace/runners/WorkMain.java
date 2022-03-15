package warAndPeace.runners;

import warAndPeace.service.WorkService;
import warAndPeace.comparators.ValueComparator;

import java.io.IOException;
import java.util.*;

public class WorkMain {
    public static void main(String[] args) throws IOException {
        WorkService service = new WorkService();

        String source = "Война и мир_книга.txt";

        String wordsAsString = service.fileToString(source);//ТУТ СТРОКА СЛОВ С ПРОБЕЛАМИ


        //System.out.println("__________________WORDS_AS_STRING__________________");
        //System.out.println(wordsAsString);


        List<String> wordsAsList = new ArrayList<>();//ТУТ ЛИСТ СЛОВ
        service.fileToWordsList(source, wordsAsList);

        ///System.out.println("__________________WORDS_AS_LIST____________________");
        ///System.out.println(wordsAsList);


        Set<String> wordsAsSet = new TreeSet<>();//ТУТ СЕТ СЛОВ
        service.createSet(wordsAsList, wordsAsSet);
        //service.createSet(wordsAsString, wordsAsSet);//ДВЕ ПЕРЕГРУЗКИ:СЕТ ИЗ ЛИСТА, СЕТ ИЗ СТРОКИ
        //System.out.println("__________________WORDS_AS_SET_____________________");
        //System.out.println(wordsAsSet);


        Map<String, Integer> wordsAsMap = new TreeMap<>();//ТУТ СЛОВА В МЭПЕ С КОЛИЧЕСТВОМ ПОВТОРЕНИЙ
        service.createMap(wordsAsList, wordsAsMap);

        //System.out.println("__________________WORDS_AS_MAP_____________________");
        //System.out.println(wordsAsMap);

        int topCount = 10;
        System.out.println("_______________________TOP_" + topCount + "_________________________");
        service.getTop(wordsAsMap, new ValueComparator(), topCount);


        System.out.println();
    }
}
