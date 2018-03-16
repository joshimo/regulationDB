package regulation.datamodel;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.*;

@Entity
@Table(name = "instrumentation_regulation_main")
public class DocContainer implements Serializable {

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
    @Column(name = "IS_UP_TO_DATE")
    private Boolean isUpToDate = true;

    @Basic
    @Column(name = "UDF01")
    private Boolean udf01 = false;

    @Basic
    @Column(name = "UDF02")
    private Boolean udf02 = false;

    @Basic
    @Column(name = "UDF03")
    private Boolean udf03 = false;

    @Basic
    @Column(name = "UDF04")
    private Boolean udf04 = false;

    @Basic
    @Column(name = "UDF05")
    private Boolean udf05 = false;

    @Basic
    @Column(name = "UDF06")
    private Boolean udf06 = false;

    @Basic
    @Column(name = "UDF07")
    private Boolean udf07 = false;

    @Basic
    @Column(name = "UDF08")
    private Boolean udf08 = false;

    @Basic
    @Column(name = "UDF09")
    private Boolean udf09 = false;

    @Basic
    @Column(name = "UDF10")
    private Boolean udf10 = false;

    @Basic
    @Column(name = "UDF11")
    private Boolean udf11 = false;

    @Basic
    @Column(name = "UDF12")
    private Boolean udf12 = false;

    @Basic
    @Column(name = "UDF13")
    private Boolean udf13 = false;

    @Basic
    @Column(name = "UDF14")
    private Boolean udf14 = false;

    @Basic
    @Column(name = "UDF15")
    private Boolean udf15 = false;

    @Basic
    @Column(name = "UDF16")
    private Boolean udf16 = false;

    @Basic
    @Column(name = "UDF17")
    private Boolean udf17 = false;

    @Basic
    @Column(name = "UDF18")
    private Boolean udf18 = false;

    @Basic
    @Column(name = "UDF19")
    private Boolean udf19 = false;

    @Basic
    @Column(name = "UDF20")
    private Boolean udf20 = false;

    @Basic
    @Column(name = "UDF21")
    private Boolean udf21 = false;

    @Basic
    @Column(name = "UDF22")
    private Boolean udf22 = false;

    @Basic
    @Column(name = "UDF23")
    private Boolean udf23 = false;

    @Basic
    @Column(name = "UDF24")
    private Boolean udf24 = false;

    @Basic
    @Column(name = "UDF25")
    private Boolean udf25 = false;

    @Basic
    @Column(name = "UDF26")
    private Boolean udf26 = false;

    @Basic
    @Column(name = "UDF27")
    private Boolean udf27 = false;

    @Basic
    @Column(name = "UDF28")
    private Boolean udf28 = false;

    @Basic
    @Column(name = "UDF29")
    private Boolean udf29 = false;

    @Basic
    @Column(name = "UDF30")
    private Boolean udf30 = false;

    @Basic
    @Column(name = "UDF31")
    private Boolean udf31 = false;

    @Basic
    @Column(name = "UDF32")
    private Boolean udf32 = false;

    @Basic
    @Column(name = "HASH_TAGS")
    private String hashTags;

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

