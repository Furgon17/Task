package module5.Task5;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000";
        Reader reader = new StringReader(input);

        try {
            Map<String, Long> salesMap = Sales.getSalesMap(reader);
            System.out.println(salesMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}