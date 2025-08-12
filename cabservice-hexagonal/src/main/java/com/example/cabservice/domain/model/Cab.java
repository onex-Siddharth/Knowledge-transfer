package com.example.cabservice.domain.model;

public class Cab {
    private Long id;
    private String driverName;
    private String carModel;
    private boolean available;

    public Cab() {}

    public Cab(Long id, String driverName, String carModel, boolean available) {
        this.id = id;
        this.driverName = driverName;
        this.carModel = carModel;
        this.available = available;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }

    public String getCarModel() { return carModel; }
    public void setCarModel(String carModel) { this.carModel = carModel; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}
