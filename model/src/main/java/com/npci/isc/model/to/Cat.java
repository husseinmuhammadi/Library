package com.npci.isc.model.to;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@DiscriminatorValue("C")
public class Cat extends Animal{
}
