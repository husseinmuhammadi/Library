package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK_HISTORY")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "BOOK_HISTORY_SEQ")
public class BookHistory extends EntityBase {
}
