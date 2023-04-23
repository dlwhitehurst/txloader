package com.dlwhitehurst;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transaction> list = new ArrayList<>();
        list = CSVReader.readCSV("C:/Users/jwlyn/Downloads/output.csv");
        for (Transaction obj : list) {
            // use static method to POST Transaction
            TransactionPoster.postTransaction(obj);
            System.out.println(obj.getTxAmount());
        }
    }
}