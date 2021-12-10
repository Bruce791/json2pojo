
package main.java;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SubmittedDocumentsRequirement {

    @SerializedName("groupId")
    private String mGroupId;
    @SerializedName("submittedDocuments")
    private List<String> mSubmittedDocuments;

    public String getGroupId() {
        return mGroupId;
    }

    public void setGroupId(String groupId) {
        mGroupId = groupId;
    }

    public List<String> getSubmittedDocuments() {
        return mSubmittedDocuments;
    }

    public void setSubmittedDocuments(List<String> submittedDocuments) {
        mSubmittedDocuments = submittedDocuments;
    }

}
