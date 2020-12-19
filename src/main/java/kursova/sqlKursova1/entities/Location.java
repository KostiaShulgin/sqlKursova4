package kursova.sqlKursova1.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Location {
    @Id
    private int locationID;

    //@ManyToOne
    //@JoinColumn(name = "bus_model_id")
    private int floor;
    private int section;
    private int shelf;
}
