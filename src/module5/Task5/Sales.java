package module5.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Sales {
    public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
        Map<String, Long> salesMap = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split(" ");
            String name = parts[0];
            long sales = Long.parseLong(parts[1]);

            if (salesMap.containsKey(name)) {
                salesMap.put(name, salesMap.get(name) + sales);
            } else {
                salesMap.put(name, sales);
            }
        }

        bufferedReader.close();
        return salesMap;
    }
}