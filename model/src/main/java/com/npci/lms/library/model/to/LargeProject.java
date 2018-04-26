package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "LARGE_PROJECT")
public class LargeProject extends Project {
    private BigDecimal budget;
}