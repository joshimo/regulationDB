package regulation.entity_controller;

import regulation.datamodel.DocHeader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DocFilter implements Filter {

    @Override
    public List<DocHeader> getFilteredDocumentHeaders(DocHeader mask, final List<DocHeader> headers) {
        String docName = mask.getDocName();
        String docDescription = mask.getDocDescription();
        String docType = mask.getDocType();
        String hashString = mask.getHashTags();
        List<DocHeader> result = new ArrayList<>(headers);
        if (docName.length() >= 2)
            result = filterByDocName(docName, result);
        if (docDescription.length() >= 3)
            result = filterByDocDescription(docDescription, result);
        if (docType.length() >= 2)
            result = filterByDocType(docType, result);
        result = filterByMandatory(mask, result);
        result = filterByUDFs(mask, result);
        if (hashString.length() >= 3)
            result = filterByHashTags(hashString, result);
        return result;
    }

    private List<DocHeader> filterByDocName(String docName, final List<DocHeader> headers) {
        List<DocHeader> result = new ArrayList<>();
        for (DocHeader header : headers)
            if (header.getDocName().toLowerCase().contains(docName.toLowerCase()))
                result.add(header);
        return result;
    }

    private List<DocHeader> filterByDocDescription(String docDescription, final List<DocHeader> headers) {
        List<DocHeader> result = new ArrayList<>();
        for (DocHeader header : headers)
            if (header.getDocDescription().toLowerCase().contains(docDescription.toLowerCase()))
                result.add(header);
        return result;
    }

    private List<DocHeader> filterByDocType(String docType, final List<DocHeader> headers) {
        List<DocHeader> result = new ArrayList<>();
        for (DocHeader header : headers)
            if (header.getDocType().toLowerCase().contains(docType.toLowerCase()))
                result.add(header);
        return result;
    }

    private List<DocHeader> filterByMandatory(DocHeader mask, final List<DocHeader> headers) {
        List<DocHeader> result = headers;
        Iterator<DocHeader> iterator = result.iterator();
        DocHeader header;
        while (iterator.hasNext()) {
            header = iterator.next();
            if (mask.getMandatoryUA() && !header.getMandatoryUA())
                iterator.remove();
            else if (mask.getMandatoryRU() && !header.getMandatoryRU())
                iterator.remove();
            else if (mask.getMandatoryRK() && !header.getMandatoryRK())
                iterator.remove();
            else if (mask.getMandatoryEU() && !header.getMandatoryEU())
                iterator.remove();
        }
        return result;
    }

    private List<DocHeader> filterByHashTags(String hashString, final List<DocHeader> headers) {
        List<String> hashWords = splitHashTag(hashString);
        List<DocHeader> result = new ArrayList<>();
        for (String word : hashWords) {
            for (DocHeader header : headers)
                if (header.getHashTags().toLowerCase().contains(word) && !result.contains(header))
                    result.add(header);
        }
        return result;
    }

    private List<DocHeader> filterByUDFs(DocHeader mask, final List<DocHeader> headers) {
        List<DocHeader> result = headers;
        Iterator<DocHeader> iterator = result.iterator();
        DocHeader header;
        while (iterator.hasNext()) {
            header = iterator.next();
            if (mask.getUdf01() && !header.getUdf01()) iterator.remove();
            else if (mask.getUdf02() && !header.getUdf02()) iterator.remove();
            else if (mask.getUdf03() && !header.getUdf03()) iterator.remove();
            else if (mask.getUdf04() && !header.getUdf04()) iterator.remove();
            else if (mask.getUdf05() && !header.getUdf05()) iterator.remove();
            else if (mask.getUdf06() && !header.getUdf06()) iterator.remove();
            else if (mask.getUdf07() && !header.getUdf07()) iterator.remove();
            else if (mask.getUdf08() && !header.getUdf08()) iterator.remove();
            else if (mask.getUdf09() && !header.getUdf09()) iterator.remove();
            else if (mask.getUdf10() && !header.getUdf10()) iterator.remove();
            else if (mask.getUdf11() && !header.getUdf11()) iterator.remove();
            else if (mask.getUdf12() && !header.getUdf12()) iterator.remove();
            else if (mask.getUdf13() && !header.getUdf13()) iterator.remove();
            else if (mask.getUdf14() && !header.getUdf14()) iterator.remove();
            else if (mask.getUdf15() && !header.getUdf15()) iterator.remove();
            else if (mask.getUdf16() && !header.getUdf16()) iterator.remove();
            else if (mask.getUdf17() && !header.getUdf17()) iterator.remove();
            else if (mask.getUdf18() && !header.getUdf18()) iterator.remove();
            else if (mask.getUdf19() && !header.getUdf19()) iterator.remove();
            else if (mask.getUdf20() && !header.getUdf20()) iterator.remove();
            else if (mask.getUdf21() && !header.getUdf21()) iterator.remove();
            else if (mask.getUdf22() && !header.getUdf22()) iterator.remove();
            else if (mask.getUdf23() && !header.getUdf23()) iterator.remove();
            else if (mask.getUdf24() && !header.getUdf24()) iterator.remove();
            else if (mask.getUdf25() && !header.getUdf25()) iterator.remove();
            else if (mask.getUdf26() && !header.getUdf26()) iterator.remove();
            else if (mask.getUdf27() && !header.getUdf27()) iterator.remove();
            else if (mask.getUdf28() && !header.getUdf28()) iterator.remove();
            else if (mask.getUdf29() && !header.getUdf29()) iterator.remove();
            else if (mask.getUdf30() && !header.getUdf30()) iterator.remove();
            else if (mask.getUdf31() && !header.getUdf31()) iterator.remove();
            else if (mask.getUdf32() && !header.getUdf32()) iterator.remove();
        }
        return result;
    }

    private String filterHashTags(String hashTags) {
        String filtered = hashTags.toLowerCase();
        filtered = filtered.replace(".", "_");
        filtered = filtered.replace(",", "_");
        filtered = filtered.replace(";", "_");
        filtered = filtered.replace(":", "_");
        filtered = filtered.replace("-", "_");
        filtered = filtered.replace(")", "_");
        filtered = filtered.replace("(", "_");
        filtered = filtered.replace("№", "_");
        filtered = filtered.replace("?", "_");
        filtered = filtered.replace("!", "_");
        filtered = filtered.replace("%", "_");
        filtered = filtered.replace("\n", "_");
        filtered = filtered.replace("\"", "_");
        filtered = filtered.replace("/", "_");
        filtered = filtered.replace("@", "_");
        filtered = filtered.replace("&", "_");
        filtered = filtered.replace("$", "_");
        filtered = filtered.replace("*", "_");
        filtered = filtered.replace("+", "_");
        filtered = filtered.replace("=", "_");
        filtered = filtered.replace(" ", "_");
        return filtered;
    }

    private List<String> splitHashTag(String hashString) {
        List<String> hashTagList = new ArrayList<>();
        String[] hashTags = filterHashTags(hashString).split("#");
        for (String hashTag : hashTags) {
            if (hashTag.length() >= 2) {
                String[] hashWords = hashTag.split("_");
                for (String word : hashWords)
                    if ((word.length() >= 2) && (!hashTagList.contains(word)))
                        hashTagList.add(word);
            }
        }
        return hashTagList;
    }
}