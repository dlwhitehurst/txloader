package com.dlwhitehurst;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CSVReader {

    public static List<Transaction> readCSV(String fileName) {
        List<Transaction> list = new ArrayList<>();
        String line;
        //DATE,TRANSACTION ID,DESCRIPTION,QUANTITY,SYMBOL,PRICE,COMMISSION,AMOUNT,
        // REG FEE,SHORT-TERM RDM FEE,FUND REDEMPTION FEE, DEFERRED SALES CHARGE
        //04/04/2023,49252224461,Sold 80 ERO @ 18.08,80,ERO,18.08,0.00,1446.38,0.02,,,

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Transaction obj = new Transaction();
                obj.setTxDate(values[0]);
                obj.setTxId(values[1]);
                obj.setTxDescription(values[2]);
                obj.setTxQuantity(values[3]);
                obj.setTxSymbol(values[4]);
                obj.setTxPrice(values[5]);
                obj.setTxCommission(values[6]);
                obj.setTxAmount(values[7]);
                obj.setTxRegFee(values[8]);
                obj.setTxShortTermRdmFee(values[9]);
                obj.setTxFundRedemptionFee(values[10]);
                obj.setTxDeferredSalesCharge(values[11]);

                list.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}