package warAndPeace.runners;

import warAndPeace.comparators.ValueComparator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WorkMain1 {
   public static void main(String[] args) throws IOException {
        FileReader text = null;

        try {
            text = new FileReader("Война и мир_книга.txt");//Война и мир_книга.txt//Names.txt
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> words = new ArrayList<>();
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

        //System.out.println(words);
        System.out.println(words.size() + " Count of words");
        System.out.println("_________________");
        Set<String> set = new HashSet<>(words);
        //System.out.println(set);
        System.out.println(set.size() + " Count of unique words");


        Map<String, Integer> map = new TreeMap<>();

        for (String word : words) {

                if(!map.containsKey(word) ){
                    map.put(word, 1);

                }else{
                    map.replace(word, map.get(word),map.get(word) + 1 );
                }
            }
        //System.out.println(words);
        System.out.println(map.entrySet());
        System.out.println("_________________________");

        List list = new ArrayList(map.entrySet());
        Collections.sort(list, new ValueComparator());
        for (int i = 0; i <10 ; i++) {
            System.out.println(list.get(i));
        }
    }

}
