package model;

import java.util.ArrayList;
import java.util.List;

public abstract class VehicleRepositoryImpl<T extends Vehicle> implements VehicleRepository<T> {
	private final List<T> vehicles = new ArrayList<T>();

	@Override
	public List<T> getAll() {
		return vehicles;
	}

	@Override
	public T saveVehicle(T vehicle) {
		vehicles.add(vehicle);
		return vehicle;
	}

}
