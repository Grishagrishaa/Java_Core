package warAndPeace.service;

import warAndPeace.api.ISearchEngine;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasySearchService implements ISearchEngine {
    @Override
    public long search(String text, String word) throws IOException {
        WorkService service = new WorkService();
        String source = service.fileToString(text);//здесь будет текст по результату работы метода

        long count = 0;
        int i = 0;
        while (i >= 0) {
            if (i >= 0) {
                i++;
            }
            i = source.indexOf(word, i);
            if (i > 0) {
                ++count;
            }
        }
        return count;
    }
}
