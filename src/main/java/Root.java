
package main.java;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Root {

    @SerializedName("additionalParams")
    private Object mAdditionalParams;
    @SerializedName("date")
    private String mDate;
    @SerializedName("error")
    private Object mError;
    @SerializedName("lci")
    private Lci mLci;
    @SerializedName("reference")
    private String mReference;

    public Object getAdditionalParams() {
        return mAdditionalParams;
    }

    public void setAdditionalParams(Object additionalParams) {
        mAdditionalParams = additionalParams;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public Object getError() {
        return mError;
    }

    public void setError(Object error) {
        mError = error;
    }

    public Lci getLci() {
        return mLci;
    }

    public void setLci(Lci lci) {
        mLci = lci;
    }

    public String getReference() {
        return mReference;
    }

    public void setReference(String reference) {
        mReference = reference;
    }

}
