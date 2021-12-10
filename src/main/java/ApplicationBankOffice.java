
package main.java;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ApplicationBankOffice {

    @SerializedName("bankBranchKey")
    private String mBankBranchKey;
    @SerializedName("bankRegionalName")
    private String mBankRegionalName;
    @SerializedName("bic")
    private String mBic;
    @SerializedName("name")
    private String mName;
    @SerializedName("officeCode")
    private String mOfficeCode;
    @SerializedName("osbCode")
    private String mOsbCode;

    public String getBankBranchKey() {
        return mBankBranchKey;
    }

    public void setBankBranchKey(String bankBranchKey) {
        mBankBranchKey = bankBranchKey;
    }

    public String getBankRegionalName() {
        return mBankRegionalName;
    }

    public void setBankRegionalName(String bankRegionalName) {
        mBankRegionalName = bankRegionalName;
    }

    public String getBic() {
        return mBic;
    }

    public void setBic(String bic) {
        mBic = bic;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getOfficeCode() {
        return mOfficeCode;
    }

    public void setOfficeCode(String officeCode) {
        mOfficeCode = officeCode;
    }

    public String getOsbCode() {
        return mOsbCode;
    }

    public void setOsbCode(String osbCode) {
        mOsbCode = osbCode;
    }

}
