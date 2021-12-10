
package main.java;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Account {

    @SerializedName("bank")
    private Bank mBank;
    @SerializedName("number")
    private String mNumber;

    public Bank getBank() {
        return mBank;
    }

    public void setBank(Bank bank) {
        mBank = bank;
    }

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        mNumber = number;
    }

}
