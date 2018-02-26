package datamodel;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Table(name = "instrumentation_main")
public class DocumentHeader implements Serializable {

    @Id
    @Column(name = "DOCUMENT_NUMBER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer docNum;

    @Basic
    @NotEmpty
    @Size()
    @Column(name = "DOCUMENT_NAME")
    private String docName = "";

    @Basic
    @NotEmpty
    @Size(min = 3, max = 255)
    @Column(name = "DOCUMENT_DESCRIPTION")
    private String docDescription = "";

    @Basic
    @NotEmpty
    @Size(min = 3, max = 255)
    @Column(name = "DOCUMENT_FILE_NAME")
    private String docFileName;

    @Basic
    @NotEmpty
    @Size(min = 2, max = 255)
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
    @Column(name = "UDF01")
    private String udf01;

    @Basic
    @Column(name = "UDF02")
    private String udf02;

    @Basic
    @Column(name = "UDF03")
    private String udf03;

    @Basic
    @Column(name = "UDF04")
    private String udf04;

    @Basic
    @Column(name = "UDF05")
    private String udf05;

    @Basic
    @Column(name = "UDF06")
    private String udf06;

    @Basic
    @Column(name = "UDF07")
    private String udf07;

    @Basic
    @Column(name = "UDF08")
    private String udf08;

    @Basic
    @Column(name = "UDF09")
    private String udf09;

    @Basic
    @Column(name = "UDF10")
    private String udf10;

    @Basic
    @Column(name = "UDF11")
    private String udf11;

    @Basic
    @Column(name = "UDF12")
    private String udf12;

    @Basic
    @Column(name = "NOTES")
    private String notes;



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

    public String getUdf01() {
        return udf01;
    }

    public String getUdf02() {
        return udf02;
    }

    public String getUdf03() {
        return udf03;
    }

    public String getUdf04() {
        return udf04;
    }

    public String getUdf05() {
        return udf05;
    }

    public String getUdf06() {
        return udf06;
    }

    public String getUdf07() {
        return udf07;
    }

    public String getUdf08() {
        return udf08;
    }

    public String getUdf09() {
        return udf09;
    }

    public String getUdf10() {
        return udf10;
    }

    public String getUdf11() {
        return udf11;
    }

    public String getUdf12() {
        return udf12;
    }

    public String getNotes() {
        return notes;
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

    public void setUdf01(String udf01) {
        this.udf01 = udf01;
    }

    public void setUdf02(String udf02) {
        this.udf02 = udf02;
    }

    public void setUdf03(String udf03) {
        this.udf03 = udf03;
    }

    public void setUdf04(String udf04) {
        this.udf04 = udf04;
    }

    public void setUdf05(String udf05) {
        this.udf05 = udf05;
    }

    public void setUdf06(String udf06) {
        this.udf06 = udf06;
    }

    public void setUdf07(String udf07) {
        this.udf07 = udf07;
    }

    public void setUdf08(String udf08) {
        this.udf08 = udf08;
    }

    public void setUdf09(String udf09) {
        this.udf09 = udf09;
    }

    public void setUdf10(String udf10) {
        this.udf10 = udf10;
    }

    public void setUdf11(String udf11) {
        this.udf11 = udf11;
    }

    public void setUdf12(String udf12) {
        this.udf12 = udf12;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DocumentHeader that = (DocumentHeader) o;

        if (!getDocName().equals(that.getDocName())) return false;
        if (!getDocDescription().equals(that.getDocDescription())) return false;
        if (!getDocType().equals(that.getDocType())) return false;
        if (!getMandatoryUA().equals(that.getMandatoryUA())) return false;
        if (!getMandatoryRK().equals(that.getMandatoryRK())) return false;
        return getMandatoryRU().equals(that.getMandatoryRU());
    }

    @Override
    public int hashCode() {
        int result = getDocName().hashCode();
        result = 31 * result + getDocDescription().hashCode();
        result = 31 * result + getDocType().hashCode();
        result = 31 * result + getMandatoryUA().hashCode();
        result = 31 * result + getMandatoryRK().hashCode();
        result = 31 * result + getMandatoryRU().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "\n docNum = " + docNum +
                "\n Document Header" +
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
                "\n notes = " + notes +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n docFileName = " + docFileName +
                "\n =================================================================================================";
    }
}