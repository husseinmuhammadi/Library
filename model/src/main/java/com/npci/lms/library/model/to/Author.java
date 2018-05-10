package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHOR")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "AUTHOR_SEQ")
public class Author extends EntityBase {
}
