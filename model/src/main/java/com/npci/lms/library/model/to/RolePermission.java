package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE_PERMISSION")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "ROLE_PERMISSION_SEQ")
public class RolePermission extends EntityBase {
}
