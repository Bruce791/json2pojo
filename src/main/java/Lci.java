
package main.java;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Lci {

    @SerializedName("advisingBank")
    private AdvisingBank mAdvisingBank;
    @SerializedName("amountCurrency")
    private String mAmountCurrency;
    @SerializedName("amountValue")
    private Double mAmountValue;
    @SerializedName("applicant")
    private Applicant mApplicant;
    @SerializedName("applicantConfirmations")
    private List<String> mApplicantConfirmations;
    @SerializedName("applicationBankOffice")
    private ApplicationBankOffice mApplicationBankOffice;
    @SerializedName("availabilityType")
    private String mAvailabilityType;
    @SerializedName("balanceValue")
    private Object mBalanceValue;
    @SerializedName("bankMars")
    private List<String> mBankMars;
    @SerializedName("beneficiary")
    private Beneficiary mBeneficiary;
    @SerializedName("closeData")
    private Object mCloseData;
    @SerializedName("commission")
    private Commission mCommission;
    @SerializedName("conclusionDate")
    private String mConclusionDate;
    @SerializedName("coverageAccount")
    private CoverageAccount mCoverageAccount;
    @SerializedName("creationTime")
    private String mCreationTime;
    @SerializedName("creditContractDate")
    private Object mCreditContractDate;
    @SerializedName("creditContractNumber")
    private Object mCreditContractNumber;
    @SerializedName("creditFundsAccountNumber")
    private Object mCreditFundsAccountNumber;
    @SerializedName("creditFundsAmountValue")
    private Long mCreditFundsAmountValue;
    @SerializedName("documentPresentationPeriodType")
    private Object mDocumentPresentationPeriodType;
    @SerializedName("draftChannel")
    private Object mDraftChannel;
    @SerializedName("draftId")
    private Object mDraftId;
    @SerializedName("expireDate")
    private String mExpireDate;
    @SerializedName("externalReference")
    private String mExternalReference;
    @SerializedName("hasVat")
    private Boolean mHasVat;
    @SerializedName("isAlternative")
    private Boolean mIsAlternative;
    @SerializedName("isAutoCreated")
    private Boolean mIsAutoCreated;
    @SerializedName("isConfirmationRequired")
    private Boolean mIsConfirmationRequired;
    @SerializedName("isCovered")
    private Boolean mIsCovered;
    @SerializedName("isDigitalDocumentsAllowed")
    private Boolean mIsDigitalDocumentsAllowed;
    @SerializedName("isEGRNRequestAllowed")
    private Boolean mIsEGRNRequestAllowed;
    @SerializedName("isEGRNStatementExecution")
    private Boolean mIsEGRNStatementExecution;
    @SerializedName("isEarlyClosureAllowed")
    private Boolean mIsEarlyClosureAllowed;
    @SerializedName("isFirstSale")
    private Boolean mIsFirstSale;
    @SerializedName("isMortgage")
    private Boolean mIsMortgage;
    @SerializedName("isPartialAvailabilityAllowed")
    private Boolean mIsPartialAvailabilityAllowed;
    @SerializedName("isRevocable")
    private Boolean mIsRevocable;
    @SerializedName("isTransferanceAllowed")
    private Boolean mIsTransferanceAllowed;
    @SerializedName("issueLcChannel")
    private String mIssueLcChannel;
    @SerializedName("issuingBank")
    private IssuingBank mIssuingBank;
    @SerializedName("linkedDeals")
    private Object mLinkedDeals;
    @SerializedName("linkedDealsEscrow")
    private String mLinkedDealsEscrow;
    @SerializedName("modificationTime")
    private String mModificationTime;
    @SerializedName("nominatedBank")
    private NominatedBank mNominatedBank;
    @SerializedName("objectDeal")
    private Object mObjectDeal;
    @SerializedName("offBalanceSheetAccount")
    private OffBalanceSheetAccount mOffBalanceSheetAccount;
    @SerializedName("operatorId")
    private String mOperatorId;
    @SerializedName("operatorName")
    private String mOperatorName;
    @SerializedName("ownFundsAccountNumber")
    private String mOwnFundsAccountNumber;
    @SerializedName("ownFundsAmountValue")
    private Double mOwnFundsAmountValue;
    @SerializedName("paymentPurpose")
    private String mPaymentPurpose;
    @SerializedName("reference")
    private String mReference;
    @SerializedName("saleContracts")
    private List<SaleContract> mSaleContracts;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("submittedDocumentsRequirements")
    private List<SubmittedDocumentsRequirement> mSubmittedDocumentsRequirements;
    @SerializedName("techAccount")
    private String mTechAccount;

    public AdvisingBank getAdvisingBank() {
        return mAdvisingBank;
    }

    public void setAdvisingBank(AdvisingBank advisingBank) {
        mAdvisingBank = advisingBank;
    }

    public String getAmountCurrency() {
        return mAmountCurrency;
    }

    public void setAmountCurrency(String amountCurrency) {
        mAmountCurrency = amountCurrency;
    }

    public Double getAmountValue() {
        return mAmountValue;
    }

    public void setAmountValue(Double amountValue) {
        mAmountValue = amountValue;
    }

    public Applicant getApplicant() {
        return mApplicant;
    }

    public void setApplicant(Applicant applicant) {
        mApplicant = applicant;
    }

    public List<String> getApplicantConfirmations() {
        return mApplicantConfirmations;
    }

    public void setApplicantConfirmations(List<String> applicantConfirmations) {
        mApplicantConfirmations = applicantConfirmations;
    }

    public ApplicationBankOffice getApplicationBankOffice() {
        return mApplicationBankOffice;
    }

    public void setApplicationBankOffice(ApplicationBankOffice applicationBankOffice) {
        mApplicationBankOffice = applicationBankOffice;
    }

    public String getAvailabilityType() {
        return mAvailabilityType;
    }

    public void setAvailabilityType(String availabilityType) {
        mAvailabilityType = availabilityType;
    }

    public Object getBalanceValue() {
        return mBalanceValue;
    }

    public void setBalanceValue(Object balanceValue) {
        mBalanceValue = balanceValue;
    }

    public List<String> getBankMars() {
        return mBankMars;
    }

    public void setBankMars(List<String> bankMars) {
        mBankMars = bankMars;
    }

    public Beneficiary getBeneficiary() {
        return mBeneficiary;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        mBeneficiary = beneficiary;
    }

    public Object getCloseData() {
        return mCloseData;
    }

    public void setCloseData(Object closeData) {
        mCloseData = closeData;
    }

    public Commission getCommission() {
        return mCommission;
    }

    public void setCommission(Commission commission) {
        mCommission = commission;
    }

    public String getConclusionDate() {
        return mConclusionDate;
    }

    public void setConclusionDate(String conclusionDate) {
        mConclusionDate = conclusionDate;
    }

    public CoverageAccount getCoverageAccount() {
        return mCoverageAccount;
    }

    public void setCoverageAccount(CoverageAccount coverageAccount) {
        mCoverageAccount = coverageAccount;
    }

    public String getCreationTime() {
        return mCreationTime;
    }

    public void setCreationTime(String creationTime) {
        mCreationTime = creationTime;
    }

    public Object getCreditContractDate() {
        return mCreditContractDate;
    }

    public void setCreditContractDate(Object creditContractDate) {
        mCreditContractDate = creditContractDate;
    }

    public Object getCreditContractNumber() {
        return mCreditContractNumber;
    }

    public void setCreditContractNumber(Object creditContractNumber) {
        mCreditContractNumber = creditContractNumber;
    }

    public Object getCreditFundsAccountNumber() {
        return mCreditFundsAccountNumber;
    }

    public void setCreditFundsAccountNumber(Object creditFundsAccountNumber) {
        mCreditFundsAccountNumber = creditFundsAccountNumber;
    }

    public Long getCreditFundsAmountValue() {
        return mCreditFundsAmountValue;
    }

    public void setCreditFundsAmountValue(Long creditFundsAmountValue) {
        mCreditFundsAmountValue = creditFundsAmountValue;
    }

    public Object getDocumentPresentationPeriodType() {
        return mDocumentPresentationPeriodType;
    }

    public void setDocumentPresentationPeriodType(Object documentPresentationPeriodType) {
        mDocumentPresentationPeriodType = documentPresentationPeriodType;
    }

    public Object getDraftChannel() {
        return mDraftChannel;
    }

    public void setDraftChannel(Object draftChannel) {
        mDraftChannel = draftChannel;
    }

    public Object getDraftId() {
        return mDraftId;
    }

    public void setDraftId(Object draftId) {
        mDraftId = draftId;
    }

    public String getExpireDate() {
        return mExpireDate;
    }

    public void setExpireDate(String expireDate) {
        mExpireDate = expireDate;
    }

    public String getExternalReference() {
        return mExternalReference;
    }

    public void setExternalReference(String externalReference) {
        mExternalReference = externalReference;
    }

    public Boolean getHasVat() {
        return mHasVat;
    }

    public void setHasVat(Boolean hasVat) {
        mHasVat = hasVat;
    }

    public Boolean getIsAlternative() {
        return mIsAlternative;
    }

    public void setIsAlternative(Boolean isAlternative) {
        mIsAlternative = isAlternative;
    }

    public Boolean getIsAutoCreated() {
        return mIsAutoCreated;
    }

    public void setIsAutoCreated(Boolean isAutoCreated) {
        mIsAutoCreated = isAutoCreated;
    }

    public Boolean getIsConfirmationRequired() {
        return mIsConfirmationRequired;
    }

    public void setIsConfirmationRequired(Boolean isConfirmationRequired) {
        mIsConfirmationRequired = isConfirmationRequired;
    }

    public Boolean getIsCovered() {
        return mIsCovered;
    }

    public void setIsCovered(Boolean isCovered) {
        mIsCovered = isCovered;
    }

    public Boolean getIsDigitalDocumentsAllowed() {
        return mIsDigitalDocumentsAllowed;
    }

    public void setIsDigitalDocumentsAllowed(Boolean isDigitalDocumentsAllowed) {
        mIsDigitalDocumentsAllowed = isDigitalDocumentsAllowed;
    }

    public Boolean getIsEGRNRequestAllowed() {
        return mIsEGRNRequestAllowed;
    }

    public void setIsEGRNRequestAllowed(Boolean isEGRNRequestAllowed) {
        mIsEGRNRequestAllowed = isEGRNRequestAllowed;
    }

    public Boolean getIsEGRNStatementExecution() {
        return mIsEGRNStatementExecution;
    }

    public void setIsEGRNStatementExecution(Boolean isEGRNStatementExecution) {
        mIsEGRNStatementExecution = isEGRNStatementExecution;
    }

    public Boolean getIsEarlyClosureAllowed() {
        return mIsEarlyClosureAllowed;
    }

    public void setIsEarlyClosureAllowed(Boolean isEarlyClosureAllowed) {
        mIsEarlyClosureAllowed = isEarlyClosureAllowed;
    }

    public Boolean getIsFirstSale() {
        return mIsFirstSale;
    }

    public void setIsFirstSale(Boolean isFirstSale) {
        mIsFirstSale = isFirstSale;
    }

    public Boolean getIsMortgage() {
        return mIsMortgage;
    }

    public void setIsMortgage(Boolean isMortgage) {
        mIsMortgage = isMortgage;
    }

    public Boolean getIsPartialAvailabilityAllowed() {
        return mIsPartialAvailabilityAllowed;
    }

    public void setIsPartialAvailabilityAllowed(Boolean isPartialAvailabilityAllowed) {
        mIsPartialAvailabilityAllowed = isPartialAvailabilityAllowed;
    }

    public Boolean getIsRevocable() {
        return mIsRevocable;
    }

    public void setIsRevocable(Boolean isRevocable) {
        mIsRevocable = isRevocable;
    }

    public Boolean getIsTransferanceAllowed() {
        return mIsTransferanceAllowed;
    }

    public void setIsTransferanceAllowed(Boolean isTransferanceAllowed) {
        mIsTransferanceAllowed = isTransferanceAllowed;
    }

    public String getIssueLcChannel() {
        return mIssueLcChannel;
    }

    public void setIssueLcChannel(String issueLcChannel) {
        mIssueLcChannel = issueLcChannel;
    }

    public IssuingBank getIssuingBank() {
        return mIssuingBank;
    }

    public void setIssuingBank(IssuingBank issuingBank) {
        mIssuingBank = issuingBank;
    }

    public Object getLinkedDeals() {
        return mLinkedDeals;
    }

    public void setLinkedDeals(Object linkedDeals) {
        mLinkedDeals = linkedDeals;
    }

    public String getLinkedDealsEscrow() {
        return mLinkedDealsEscrow;
    }

    public void setLinkedDealsEscrow(String linkedDealsEscrow) {
        mLinkedDealsEscrow = linkedDealsEscrow;
    }

    public String getModificationTime() {
        return mModificationTime;
    }

    public void setModificationTime(String modificationTime) {
        mModificationTime = modificationTime;
    }

    public NominatedBank getNominatedBank() {
        return mNominatedBank;
    }

    public void setNominatedBank(NominatedBank nominatedBank) {
        mNominatedBank = nominatedBank;
    }

    public Object getObjectDeal() {
        return mObjectDeal;
    }

    public void setObjectDeal(Object objectDeal) {
        mObjectDeal = objectDeal;
    }

    public OffBalanceSheetAccount getOffBalanceSheetAccount() {
        return mOffBalanceSheetAccount;
    }

    public void setOffBalanceSheetAccount(OffBalanceSheetAccount offBalanceSheetAccount) {
        mOffBalanceSheetAccount = offBalanceSheetAccount;
    }

    public String getOperatorId() {
        return mOperatorId;
    }

    public void setOperatorId(String operatorId) {
        mOperatorId = operatorId;
    }

    public String getOperatorName() {
        return mOperatorName;
    }

    public void setOperatorName(String operatorName) {
        mOperatorName = operatorName;
    }

    public String getOwnFundsAccountNumber() {
        return mOwnFundsAccountNumber;
    }

    public void setOwnFundsAccountNumber(String ownFundsAccountNumber) {
        mOwnFundsAccountNumber = ownFundsAccountNumber;
    }

    public Double getOwnFundsAmountValue() {
        return mOwnFundsAmountValue;
    }

    public void setOwnFundsAmountValue(Double ownFundsAmountValue) {
        mOwnFundsAmountValue = ownFundsAmountValue;
    }

    public String getPaymentPurpose() {
        return mPaymentPurpose;
    }

    public void setPaymentPurpose(String paymentPurpose) {
        mPaymentPurpose = paymentPurpose;
    }

    public String getReference() {
        return mReference;
    }

    public void setReference(String reference) {
        mReference = reference;
    }

    public List<SaleContract> getSaleContracts() {
        return mSaleContracts;
    }

    public void setSaleContracts(List<SaleContract> saleContracts) {
        mSaleContracts = saleContracts;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public List<SubmittedDocumentsRequirement> getSubmittedDocumentsRequirements() {
        return mSubmittedDocumentsRequirements;
    }

    public void setSubmittedDocumentsRequirements(List<SubmittedDocumentsRequirement> submittedDocumentsRequirements) {
        mSubmittedDocumentsRequirements = submittedDocumentsRequirements;
    }

    public String getTechAccount() {
        return mTechAccount;
    }

    public void setTechAccount(String techAccount) {
        mTechAccount = techAccount;
    }

}
