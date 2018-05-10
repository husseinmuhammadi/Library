package com.npci.lms.library.model.to;

import javax.persistence.*;

@Entity
@Table(name = "DOCUMENT")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "DOCUMENT_SEQ")
@NamedQueries({
        @NamedQuery(name = "dd", query = "from Document where deleted = false ")
})
public class Document extends EntityBase {
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] content;
}
