package com.npci.lms.library.model.to.trade;

import com.npci.lms.library.model.converter.CountryConvter;
import com.npci.lms.library.model.to.EntityBase;
import com.npci.lms.library.model.type.Country;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "PRODUCT_SEQ")
public class Product extends EntityBase {

    //region Fields
    @Column(name = "NAME", length = 400)
    private String name;

    @Column(name = "ENGLISH_NAME", columnDefinition = "VARCHAR(250)")
    private String englishName;

    private String brand;

    @Column(name = "MADE_IN", length = 2)
    @Convert(converter = CountryConvter.class)
    private Country madeIn;
    //endregion Fields


}
