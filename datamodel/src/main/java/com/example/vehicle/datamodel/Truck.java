package com.example.vehicle.datamodel;
@lombok.Getter
@lombok.Setter
public class Truck extends Vehicle { 
    private Integer currentCargoWeight;
    private Integer maxCargoWeight;
}
