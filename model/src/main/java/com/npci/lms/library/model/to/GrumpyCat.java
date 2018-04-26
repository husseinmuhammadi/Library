package com.npci.lms.library.model.to;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("G")
public class GrumpyCat extends AbstractCat {
}
