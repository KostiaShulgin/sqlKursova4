package kursova.sqlKursova1.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import kursova.sqlKursova1.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
