package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "ROLE_SEQ")
public class Role extends EntityBase {
}
