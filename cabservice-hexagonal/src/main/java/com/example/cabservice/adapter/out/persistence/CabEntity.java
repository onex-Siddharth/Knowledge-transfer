package com.example.cabservice.adapter.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "cabs")

public class CabEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String driverName;
    private String carModel;
    private boolean available;

    public CabEntity() {}

    public CabEntity(Long id, String driverName, String carModel, boolean available) {
        this.id = id;
        this.driverName = driverName;
        this.carModel = carModel;
        this.available = available;
    }

    public static CabEntity fromDomain(com.example.cabservice.domain.model.Cab cab) {
        return new CabEntity(cab.getId(), cab.getDriverName(), cab.getCarModel(), cab.isAvailable());
    }

    public com.example.cabservice.domain.model.Cab toDomain() {
        return new com.example.cabservice.domain.model.Cab(id, driverName, carModel, available);
    }

    // Getters and setters omitted for brevity but should be added
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }
    public String getCarModel() { return carModel; }
    public void setCarModel(String carModel) { this.carModel = carModel; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}
