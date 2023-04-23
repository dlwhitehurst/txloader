package com.dlwhitehurst;

public class Transaction {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String txDate;
    private String txId;
    private String txDescription;
    private String txQuantity;
    private String txSymbol;
    private String txPrice;
    private String txCommission;
    private String txAmount;
    private String txRegFee;
    private String txShortTermRdmFee;
    private String txFundRedemptionFee;
    private String txDeferredSalesCharge;

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public String getTxDescription() {
        return txDescription;
    }

    public void setTxDescription(String txDescription) {
        this.txDescription = txDescription;
    }

    public String getTxQuantity() {
        return txQuantity;
    }

    public void setTxQuantity(String txQuantity) {
        this.txQuantity = txQuantity;
    }

    public String getTxSymbol() {
        return txSymbol;
    }

    public void setTxSymbol(String txSymbol) {
        this.txSymbol = txSymbol;
    }

    public String getTxPrice() {
        return txPrice;
    }

    public void setTxPrice(String txPrice) {
        this.txPrice = txPrice;
    }

    public String getTxCommission() {
        return txCommission;
    }

    public void setTxCommission(String txCommission) {
        this.txCommission = txCommission;
    }

    public String getTxAmount() {
        return txAmount;
    }

    public void setTxAmount(String txAmount) {
        this.txAmount = txAmount;
    }

    public String getTxRegFee() {
        return txRegFee;
    }

    public void setTxRegFee(String txRegFee) {
        this.txRegFee = txRegFee;
    }

    public String getTxShortTermRdmFee() {
        return txShortTermRdmFee;
    }

    public void setTxShortTermRdmFee(String txShortTermRdmFee) {
        this.txShortTermRdmFee = txShortTermRdmFee;
    }

    public String getTxFundRedemptionFee() {
        return txFundRedemptionFee;
    }

    public void setTxFundRedemptionFee(String txFundRedemptionFee) {
        this.txFundRedemptionFee = txFundRedemptionFee;
    }

    public String getTxDeferredSalesCharge() {
        return txDeferredSalesCharge;
    }

    public void setTxDeferredSalesCharge(String txDeferredSalesCharge) {
        this.txDeferredSalesCharge = txDeferredSalesCharge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
