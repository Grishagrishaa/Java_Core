package warAndPeace.runners;

import warAndPeace.service.EasySearchService;

import java.io.IOException;

public class EasyMain {
    public static void main(String[] args) throws IOException {
        EasySearchService service = new EasySearchService();
        //service.search("Война и мир_книга.txt", "b");
        System.out.println(service.search("Война и мир_книга.txt", "Война"));
    }
}
