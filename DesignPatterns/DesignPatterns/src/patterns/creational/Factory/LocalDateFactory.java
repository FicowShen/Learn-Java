package patterns.creational.Factory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class LocalDateFactory {

    private static Map<Integer, LocalDate> cache = new HashMap<>();
    public static LocalDate fromInt(int yyyyMMdd) {
        if (yyyyMMdd >= 1e4 && yyyyMMdd <= (1e8 - 1)) {
            LocalDate result = cache.get(yyyyMMdd);
            if (result == null) {
                result = create(yyyyMMdd);
                cache.put(yyyyMMdd, result);
            }
            return result;
        }
        return null;
//        return simpleConvert(yyyyMMdd);
    }

    private static LocalDate create(int yyyyMMdd) {
        return LocalDate.of(yyyyMMdd / (int)1e4, yyyyMMdd / 100 % 100, yyyyMMdd % 100);
    }

    private static LocalDate simpleConvert(int yyyyMMdd) {
        String date = String.valueOf(yyyyMMdd);
        LocalDate inputDate = LocalDate.parse(date,
                DateTimeFormatter.ofPattern("yyyyMMdd"));
        return inputDate;
    }
}
