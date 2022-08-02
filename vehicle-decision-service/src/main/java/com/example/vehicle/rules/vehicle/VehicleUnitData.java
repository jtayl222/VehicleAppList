package com.example.vehicle.rules.vehicle;

import com.example.vehicle.datamodel.Vehicle;
import com.example.vehicle.datamodel.Car;
import com.example.vehicle.datamodel.Truck;
import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

@lombok.Getter
@lombok.Setter
public class VehicleUnitData implements RuleUnitData {

    public DataStore<Vehicle> vehicleInstances = 
        DataSource.createStore();

    public DataStore<Car> carInstances = 
        DataSource.createStore();

    public DataStore<Truck> truckInstances = 
        DataSource.createStore();
}
