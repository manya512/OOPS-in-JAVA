package exercise4;

class Vehicle{
	String vehicleNumber;
	void displayInfo() {
		System.out.println("Vehicle Number:"+vehicleNumber);
	}
}

class LandVehicle extends Vehicle{
	int numberOfWheels;
}

class Truck extends LandVehicle{
	int cargoCapacity;
	
	int calculateMaximumLoad() {
		return cargoCapacity*100;
	}
}

public class VehicleClass {

	public static void main(String[] args) {
		Truck t=new Truck();
		
		t.vehicleNumber="TN01AB1234";
		t.numberOfWheels=6;
		t.cargoCapacity=50;
		t.displayInfo();
		System.out.println("Number of Wheels: " + t.numberOfWheels);
		System.out.println("Cargo Capacity: " + t.cargoCapacity + " tons");
		System.out.println("Maximum Load: " + t.calculateMaximumLoad() + " kg");
	}

}
