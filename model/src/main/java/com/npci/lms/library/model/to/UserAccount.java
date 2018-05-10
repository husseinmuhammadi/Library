package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ACCOUNT")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "USER_ACCOUNT_SEQ")
public class UserAccount extends EntityBase {
}
