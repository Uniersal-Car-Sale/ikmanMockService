package com.bolton.ikman.service;

import com.bolton.ikman.dto.VehicleDTO;
import com.bolton.ikman.dto.json.VehicleFilterRequestDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface VehicleService {

    List<VehicleDTO> filterVehicleDetails(VehicleFilterRequestDTO requestDTO);

    Page<VehicleDTO> filterVehicleDetailsWithPagination(VehicleFilterRequestDTO requestDTO);

    List<VehicleDTO> getAllVehicleDetails();
}
