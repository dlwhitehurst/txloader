package com.dlwhitehurst;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVNullToZero {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("C:/Users/jwlyn/Downloads/working.csv");
            CSVParser csvParser = null;
            csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withNullString(""));
            CSVPrinter csvPrinter = null;
            csvPrinter = new CSVPrinter(new FileWriter("C:/Users/jwlyn/Downloads/output.csv"), CSVFormat.DEFAULT.withNullString("0"));
            for (CSVRecord csvRecord : csvParser) {
                try {
                    csvPrinter.printRecord(csvRecord);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            csvParser.close();
            csvPrinter.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
