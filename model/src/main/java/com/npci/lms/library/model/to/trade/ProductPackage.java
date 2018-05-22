package com.npci.lms.library.model.to.trade;

import com.npci.lms.library.model.converter.ProductPackageTypeConverter;
import com.npci.lms.library.model.to.EntityBase;
import com.npci.lms.library.model.type.ProductPackageType;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_PACKAGE")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "Product_Package_SEQ")
public class ProductPackage extends EntityBase {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;

    @Column
    private Integer count;

    @Column(name = "PIECE", nullable = false)
    private Integer piece;

    @Column(name = "PACKAGE_TYPE")
    @Convert(converter = ProductPackageTypeConverter.class)
    private ProductPackageType packageType;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_PACKAGE_ID", nullable = false)
    ProductPackage covering;
}
