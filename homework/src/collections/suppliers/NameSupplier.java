package collections.suppliers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class NameSupplier implements Supplier<String>  {
    public String get() {
        Random rnd = new Random();
        StringBuilder bld = new StringBuilder();
        List<String> names = new ArrayList<>();

        try {
            FileReader reader = new FileReader("Names.txt");
            int result = -1;

            while((result = reader.read())!=-1){
                if(result != ','){
                    bld.append((char) result);
                }else{
                    names.add(bld.toString());
                    bld.setLength(0);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        } catch (IOException e) {
            System.out.println("IOEXCEPTION");
        }


        return names.get(rnd.nextInt(names.size()));
    }
}
