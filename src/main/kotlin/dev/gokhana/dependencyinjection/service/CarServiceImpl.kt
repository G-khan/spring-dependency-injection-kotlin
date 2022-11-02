package dev.gokhana.dependencyinjection.service

import org.springframework.stereotype.Service

@Service
class CarServiceImpl : VehicleService {

    override fun getVehicle(): String {
        return "Vehicle is Car"
    }
}