    public byte[] getPrimitiveDocStream() {
        byte[] b = new byte[docStream.length];
        for (int i = 0; i < docStream.length; i ++)
            b[i] = docStream[i];
        return b;
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

    public Boolean getUpToDate() {
        return isUpToDate;
    }

    public Boolean getUdf01() {
        return udf01;
    }

    public Boolean getUdf02() {
        return udf02;
    }

    public Boolean getUdf03() {
        return udf03;
    }

    public Boolean getUdf04() {
        return udf04;
    }

    public Boolean getUdf05() {
        return udf05;
    }

    public Boolean getUdf06() {
        return udf06;
    }

    public Boolean getUdf07() {
        return udf07;
    }

    public Boolean getUdf08() {
        return udf08;
    }

    public Boolean getUdf09() {
        return udf09;
    }

    public Boolean getUdf10() {
        return udf10;
    }

    public Boolean getUdf11() {
        return udf11;
    }

    public Boolean getUdf12() {
        return udf12;
    }

    public Boolean getUdf13() {
        return udf13;
    }

    public Boolean getUdf14() {
        return udf14;
    }

    public Boolean getUdf15() {
        return udf15;
    }

    public Boolean getUdf16() {
        return udf16;
    }

    public Boolean getUdf17() {
        return udf17;
    }

    public Boolean getUdf18() {
        return udf18;
    }

    public Boolean getUdf19() {
        return udf19;
    }

    public Boolean getUdf20() {
        return udf20;
    }

    public Boolean getUdf21() {
        return udf21;
    }

    public Boolean getUdf22() {
        return udf22;
    }

    public Boolean getUdf23() {
        return udf23;
    }

    public Boolean getUdf24() {
        return udf24;
    }

    public Boolean getUdf25() {
        return udf25;
    }

    public Boolean getUdf26() {
        return udf26;
    }

    public Boolean getUdf27() {
        return udf27;
    }

    public Boolean getUdf28() {
        return udf28;
    }

    public Boolean getUdf29() {
        return udf29;
    }

    public Boolean getUdf30() {
        return udf30;
    }

    public Boolean getUdf31() {
        return udf31;
    }

    public Boolean getUdf32() {
        return udf32;
    }

    public String getHashTags() {
        return hashTags;
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

    public void setUpToDate(Boolean upToDate) {
        isUpToDate = upToDate;
    }

    public void setUdf0l(Boolean udf01) {
        this.udf01 = udf01;
    }

    public void setUdf02(Boolean udf02) {
        this.udf02 = udf02;
    }

    public void setUdf03(Boolean udf03) {
        this.udf03 = udf03;
    }

    public void setUdf04(Boolean udf04) {
        this.udf04 = udf04;
    }

    public void setUdf05(Boolean udf05) {
        this.udf05 = udf05;
    }

    public void setUdf06(Boolean udf06) {
        this.udf06 = udf06;
    }

    public void setUdf07(Boolean udf07) {
        this.udf07 = udf07;
    }

    public void setUdf08(Boolean udf08) {
        this.udf08 = udf08;
    }

    public void setUdf09(Boolean udf09) {
        this.udf09 = udf09;
    }

    public void setUdfl0(Boolean udf10) {
        this.udf10 = udf10;
    }

    public void setUdfl1(Boolean udf11) {
        this.udf11 = udf11;
    }

    public void setUdfl2(Boolean udf12) {
        this.udf12 = udf12;
    }

    public void setUdfl3(Boolean udf13) {
        this.udf13 = udf13;
    }

    public void setUdfl4(Boolean udf14) {
        this.udf14 = udf14;
    }

    public void setUdfl5(Boolean udf15) {
        this.udf15 = udf15;
    }

    public void setUdfl6(Boolean udf16) {
        this.udf16 = udf16;
    }

    public void setUdfl7(Boolean udf17) {
        this.udf17 = udf17;
    }

    public void setUdfl8(Boolean udf18) {
        this.udf18 = udf18;
    }

    public void setUdfl9(Boolean udf19) {
        this.udf19 = udf19;
    }

    public void setUdf20(Boolean udf20) {
        this.udf20 = udf20;
    }

    public void setUdf21(Boolean udf21) {
        this.udf21 = udf21;
    }

    public void setUdf22(Boolean udf22) {
        this.udf22 = udf22;
    }

    public void setUdf23(Boolean udf23) {
        this.udf23 = udf23;
    }

    public void setUdf24(Boolean udf24) {
        this.udf24 = udf24;
    }

    public void setUdf25(Boolean udf25) {
        this.udf25 = udf25;
    }

    public void setUdf26(Boolean udf26) {
        this.udf26 = udf26;
    }

    public void setUdf27(Boolean udf27) {
        this.udf27 = udf27;
    }

    public void setUdf28(Boolean udf28) {
        this.udf28 = udf28;
    }

    public void setUdf29(Boolean udf29) {
        this.udf29 = udf29;
    }

    public void setUdf30(Boolean udf30) {
        this.udf30 = udf30;
    }

    public void setUdf31(Boolean udf31) {
        this.udf31 = udf31;
    }

    public void setUdf32(Boolean udf32) {
        this.udf32 = udf32;
    }

    public void setHashTags(String hashTag01) {
        this.hashTags = hashTag01;
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

        DocContainer that = (DocContainer) o;

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
                "\n isUpToDate = " + isUpToDate +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n udf01 = " + udf01 +
                "\n udf01 = " + udf02 +
                "\n udf01 = " + udf03 +
                "\n udf01 = " + udf04 +
                "\n udf01 = " + udf05 +
                "\n udf01 = " + udf06 +
                "\n udf01 = " + udf07 +
                "\n udf01 = " + udf08 +
                "\n udf01 = " + udf09 +
                "\n udf10 = " + udf10 +
                "\n udf11 = " + udf11 +
                "\n udf12 = " + udf12 +
                "\n udf13 = " + udf13 +
                "\n udf14 = " + udf14 +
                "\n udf15 = " + udf15 +
                "\n udf16 = " + udf16 +
                "\n udf17 = " + udf17 +
                "\n udf18 = " + udf18 +
                "\n udf19 = " + udf19 +
                "\n udf20 = " + udf20 +
                "\n udf21 = " + udf21 +
                "\n udf22 = " + udf22 +
                "\n udf23 = " + udf23 +
                "\n udf24 = " + udf24 +
                "\n udf25 = " + udf25 +
                "\n udf26 = " + udf26 +
                "\n udf27 = " + udf27 +
                "\n udf28 = " + udf28 +
                "\n udf29 = " + udf29 +
                "\n udf30 = " + udf30 +
                "\n udf31 = " + udf31 +
                "\n udf32 = " + udf32 +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n hashTag01 = " + hashTags +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n notes = " + notes +
                "\n -------------------------------------------------------------------------------------------------" +
                "\n docFileName = " + docFileName +
                "\n dataFileSize = " + fileSize +
                "\n #hashSum = " + hashSum +
                "\n =================================================================================================";
    }
}