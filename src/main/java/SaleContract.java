
package main.java;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SaleContract {

    @SerializedName("buyers")
    private List<Buyer> mBuyers;
    @SerializedName("date")
    private String mDate;
    @SerializedName("groupId")
    private String mGroupId;
    @SerializedName("objectsOfSale")
    private List<ObjectsOfSale> mObjectsOfSale;
    @SerializedName("reference")
    private String mReference;
    @SerializedName("sellers")
    private List<Seller> mSellers;
    @SerializedName("type")
    private String mType;

    public List<Buyer> getBuyers() {
        return mBuyers;
    }

    public void setBuyers(List<Buyer> buyers) {
        mBuyers = buyers;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getGroupId() {
        return mGroupId;
    }

    public void setGroupId(String groupId) {
        mGroupId = groupId;
    }

    public List<ObjectsOfSale> getObjectsOfSale() {
        return mObjectsOfSale;
    }

    public void setObjectsOfSale(List<ObjectsOfSale> objectsOfSale) {
        mObjectsOfSale = objectsOfSale;
    }

    public String getReference() {
        return mReference;
    }

    public void setReference(String reference) {
        mReference = reference;
    }

    public List<Seller> getSellers() {
        return mSellers;
    }

    public void setSellers(List<Seller> sellers) {
        mSellers = sellers;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
