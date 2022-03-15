package testWorks.citizens.suppliers;

import java.util.Random;
import java.util.function.Supplier;

public class NameSupplier implements Supplier<String> {
    Random rnd = new Random();
    String[] names = {
            "Васька",
            "Кузя",
            "Барсик",
            "Мурзик",
            "Леопольд",
            "Бегемот",
            "Рыжик",
            "Матроскин"
    };
    @Override
    public String get() {
        return names[rnd.nextInt(names.length)];
    }
}
