package model;

import java.util.List;

public interface VehicleRepository<T extends Vehicle> {
	
	List<T> getAll();
	
	T saveVehicle(T vehicle);
}
