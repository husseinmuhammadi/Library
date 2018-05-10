package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PUBLISHER")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "PUBLISHER_SEQ")
public class Publisher extends EntityBase {
}
