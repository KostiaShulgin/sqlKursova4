package kursova.sqlKursova1.service;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import kursova.sqlKursova1.entities.Location;
import kursova.sqlKursova1.repositories.LocationRepository;

@Service
@AllArgsConstructor
public class LocationService {
    private LocationRepository locationRepository;

    public List<Location> getLocations() {
        return locationRepository.findAll();
    }
}
