/*
Nigiri auto-generated file
*/
package net.webpossdk.objects;

import it.sdkboilerplate.objects.*;
import it.sdkboilerplate.validation.*;
import it.sdkboilerplate.exceptions.*;

import net.webpossdk.objects.schemas.*;

import java.util.HashMap;

public class PaymentOrderRetrieval extends SdkObject{
    public String uuid;
    public String reference;
    public String callback_url;
    public String details;
    public String redirect_url;
    public String expiration_time;
    public Integer btc_amount;
    public String amount;
    public Integer required_confirmations;
    public Integer expires_in;
    public String chargeback_date;
    public CurrencyRetrieval currency;
    public PaymentOrderState state;
    public PaymentOrderCreator created_by;
    public TransactionCollection transactions;
    public String dispute_start_date;
    public RateRetrieval rate;
    public String resolved_at;
    public String address;
    public String uri;
    public String created_at;
    public Schema getSchema() throws JsonSerializationException{
            return new Schema(PaymentOrderRetrievalSchema.jsonSchema);
        }
    public static HashMap<String, Class<? extends SdkBodyType>> getSubObjects() {
        HashMap<String, Class<? extends SdkBodyType>>  subObjects =  new HashMap();
        subObjects.put("currency" , CurrencyRetrieval.class);
        subObjects.put("state" , PaymentOrderState.class);
        subObjects.put("created_by" , PaymentOrderCreator.class);
        subObjects.put("transactions", TransactionCollection.class);
        subObjects.put("rate" , RateRetrieval.class);
        return subObjects;
        }
        public String getUuid(){
            return this.uuid;
        }
        public void setUuid(String value){
            this.uuid = value;
        }
        public String getReference(){
            return this.reference;
        }
        public void setReference(String value){
            this.reference = value;
        }
        public String getCallbackUrl(){
            return this.callback_url;
        }
        public void setCallbackUrl(String value){
            this.callback_url = value;
        }
        public String getDetails(){
            return this.details;
        }
        public void setDetails(String value){
            this.details = value;
        }
        public String getRedirectUrl(){
            return this.redirect_url;
        }
        public void setRedirectUrl(String value){
            this.redirect_url = value;
        }
        public String getExpirationTime(){
            return this.expiration_time;
        }
        public void setExpirationTime(String value){
            this.expiration_time = value;
        }
        public Integer getBtcAmount(){
            return this.btc_amount;
        }
        public void setBtcAmount(Integer value){
            this.btc_amount = value;
        }
        public String getAmount(){
            return this.amount;
        }
        public void setAmount(String value){
            this.amount = value;
        }
        public Integer getRequiredConfirmations(){
            return this.required_confirmations;
        }
        public void setRequiredConfirmations(Integer value){
            this.required_confirmations = value;
        }
        public Integer getExpiresIn(){
            return this.expires_in;
        }
        public void setExpiresIn(Integer value){
            this.expires_in = value;
        }
        public String getChargebackDate(){
            return this.chargeback_date;
        }
        public void setChargebackDate(String value){
            this.chargeback_date = value;
        }
        public CurrencyRetrieval getCurrency(){
            return this.currency;
        }
        public void setCurrency(CurrencyRetrieval value){
            this.currency = value;
        }
        public PaymentOrderState getState(){
            return this.state;
        }
        public void setState(PaymentOrderState value){
            this.state = value;
        }
        public PaymentOrderCreator getCreatedBy(){
            return this.created_by;
        }
        public void setCreatedBy(PaymentOrderCreator value){
            this.created_by = value;
        }
        public TransactionCollection getTransactions(){
            return this.transactions;
        }
        public void setTransactions(TransactionCollection value){
            this.transactions = value;
        }
        public String getDisputeStartDate(){
            return this.dispute_start_date;
        }
        public void setDisputeStartDate(String value){
            this.dispute_start_date = value;
        }
        public RateRetrieval getRate(){
            return this.rate;
        }
        public void setRate(RateRetrieval value){
            this.rate = value;
        }
        public String getResolvedAt(){
            return this.resolved_at;
        }
        public void setResolvedAt(String value){
            this.resolved_at = value;
        }
        public String getAddress(){
            return this.address;
        }
        public void setAddress(String value){
            this.address = value;
        }
        public String getUri(){
            return this.uri;
        }
        public void setUri(String value){
            this.uri = value;
        }
        public String getCreatedAt(){
            return this.created_at;
        }
        public void setCreatedAt(String value){
            this.created_at = value;
        }
        public PaymentOrderRetrieval(){}
}
