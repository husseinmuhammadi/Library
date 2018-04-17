package to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {
    @Id
    private Long id;

    @Column
    private String title;

    @Column
    private String description;
}