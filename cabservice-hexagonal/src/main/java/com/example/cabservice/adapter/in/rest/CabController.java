package com.example.cabservice.adapter.in.rest;

import com.example.cabservice.domain.model.Cab;
import com.example.cabservice.domain.port.in.CabServicePort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cabs")
public class CabController {

    private final CabServicePort cabService;

    public CabController(CabServicePort cabService) {
        this.cabService = cabService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cab addCab(@RequestBody Cab cab) {
        return cabService.addCab(cab);
    }

    @GetMapping
    public List<Cab> getAllCabs() {
        return cabService.getAllCabs();
    }

    @GetMapping("/available")
    public List<Cab> getAvailableCabs() {
        return cabService.getAvailableCabs();
    }
}
