package com.dinobikic.shopapp.models;

import android.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 11.06.15..
 */
public class BeaconDiscount {
//    private List<NameValuePair> list = new ArrayList<NameValuePair>();
    List<Pair<String, String>> list  = new ArrayList<>();
    private Boolean seen;

    // TODO staviti tagove od apia
    String BEACON_ID = "factory_id";
    String DISCOUNT_ID_TAG = "discount_id";
    String DISCOUNT_TAG = "discountName";
    String PRODUCT_TAG = "discountProduct";
    String NEW_PRICE_TAG = "discountNewPrice";
    String OLD_PRICE_TAG = "discountOldPrice";
    String VALID_FROM_TAG = "discountValidFrom";
    String VALID_TO_TAG = "discountValidTo";
    String CODE_TAG = "code";


    public BeaconDiscount(List<Pair<String, String>> list, boolean seen)
    {
        this.list = list;
        this.seen = false;
    }

    public String getValue(String value){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).first.equals(value)){
                return list.get(i).second;
            }
        }
        return "";
    }


    public Void setValue(String tag, String value){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).first.equals(tag)){
                list.set(i, new Pair<>(tag, value));
            }
        }
        return null;
    }

    public boolean getSeen(){ return this.seen;}

    public void setSeen(){ this.seen = true;}

    public String getId(){
        return getValue(BEACON_ID);
    }

    public String getDiscount(){
        return getValue(DISCOUNT_TAG);
    }

    public String getDiscountId(){
        return getValue(DISCOUNT_ID_TAG);
    }

    public String getProduct(){
        return getValue(PRODUCT_TAG);
    }

    public String getNewPrice(){
        return getValue(NEW_PRICE_TAG);
    }

    public String getOldPrice(){
        return getValue(OLD_PRICE_TAG);
    }

    public String getValidFrom(){
        return getValue(VALID_FROM_TAG);
    }

    public String getValidTo(){
        return getValue(VALID_TO_TAG);
    }

    public String getCode(){
        return getValue(CODE_TAG);
    }

}
