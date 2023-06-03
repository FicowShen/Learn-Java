package util;

import java.util.stream.Stream;

public class StringUtil {
    public static String[] splitByLineSeparator(String s) {
        // https://stackoverflow.com/questions/1096621/read-string-line-by-line
        return s.split(System.getProperty("line.separator"));
    }

    public static Stream<String> lines(String s) {
        return Stream.of(splitByLineSeparator(s));
    }
}
