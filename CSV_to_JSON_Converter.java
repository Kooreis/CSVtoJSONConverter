public class CSVtoJSONConverter {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String> headers = new ArrayList<String>();
        JSONArray jsonArray = new JSONArray();
        String csvFile = args[0];
        String line = "";
        String cvsSplitBy = ",";
        int lineCounter = 0;