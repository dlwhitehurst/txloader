package com.dlwhitehurst;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

public class TransactionPoster {
    public static void postTransaction(Transaction tx) {
            CloseableHttpClient instance = HttpClientBuilder.create().build();

            final HttpPost request = new HttpPost("http://localhost:8080/api/v1/transactions");
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("txDate", tx.getTxDate()));
            nameValuePairs.add(new BasicNameValuePair("txId", tx.getTxId()));
            nameValuePairs.add(new BasicNameValuePair("txDescription", tx.getTxDescription()));
            nameValuePairs.add(new BasicNameValuePair("txDescription", tx.getTxDescription()));
            nameValuePairs.add(new BasicNameValuePair("txQuantity", tx.getTxQuantity()));
            nameValuePairs.add(new BasicNameValuePair("txSymbol", tx.getTxSymbol()));
            nameValuePairs.add(new BasicNameValuePair("txPrice", tx.getTxPrice()));
            nameValuePairs.add(new BasicNameValuePair("txCommission", tx.getTxCommission()));
            nameValuePairs.add(new BasicNameValuePair("txAmount", tx.getTxAmount()));
            nameValuePairs.add(new BasicNameValuePair("txRegFee", tx.getTxRegFee()));
            nameValuePairs.add(new BasicNameValuePair("txShortTermRdmFee", tx.getTxShortTermRdmFee()));
            nameValuePairs.add(new BasicNameValuePair("txFundRedemptionFee", tx.getTxFundRedemptionFee()));
            nameValuePairs.add(new BasicNameValuePair("txDeferredSalesCharge", tx.getTxDeferredSalesCharge()));

            JSONObject jsonObject = new JSONObject();
            for (NameValuePair nameValuePair : nameValuePairs) {
                jsonObject.put(nameValuePair.getName(), nameValuePair.getValue());
            }

        try {
            request.setEntity(new StringEntity(jsonObject.toString()));
            request.setHeader("Content-type","application/json");
            instance.execute(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
