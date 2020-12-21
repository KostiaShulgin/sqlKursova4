package kursova.sqlKursova1.controllers;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import kursova.sqlKursova1.entities.Location;
import kursova.sqlKursova1.service.LocationService;

@Controller
@AllArgsConstructor
public class LocationController {
    private LocationService locationService;

    @GetMapping("reader")
    public String list(/*Model model*/) {
//        model.addAttribute("result2", locationService.getLocations());
        return "reader";
    }
}
