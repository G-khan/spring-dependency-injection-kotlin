package dev.gokhana.dependencyinjection.controller

import dev.gokhana.dependencyinjection.service.VehicleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VehicleControllerConstructor(private val vehicleService: VehicleService) {

    @GetMapping("/vehicles/constructor")
    fun getVehicle(): String? {
        return vehicleService.getVehicle()
    }

}

@RestController
class VehicleControllerSetter {

    lateinit var vehicleService: VehicleService

    @Autowired
    fun setVehicleControllerSetter(vehicleService: VehicleService) {
        this.vehicleService = vehicleService
    }

    @GetMapping("/vehicles/setter")
    fun getVehicle(): String? {
        return vehicleService.getVehicle()
    }

}

@RestController
class VehicleControllerField {

    @Autowired
    lateinit var vehicleService: VehicleService

    @GetMapping("/vehicles/field")
    fun getVehicle(): String? {
        return vehicleService.getVehicle()
    }

}