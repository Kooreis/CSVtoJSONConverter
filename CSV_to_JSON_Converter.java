```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CSVtoJSONConverter {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String> headers = new ArrayList<String>();
        JSONArray jsonArray = new JSONArray();
        String csvFile = args[0];
        String line = "";
        String cvsSplitBy = ",";
        int lineCounter = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(cvsSplitBy);
                if (lineCounter == 0) {
                    for (String value : values) {
                        headers.add(value);
                    }
                } else {
                    JSONObject obj = new JSONObject();
                    int valueCounter = 0;
                    for (String value : values) {
                        obj.put(headers.get(valueCounter), value);
                        valueCounter++;
                    }
                    jsonArray.add(obj);
                }
                lineCounter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter file = new FileWriter("output.json")) {
            file.write(jsonArray.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```