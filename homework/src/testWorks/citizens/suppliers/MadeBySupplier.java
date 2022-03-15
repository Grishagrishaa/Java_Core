package testWorks.citizens.suppliers;

import java.util.Random;
import java.util.function.Supplier;

public class MadeBySupplier implements Supplier<String> {
    String[] gov = new String[]{
            "ZAVODSKOE GUVD", "PERVOMAYSKOE GUVD", "CENTRALNOE GUVD",
            "MOSKOVSOE GUVD", "OKTYABRSKOE GUVD", "SOVETSOE GUVD", "PARTIZANSKOE GUVD"
    };
    @Override
    public String get() {
        Random rnd = new Random();
        return gov[rnd.nextInt(gov.length)];
    }
}
