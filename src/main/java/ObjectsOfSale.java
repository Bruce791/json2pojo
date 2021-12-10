
package main.java;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ObjectsOfSale {

    @SerializedName("address")
    private String mAddress;
    @SerializedName("allCadastralNumbers")
    private Object mAllCadastralNumbers;
    @SerializedName("cadastralNumber")
    private List<String> mCadastralNumber;
    @SerializedName("estateObjectDescription")
    private Object mEstateObjectDescription;
    @SerializedName("estateType")
    private String mEstateType;
    @SerializedName("groupId")
    private String mGroupId;

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public Object getAllCadastralNumbers() {
        return mAllCadastralNumbers;
    }

    public void setAllCadastralNumbers(Object allCadastralNumbers) {
        mAllCadastralNumbers = allCadastralNumbers;
    }

    public List<String> getCadastralNumber() {
        return mCadastralNumber;
    }

    public void setCadastralNumber(List<String> cadastralNumber) {
        mCadastralNumber = cadastralNumber;
    }

    public Object getEstateObjectDescription() {
        return mEstateObjectDescription;
    }

    public void setEstateObjectDescription(Object estateObjectDescription) {
        mEstateObjectDescription = estateObjectDescription;
    }

    public String getEstateType() {
        return mEstateType;
    }

    public void setEstateType(String estateType) {
        mEstateType = estateType;
    }

    public String getGroupId() {
        return mGroupId;
    }

    public void setGroupId(String groupId) {
        mGroupId = groupId;
    }

}
