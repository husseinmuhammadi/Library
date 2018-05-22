package com.npci.lms.library.model.to.trade;

import com.npci.lms.library.model.to.EntityBase;

import javax.persistence.*;
import java.awt.*;

@Entity
@Table(name = "PRODUCT_SPECIFICATION", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"PRODUCT_ID"})
})
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "PRODUCT_SPECIFICATION_SEQ")
public class ProductSpecification extends EntityBase {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;

    @Transient
    private Color color;


}
