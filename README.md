# Python Documentation

# CSV to JSON Converter

This Python script is designed to convert a CSV file into a JSON file. It reads data from a specified CSV file and writes it into a JSON file.

## Libraries Used

- `csv`: This is a built-in Python library for reading and writing CSV files. It provides functionality to both read from and write to CSV files.

- `json`: This is another built-in Python library. It is used for parsing JSON. It can parse JSON from strings or files and it can also convert Python dictionaries into JSON strings.

- `sys`: This built-in Python library provides access to some variables used or maintained by the Python interpreter and to functions that interact strongly with the interpreter.

## How the Script Works

The script defines a function `csv_to_json(csvFilePath, jsonFilePath)` that takes two arguments: the path to the CSV file and the path to the JSON file.

1. It first creates an empty list `jsonArray`.

2. It then opens the CSV file using the `csv` library's `DictReader` function, which converts each row of the CSV file into a dictionary.

3. Each dictionary is then appended to `jsonArray`.

4. The `jsonArray` is then written to the JSON file using the `json` library's `dumps` function, which converts a Python object into a JSON string.

5. The JSON string is then written to the JSON file with an indentation of 4 spaces for readability.

To use the script, you need to specify the paths to the CSV and JSON files:

```python
csvFilePath = r'Path_to_your_CSV_file'
jsonFilePath = r'Path_to_save_JSON_file'
```

Then call the function:

```python
csv_to_json(csvFilePath, jsonFilePath)
```

This will create a JSON file with the same data as the CSV file.

---

# C# Documentation

# CSV to JSON Converter in C#

This C# script is designed to convert a CSV file into a JSON file. It reads a CSV file, converts the data into a DataTable, and then serializes the DataTable into a JSON format. The JSON data is then written into a JSON file.

## Libraries Used

### System

This is a fundamental library in C# that provides classes for input/output via streams, file handling, mathematical functions, and other basic utilities.

### System.IO

This library is used for reading and writing to files, which is essential in this script for reading the CSV file and writing the JSON file.

### System.Data

This library is used for working with data stored in databases or other data sources. In this script, it is used to create a DataTable to store the data from the CSV file.

### Newtonsoft.Json

This library is a popular high-performance JSON framework for .NET. It is used in this script to serialize the DataTable into a JSON format.

## Code Explanation

The script begins by taking two command-line arguments: the path of the CSV file to be converted and the path of the JSON file to be created.

The CSV file is read and converted into a DataTable using the `GetDataTableFromCSVFile` function. This function reads the CSV file line by line. The first line, which is assumed to contain the column headers, is used to create the columns of the DataTable. The following lines are then read and added as rows to the DataTable.

Once the CSV data is stored in the DataTable, it is serialized into a JSON format using the `JsonConvert.SerializeObject` function from the Newtonsoft.Json library. The JSON data is then written into the specified JSON file using the `File.WriteAllText` function.

If any errors occur during the reading of the CSV file or the creation of the DataTable, they are caught and printed to the console.

---

# Java Documentation

# CSV to JSON Converter

This Java script is designed to convert a CSV file into a JSON file. It reads a CSV file, parses the data, and then writes it into a JSON file.

## Libraries Used

- `java.io.BufferedReader`: This class reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.

- `java.io.FileReader`: This class is used to read data from the file. It creates a new FileReader, given the name of the file to read from.

- `java.io.FileWriter`: This class is used to write to character files. The constructors of this class assume that the default character encoding and the default byte-buffer size are acceptable.

- `java.io.IOException`: This class is used for handling exceptions of type IOException. An IOException is thrown when an input-output operation is failed or interrupted.

- `java.util.ArrayList`: This class implements the List interface. It uses a dynamic array to store the duplicate element of different data types.

- `java.util.List`: This interface is a member of the Java Collections Framework and extends Collection. It is an ordered collection of elements.

- `org.json.simple.JSONArray`: This class is used to create a JSON array.

- `org.json.simple.JSONObject`: This class is used to create a JSON object.

## How the Script Works

The script starts by defining a list to hold the headers of the CSV file and a JSONArray to hold the JSON objects that will be created from the CSV data.

The script then opens the CSV file and reads it line by line. The first line, which contains the headers, is split into an array and each header is added to the headers list.

For each subsequent line, the script creates a new JSONObject. It splits the line into an array and for each value in the array, it adds a new property to the JSONObject with the corresponding header as the key and the value from the array as the value.

Once all lines have been read and all JSONObjects have been created, they are added to the JSONArray.

Finally, the script writes the JSONArray to a new file called "output.json". If any errors occur during this process, they are caught and printed to the console.

---
