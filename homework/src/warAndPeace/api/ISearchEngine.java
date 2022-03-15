package warAndPeace.api;

import java.io.IOException;

public interface ISearchEngine {
    long search(String text, String word) throws IOException;
}