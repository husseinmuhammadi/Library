package com.npci.lms.library.model.to;

import javax.persistence.*;

import java.io.IOException;

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
    /**
     * Gets the content type of this document.
     *
     * @return The content type of this document.
     */
    @Column(name = "CONTENT_TYPE", nullable = false)
    private String contentType;

    /**
     * Gets the name of this document
     *
     * @return The name of this document as a <tt>String</tt>
     */
    @Column(name = "NAME", nullable = false)
    private String name;

    /**
     * Gets the file name specified by the client
     *
     * @return the submitted file name
     *
     * @since Servlet 3.1
     */
    @Column(name = "SUBMITTED_FILE_NAME", nullable = false)
    private String submittedFileName;

    /**
     * Returns the size of this fille.
     *
     * @return a <code>long</code> specifying the size of this part, in bytes.
     */
    @Column(name = "LENGTH", nullable = false)
    private Long length;

    /**
     * Gets the content of this part as an <tt>InputStream</tt>
     *
     * @return The content of this part as an <tt>InputStream</tt>
     * @throws IOException If an error occurs in retrieving the contet
     * as an <tt>InputStream</tt>
     */
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] content;

    @Lob
    @Column(name = "HEADERS", columnDefinition = "CLOB") // CONSTRAINT CHK_JSON (HEADERS IS JSON(STRICT))")
    private String headers;
    //endregion Fields

    //region Getter & Setter

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubmittedFileName() {
        return submittedFileName;
    }

    public void setSubmittedFileName(String submittedFileName) {
        this.submittedFileName = submittedFileName;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    //endregion Getter & Setter
}
