package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "USER_SEQ")
public class User extends EntityBase {
}
