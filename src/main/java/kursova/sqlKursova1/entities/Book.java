package kursova.sqlKursova1.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {
    @Id
    private int bookID;

    //@ManyToOne
    //@JoinColumn(name = "bus_model_id")
    private String UDC;
    private int authorID;
    private int  creationYear;
    private String publisher;
    private int pageAmount;
}
