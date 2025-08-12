package com.example.cabservice.domain.service;

import com.example.cabservice.domain.model.Cab;
import com.example.cabservice.domain.port.in.CabServicePort;
import com.example.cabservice.domain.port.out.CabRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;

public class CabService implements CabServicePort {

    private final CabRepositoryPort cabRepository;

    public CabService(CabRepositoryPort cabRepository) {
        this.cabRepository = cabRepository;
    }

    @Override
    public Cab addCab(Cab cab) {
        return cabRepository.save(cab);
    }

    @Override
    public List<Cab> getAllCabs() {
        return cabRepository.findAll();
    }

    @Override
    public List<Cab> getAvailableCabs() {
        return cabRepository.findAll()
                .stream()
                .filter(Cab::isAvailable)
                .collect(Collectors.toList());
    }
}
