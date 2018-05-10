package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ROLE")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "USER_ROLE_SEQ")
public class UserRole extends EntityBase {
}
