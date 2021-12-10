
package main.java;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class IdentityDocument {

    @SerializedName("docType")
    private String mDocType;
    @SerializedName("number")
    private String mNumber;
    @SerializedName("series")
    private String mSeries;

    public String getDocType() {
        return mDocType;
    }

    public void setDocType(String docType) {
        mDocType = docType;
    }

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        mNumber = number;
    }

    public String getSeries() {
        return mSeries;
    }

    public void setSeries(String series) {
        mSeries = series;
    }

}
