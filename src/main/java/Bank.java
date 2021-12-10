
package main.java;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Bank {

    @SerializedName("bic")
    private String mBic;
    @SerializedName("correspondentAccount")
    private String mCorrespondentAccount;
    @SerializedName("inn")
    private String mInn;
    @SerializedName("name")
    private String mName;
    @SerializedName("swift")
    private String mSwift;

    public String getBic() {
        return mBic;
    }

    public void setBic(String bic) {
        mBic = bic;
    }

    public String getCorrespondentAccount() {
        return mCorrespondentAccount;
    }

    public void setCorrespondentAccount(String correspondentAccount) {
        mCorrespondentAccount = correspondentAccount;
    }

    public String getInn() {
        return mInn;
    }

    public void setInn(String inn) {
        mInn = inn;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getSwift() {
        return mSwift;
    }

    public void setSwift(String swift) {
        mSwift = swift;
    }

}
