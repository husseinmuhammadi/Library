package com.npci.lms.library.model.to;

import javax.persistence.*;

import static com.npci.lms.library.model.to.Document.FIND_ALL;

@Entity
@Table(name = "DOCUMENT")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "DOCUMENT_SEQ")
@NamedQueries({
        @NamedQuery(name = FIND_ALL, query = "from Document where deleted = false ")
})
public class Document extends EntityBase {
    //region Constants
    public static final String FIND_ALL = "Document.findAll";
    //endregion Constants

    //region Fields
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] content;
    //endregion Fields

    //region Getter & Setter
    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
    //endregion Getter & Setter
}
