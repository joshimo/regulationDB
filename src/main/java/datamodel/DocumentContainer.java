package datamodel;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.*;


@Entity
@Table(name = "instrumentation_main")
public class DocumentContainer implements Serializable {

    @Id
    @Column(name = "DOCUMENT_NUMBER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer docNum;

    @Basic
    @NotEmpty
    @Size(min = 3, max = 255)
    @Column(name = "DOCUMENT_NAME")
    private String docName = "";

    @Basic
    @NotEmpty
    @Size(min = 3, max = 255)
    @Column(name = "DOCUMENT_DESCRIPTION")
    private String docDescription = "";

    @Basic
    @NotEmpty
    @Size(min = 4, max = 255)
    @Column(name = "DOCUMENT_FILE_NAME")
    private String docFileName;

    @Basic
    @Column(name = "DOCUMENT_BLOB")
    private Byte[] docStream;

    @Basic
    @NotEmpty
    @Size(min = 2, max = 64)
    @Column(name = "DOCUMENT_TYPE")
    private String docType = "";

    @Basic
    @Column(name = "MANDATORY_UA")
    private Boolean mandatoryUA = false;

    @Basic
    @Column(name = "MANDATORY_RK")
    private Boolean mandatoryRK = false;

    @Basic
    @Column(name = "MANDATORY_RU")
    private Boolean mandatoryRU = false;

    @Basic
    @Column(name = "APPLICATION_GENERAL")
    private Boolean applicationGeneral = false;

    @Basic
    @Column(name = "APPLICATION_MEASUREMENT")
    private Boolean applicationMeasurement = false;

    @Basic
    @Column(name = "APPLICATION_SAFETY")
    private Boolean applicationSafety = false;

    @Basic
    @Column(name = "APPLICATION_ASUTP")
    private Boolean applicationASUTP = false;

    @Basic
    @Column(name = "APPLICATION_PROCESS")
    private Boolean applicationProcess = false;

    @Basic
    @Column(name = "APPLICATION_PIPING")
    private Boolean applicationPiping = false;

    @Basic
    @Column(name = "APPLICATION_ELECTRICAL")
    private Boolean applicationElectrical = false;

    @Basic
    @Column(name = "APPLICATION_CONSTRUCTION")
    private Boolean applicationConstruction = false;

    @Basic
    @Column(name = "APPLICATION_CABLE_ROUTING")
    private Boolean applicationCableRouting = false;

    @Basic
    @Column(name = "APPLICATION_PID")
    private Boolean applicationPID = false;

    @Basic
    @Column(name = "APPLICATION_SPDS_ESKD")
    private Boolean applicationSPDS = false;

    @Basic
    @Column(name = "APPLICATION_DOCUMENTS_DESIGN")
    private Boolean applicationDocumentDesign = false;

    @Basic
    @Column(name = "HASHTAG01")
    private String hashTag01;

    @Basic
    @Column(name = "HASHTAG02")
    private String hashTag02;

    @Basic
    @Column(name = "HASHTAG03")
    private String hashTag03;

    @Basic
    @Column(name = "HASHTAG04")
    private String hashTag04;

    @Basic
    @Size(max = 255)
    @Column(name = "NOTES")
    private String notes;

    @Basic
    @Min(1)
    @Column (name = "HashSum")
    private long hashSum;


    public Integer getDocNum() {
        return docNum;
    }

    public String getDocName() {
        return docName;
    }

    public String getDocDescription() {
        return docDescription;
    }

    public String getDocFileName() {
        return docFileName;
    }

    public Byte[] getDocStream() {
        return docStream;
    }

    public String getDocType() {
        return docType;
    }

    public Boolean getMandatoryUA() {
        return mandatoryUA;
    }

    public Boolean getMandatoryRK() {
        return mandatoryRK;
    }

    public Boolean getMandatoryRU() {
        return mandatoryRU;
    }

    public Boolean getApplicationGeneral() {
        return applicationGeneral;
    }

    public Boolean getApplicationMeasurement() {
        return applicationMeasurement;
    }

    public Boolean getApplicationSafety() {
        return applicationSafety;
    }

    public Boolean getApplicationASUTP() {
        return applicationASUTP;
    }

    public Boolean getApplicationProcess() {
        return applicationProcess;
    }

    public Boolean getApplicationPiping() {
        return applicationPiping;
    }

    public Boolean getApplicationElectrical() {
        return applicationElectrical;
    }

    public Boolean getApplicationConstruction() {
        return applicationConstruction;
    }

    public Boolean getApplicationCableRouting() {
        return applicationCableRouting;
    }

    public Boolean getApplicationPID() {
        return applicationPID;
    }

    public Boolean getApplicationSPDS() {
        return applicationSPDS;
    }

    public Boolean getApplicationDocumentDesign() {
        return applicationDocumentDesign;
    }

    public String getHashTag01() {
        return hashTag01;
    }

    public String getHashTag02() {
        return hashTag02;
    }

    public String getHashTag03() {
        return hashTag03;
    }

    public String getHashTag04() {
        return hashTag04;
    }

    public String getNotes() {
        return notes;
    }

    public long getHashSum() {
        return hashSum;
    }

    public void setDocNum(Integer docNum) {
        this.docNum = docNum;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public void setDocDescription(String docDescription) {
        this.docDescription = docDescription;
    }

    public void setDocFileName(String docFileName) {
        this.docFileName = docFileName;
    }

    public void setDocStream(Byte[] docStream) {
        this.docStream = docStream;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public void setMandatoryUA(Boolean mandatoryUA) {
        this.mandatoryUA = mandatoryUA;
    }

    public void setMandatoryRK(Boolean mandatoryRK) {
        this.mandatoryRK = mandatoryRK;
    }

    public void setMandatoryRU(Boolean mandatoryRU) {
        this.mandatoryRU = mandatoryRU;
    }

    public void setApplicationGeneral(Boolean applicationGeneral) {
        this.applicationGeneral = applicationGeneral;
    }

    public void setApplicationMeasurement(Boolean applicationMeasurement) {
        this.applicationMeasurement = applicationMeasurement;
    }

    public void setApplicationSafety(Boolean applicationSafety) {
        this.applicationSafety = applicationSafety;
    }

    public void setApplicationASUTP(Boolean applicationASUTP) {
        this.applicationASUTP = applicationASUTP;
    }

    public void setApplicationProcess(Boolean applicationProcess) {
        this.applicationProcess = applicationProcess;
    }

    public void setApplicationPiping(Boolean applicationPiping) {
        this.applicationPiping = applicationPiping;
    }

    public void setApplicationElectrical(Boolean applicationElectrical) {
        this.applicationElectrical = applicationElectrical;
    }

    public void setApplicationConstruction(Boolean applicationConstruction) {
        this.applicationConstruction = applicationConstruction;
    }

    public void setApplicationCableRouting(Boolean applicationCableRouting) {
        this.applicationCableRouting = applicationCableRouting;
    }

    public void setApplicationPID(Boolean applicationPID) {
        this.applicationPID = applicationPID;
    }

    public void setApplicationSPDS(Boolean applicationSPDS) {
        this.applicationSPDS = applicationSPDS;
    }

    public void setApplicationDocumentDesign(Boolean applicationDocumentDesign) {
        this.applicationDocumentDesign = applicationDocumentDesign;
    }

    public void setHashTag01(String hashTag01) {
        this.hashTag01 = hashTag01;
    }

    public void setHashTag02(String hashTag02) {
        this.hashTag02 = hashTag02;
    }

    public void setHashTag03(String hashTag03) {
        this.hashTag03 = hashTag03;
    }

    public void setHashTag04(String hashTag04) {
        this.hashTag04 = hashTag04;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void calculateHashSum() {
        for (int i = 0; i < docStream.length; i ++)
            hashSum += docStream[i] + 128;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DocumentContainer that = (DocumentContainer) o;

        return getHashSum() == that.getHashSum();
    }

    @Override
    public int hashCode() {
        return (int) (getHashSum() ^ (getHashSum() >>> 32));
    }

    @Override
    public String toString() {
        return "\n docNum = " + docNum +
                "\n Document Container" +
                "\n =================================================================================================" +
                "\n docName = " + docName +
                "\n docDescription = " + docDescription +
                "\n docType = " + docType +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n mandatoryUA = " + mandatoryUA +
                "\n mandatoryRK = " + mandatoryRK +
                "\n mandatoryRU = " + mandatoryRU +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n applicationGeneral = " + applicationGeneral +
                "\n applicationMeasurement = " + applicationMeasurement +
                "\n applicationSafety = " + applicationSafety +
                "\n applicationASUTP = " + applicationASUTP +
                "\n applicationProcess = " + applicationProcess +
                "\n applicationPiping = " + applicationPiping +
                "\n applicationElectrical = " + applicationElectrical +
                "\n applicationConstruction = " + applicationConstruction +
                "\n applicationCableRouting = " + applicationCableRouting +
                "\n applicationPID = " + applicationPID +
                "\n applicationSPDS = " + applicationSPDS +
                "\n applicationDocumentDesign = " + applicationDocumentDesign +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n hashTag01 = " + hashTag01 +
                "\n hashTag02 = " + hashTag02 +
                "\n hashTag03 = " + hashTag03 +
                "\n hashTag04 = " + hashTag04 +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n notes = " + notes +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n docFileName = " + docFileName +
                "\n dataStreamSize = " + docStream.length +
                "\n hashSum = " + hashSum +
                "\n =================================================================================================";
    }
}
