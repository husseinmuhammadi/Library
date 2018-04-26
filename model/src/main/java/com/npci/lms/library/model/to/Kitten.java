package com.npci.lms.library.model.to;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("K")
public class Kitten extends AbstractCat {
}
