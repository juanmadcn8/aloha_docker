package com.example.aloha.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aloha.models.AccommodationUnitService;
import com.example.aloha.services.AccommodationUnitServiceService;

@RestController
@RequestMapping("/api/accommodation-unit-service")
public class AccommodationUnitServiceController {

    @Autowired
    private AccommodationUnitServiceService accommodationUnitServiceService;

    @GetMapping()
    public List<AccommodationUnitService> getAccommodationUnitServices() {
        return accommodationUnitServiceService.getAccommodationUnitServices();
    }

    @GetMapping("/{id}")
    public Optional<AccommodationUnitService> getAccommodationUnitServiceById(@PathVariable Long id) {
        return accommodationUnitServiceService.getAccommodationUnitServiceById(id);
    }

    @GetMapping("/accommodation-unit/{id}")
    public List<AccommodationUnitService> getAccommodationUnitServicesByAccommodationUnitId(@PathVariable Long id) {
        return accommodationUnitServiceService.getAccommodationUnitServicesByAccommodationUnitId(id);
    }

    @GetMapping("/nameService/{nameService}")
    public List<AccommodationUnitService> getAccommodationUnitServicesByNameService(@PathVariable String nameService) {
        return accommodationUnitServiceService.getAccommodationUnitServicesByNameService(nameService);
    }

    @PostMapping("/create")
    public void createAccommodationUnitService(@RequestBody AccommodationUnitService accommodationUnitService) {
        accommodationUnitServiceService.createAccommodationUnitService(accommodationUnitService);
    }

    @PutMapping("/update")
    public void updateAccommodationUnitService(@RequestBody AccommodationUnitService accommodationUnitService) {
        accommodationUnitServiceService.updateAccommodationUnitService(accommodationUnitService);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAccommodationUnitServiceById(@PathVariable Long id) {
        accommodationUnitServiceService.deleteAccommodationUnitServiceById(id);
    }

}
