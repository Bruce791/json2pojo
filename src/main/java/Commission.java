
package main.java;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Commission {

    @SerializedName("chargeAccount")
    private String mChargeAccount;
    @SerializedName("chargesPayingPartyType")
    private String mChargesPayingPartyType;
    @SerializedName("chargesType")
    private Object mChargesType;
    @SerializedName("commissionAmount")
    private Object mCommissionAmount;

    public String getChargeAccount() {
        return mChargeAccount;
    }

    public void setChargeAccount(String chargeAccount) {
        mChargeAccount = chargeAccount;
    }

    public String getChargesPayingPartyType() {
        return mChargesPayingPartyType;
    }

    public void setChargesPayingPartyType(String chargesPayingPartyType) {
        mChargesPayingPartyType = chargesPayingPartyType;
    }

    public Object getChargesType() {
        return mChargesType;
    }

    public void setChargesType(Object chargesType) {
        mChargesType = chargesType;
    }

    public Object getCommissionAmount() {
        return mCommissionAmount;
    }

    public void setCommissionAmount(Object commissionAmount) {
        mCommissionAmount = commissionAmount;
    }

}
