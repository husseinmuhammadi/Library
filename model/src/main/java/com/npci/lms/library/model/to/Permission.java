package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PERMISSION")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "PERMISSION_SEQ")
public class Permission extends EntityBase  {
}
