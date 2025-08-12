package com.example.cabservice.domain.port.out;

import com.example.cabservice.domain.model.Cab;
import java.util.List;
import java.util.Optional;

public interface CabRepositoryPort {
    Cab save(Cab cab);
    List<Cab> findAll();
    Optional<Cab> findById(Long id);
}
