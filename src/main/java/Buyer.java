
package main.java;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Buyer {

    @SerializedName("companyName")
    private Object mCompanyName;
    @SerializedName("firstName")
    private String mFirstName;
    @SerializedName("groupId")
    private String mGroupId;
    @SerializedName("lastName")
    private String mLastName;
    @SerializedName("middleName")
    private String mMiddleName;

    public Object getCompanyName() {
        return mCompanyName;
    }

    public void setCompanyName(Object companyName) {
        mCompanyName = companyName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getGroupId() {
        return mGroupId;
    }

    public void setGroupId(String groupId) {
        mGroupId = groupId;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public String getMiddleName() {
        return mMiddleName;
    }

    public void setMiddleName(String middleName) {
        mMiddleName = middleName;
    }

}
