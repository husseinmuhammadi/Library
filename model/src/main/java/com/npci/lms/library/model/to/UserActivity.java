package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ACTIVITY")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "USER_ACTIVITY_SEQ")
public class UserActivity extends EntityBase {
}
