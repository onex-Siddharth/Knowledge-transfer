package com.example.cabservice.adapter.out.persistence;

import com.example.cabservice.domain.model.Cab;
import com.example.cabservice.domain.port.out.CabRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CabRepositoryAdapter implements CabRepositoryPort {

    private final JpaCabRepository jpaCabRepository;

    public CabRepositoryAdapter(JpaCabRepository jpaCabRepository) {
        this.jpaCabRepository = jpaCabRepository;
    }

    @Override
    public Cab save(Cab cab) {
        CabEntity entity = CabEntity.fromDomain(cab);
        entity = jpaCabRepository.save(entity);
        return entity.toDomain();
    }

    @Override
    public List<Cab> findAll() {
        return jpaCabRepository.findAll()
                .stream()
                .map(CabEntity::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public java.util.Optional<Cab> findById(Long id) {
        return jpaCabRepository.findById(id).map(CabEntity::toDomain);
    }
}
