package regulation.entity_controller;

import regulation.datamodel.DocHeader;

import java.util.List;

public interface Filter {
    List<DocHeader> getFilteredDocumentHeaders(DocHeader mask, final List<DocHeader> headers);
}
