
package main.java;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Beneficiary {

    @SerializedName("account")
    private Account mAccount;
    @SerializedName("bankOffice")
    private BankOffice mBankOffice;
    @SerializedName("birthDate")
    private String mBirthDate;
    @SerializedName("communicationChannels")
    private List<String> mCommunicationChannels;
    @SerializedName("contactDetails")
    private List<ContactDetail> mContactDetails;
    @SerializedName("epkId")
    private Object mEpkId;
    @SerializedName("firstName")
    private String mFirstName;
    @SerializedName("identityDocument")
    private IdentityDocument mIdentityDocument;
    @SerializedName("isResident")
    private Boolean mIsResident;
    @SerializedName("lastName")
    private String mLastName;
    @SerializedName("middleName")
    private String mMiddleName;

    public Account getAccount() {
        return mAccount;
    }

    public void setAccount(Account account) {
        mAccount = account;
    }

    public BankOffice getBankOffice() {
        return mBankOffice;
    }

    public void setBankOffice(BankOffice bankOffice) {
        mBankOffice = bankOffice;
    }

    public String getBirthDate() {
        return mBirthDate;
    }

    public void setBirthDate(String birthDate) {
        mBirthDate = birthDate;
    }

    public List<String> getCommunicationChannels() {
        return mCommunicationChannels;
    }

    public void setCommunicationChannels(List<String> communicationChannels) {
        mCommunicationChannels = communicationChannels;
    }

    public List<ContactDetail> getContactDetails() {
        return mContactDetails;
    }

    public void setContactDetails(List<ContactDetail> contactDetails) {
        mContactDetails = contactDetails;
    }

    public Object getEpkId() {
        return mEpkId;
    }

    public void setEpkId(Object epkId) {
        mEpkId = epkId;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public IdentityDocument getIdentityDocument() {
        return mIdentityDocument;
    }

    public void setIdentityDocument(IdentityDocument identityDocument) {
        mIdentityDocument = identityDocument;
    }

    public Boolean getIsResident() {
        return mIsResident;
    }

    public void setIsResident(Boolean isResident) {
        mIsResident = isResident;
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
