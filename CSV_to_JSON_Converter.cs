class Program
{
    static void Main(string[] args)
    {
        string csvFilePath = args[0];
        string jsonFilePath = args[1];

        DataTable csvData = GetDataTableFromCSVFile(csvFilePath);

        string json = JsonConvert.SerializeObject(csvData, Formatting.Indented);

        File.WriteAllText(jsonFilePath, json);
    }