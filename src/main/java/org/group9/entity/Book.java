package org.group9.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="books")
public class Book {

    @Id
    private long isbn;

    private String title;
    
    private String author;

    @Column(name = "checked_out")
    private Boolean checkedOut;

}
