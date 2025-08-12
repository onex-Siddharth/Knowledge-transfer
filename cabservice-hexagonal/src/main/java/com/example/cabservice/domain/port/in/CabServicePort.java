package com.example.cabservice.domain.port.in;

import com.example.cabservice.domain.model.Cab;
import java.util.List;

public interface CabServicePort {
    Cab addCab(Cab cab);
    List<Cab> getAllCabs();
    List<Cab> getAvailableCabs();
}
