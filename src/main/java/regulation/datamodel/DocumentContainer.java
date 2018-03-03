package regulation.datamodel;

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
    @Column(name = "MANDATORY_EU")
    private Boolean mandatoryEU = false;

    @Basic
    @Column(name = "APPLICATION_GENERAL")
    private Boolean applicationGeneral = false;

    @Basic
    @Column(name = "APPLICATION_MEASUREMENT")
    private Boolean applicationMeasurement = false;

    @Basic
    @Column(name = "APPLICATION_INSTRUMENTATION")
    private Boolean applicationInstrumentation = false;

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
    @Column(name = "APPLICATION_FOR_INFORMATION")
    private Boolean applicationForInformation = false;

    @Basic
    @Column(name = "APPLICATION_STP")
    private Boolean applicationSTP = false;

    @Basic
    @Column(name = "HASH_TAG01")
    private String hashTag01;

    @Basic
    @Column(name = "HASH_TAG02")
    private String hashTag02;

    @Basic
    @Column(name = "HASH_TAG03")
    private String hashTag03;

    @Basic
    @Column(name = "HASH_TAG04")
    private String hashTag04;

    @Basic
    @Column(name = "HASH_TAG05")
    private String hashTag05;

    @Basic
    @Column(name = "HASH_TAG06")
    private String hashTag06;

    @Basic
    @Size(max = 255)
    @Column(name = "NOTES")
    private String notes;

    @Basic
    @Min(1)
    @Column (name = "HASH_SUM")
    private long hashSum;

    @Basic
    @Min(1)
    @Column (name = "FILE_SIZE")
    private long fileSize;


    /** Getters */

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

    public Boolean getMandatoryEU() {
        return mandatoryEU;
    }

    public Boolean getApplicationGeneral() {
        return applicationGeneral;
    }

    public Boolean getApplicationMeasurement() {
        return applicationMeasurement;
    }

    public Boolean getApplicationInstrumentation() {
        return applicationInstrumentation;
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

    public Boolean getApplicationForInformation() {
        return applicationForInformation;
    }

    public Boolean getApplicationSTP() {
        return applicationSTP;
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

    public String getHashTag05() {
        return hashTag05;
    }

    public String getHashTag06() {
        return hashTag06;
    }

    public String getNotes() {
        return notes;
    }

    public long getHashSum() {
        return hashSum;
    }

    public long getFileSize() {
        return fileSize;
    }


    /** Setters */

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
        this.fileSize = docStream.length;
        this.docStream = docStream;
    }

    public void setDocStream(byte[] docStream) {

        this.fileSize = docStream.length;
        Byte[] bytes = new Byte[docStream.length];

        for (int i = 0; i < bytes.length; i ++)
            bytes[i] = docStream[i];

        this.setDocStream(bytes);
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

    public void setMandatoryEU(Boolean mandatoryEU) {
        this.mandatoryEU = mandatoryEU;
    }

    public void setApplicationGeneral(Boolean applicationGeneral) {
        this.applicationGeneral = applicationGeneral;
    }

    public void setApplicationMeasurement(Boolean applicationMeasurement) {
        this.applicationMeasurement = applicationMeasurement;
    }

    public void setApplicationInstrumentation(Boolean applicationInstrumentation) {
        this.applicationInstrumentation = applicationInstrumentation;
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

    public void setApplicationForInformation(Boolean applicationForInformation) {
        this.applicationForInformation = applicationForInformation;
    }

    public void setApplicationSTP(Boolean applicationSTP) {
        this.applicationSTP = applicationSTP;
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

    public void setHashTag05(String hashTag05) {
        this.hashTag05 = hashTag05;
    }

    public void setHashTag06(String hashTag06) {
        this.hashTag06 = hashTag06;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


    /** HashSum calculator */

    public void calculateHashSum() {
        if (docStream == null)
            return;
        for (int i = 0; i < docStream.length; i ++)
            hashSum += docStream[i] + 128;
    }


    /** equals(), hashCode(), toString() */

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
                "\n mandatoryEU = " + mandatoryEU +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n applicationGeneral = " + applicationGeneral +
                "\n applicationMeasurement = " + applicationMeasurement +
                "\n applicationInstrumentation = " + applicationInstrumentation +
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
                "\n applicationForInformation = " + applicationForInformation +
                "\n applicationSTP = " + applicationSTP +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n hashTag01 = " + hashTag01 +
                "\n hashTag02 = " + hashTag02 +
                "\n hashTag03 = " + hashTag03 +
                "\n hashTag04 = " + hashTag04 +
                "\n hashTag05 = " + hashTag03 +
                "\n hashTag06 = " + hashTag04 +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n notes = " + notes +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n docFileName = " + docFileName +
                "\n dataFileSize = " + fileSize +
                "\n #hashSum = " + hashSum +
                "\n =================================================================================================";
    }
}
