```CSharp
using System;
using System.IO;
using System.Data;
using Newtonsoft.Json;

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

    private static DataTable GetDataTableFromCSVFile(string csvFilePath)
    {
        DataTable csvData = new DataTable();

        try
        {
            using (StreamReader sr = new StreamReader(csvFilePath))
            {
                string[] headers = sr.ReadLine().Split(',');

                foreach (string header in headers)
                {
                    csvData.Columns.Add(header);
                }

                while (!sr.EndOfStream)
                {
                    string[] rows = sr.ReadLine().Split(',');

                    DataRow dr = csvData.NewRow();

                    for (int i = 0; i < headers.Length; i++)
                    {
                        dr[i] = rows[i];
                    }

                    csvData.Rows.Add(dr);
                }
            }
        }
        catch (Exception e)
        {
            Console.WriteLine("Error: " + e.Message);
        }

        return csvData;
    }
}
```