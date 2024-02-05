package com.in28minutes.java_8;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ParkingSystemRunner {

	public static void main(String[] args) {
		ParkingSystem parkingSystem = new ParkingSystem();
		System.out.println(parkingSystem.isCarParked(new Car("M01","medium")));
		parkingSystem.isCarParked(new Car("S02","small"));
		parkingSystem.isCarParked(new Car("L02","large"));
		parkingSystem.isCarParked(new Car("M04","medium"));
		parkingSystem.isCarParked(new Car("L01","large"));
		parkingSystem.isCarParked(new Car("L03","large"));
		parkingSystem.isCarParked(new Car("L04","large"));
		
		System.out.println(parkingSystem.noOfCarsCheckIn());
		System.out.println(parkingSystem.noOfParkingSpacesLeft());
		
		parkingSystem.isCarCheckedOut(new Car("S02","small"));
		System.out.println(parkingSystem.noOfCarsCheckOut());
		System.out.println(parkingSystem.noOfParkingSpacesLeft());
		System.out.println(parkingSystem.allCars());
	}

}

class Car{
	private String vahicalId;
	private String carSize;
	
	public Car(String vahicalId, String carSize) {
		super();
		this.vahicalId = vahicalId;
		this.carSize = carSize;
	}

	
	public String getVahicalId() {
		return vahicalId;
	}
	public void setVahicalId(String vahicalId) {
		this.vahicalId = vahicalId;
	}
	public String getCarSize() {
		return carSize;
	}
	public void setCarSize(String carSize) {
		this.carSize = carSize;
	}
	
	@Override
	public String toString() {
		return "Car [vahicalId=" + vahicalId + ", carSize=" + carSize + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(carSize, vahicalId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(carSize, other.carSize) && Objects.equals(vahicalId, other.vahicalId);
	}
	
	
}


class ParkingSystem{
	private int smallSpace = 50;
	private int mediumSpace = 100;
	private int largeSpace = 30;
	
	private int noOfCarsCheckIn=0;
	private int noOfCarsCheckOut=0;
	
	Set<Car> carSet = new HashSet<>();
	
	public ParkingSystem() {
		
	}
	
	public int noOfCarsCheckIn() {
		
		return noOfCarsCheckIn;
	}
	
	public int noOfCarsCheckOut() {
		
		return noOfCarsCheckOut;
	}
	
	public int noOfParkingSpacesLeft() {
		int count = smallSpace+mediumSpace+largeSpace;
		return count;
	}
	
	public Set<Car> allCars(){
		return carSet;
	}
	
	public boolean isCarParked(Car car) {
		if(!carSet.contains(car) & car.getCarSize().equalsIgnoreCase("small") & smallSpace>0) {
			noOfCarsCheckIn++;
			carSet.add(car);
			smallSpace--;
			return true;
		}else if(!carSet.contains(car) & car.getCarSize().equalsIgnoreCase("medium") & mediumSpace>0) {
			noOfCarsCheckIn++;
			carSet.add(car);
			mediumSpace--;
			return true;
		}else if(!carSet.contains(car) & car.getCarSize().equalsIgnoreCase("large") & largeSpace>0) {
			noOfCarsCheckIn++;
			carSet.add(car);
			largeSpace--;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isCarCheckedOut(Car car) {
		if(carSet.contains(car) & car.getCarSize().equalsIgnoreCase("small")) {
			noOfCarsCheckOut++;
			carSet.remove(car);
			smallSpace++;
			return true;
		}else if(carSet.contains(car) & car.getCarSize().equalsIgnoreCase("medium")) {
			noOfCarsCheckOut++;
			carSet.remove(car);
			mediumSpace++;
			return true;
		}else if(carSet.contains(car) & car.getCarSize().equalsIgnoreCase("large")) {
			noOfCarsCheckOut++;
			carSet.remove(car);
			largeSpace++;
			return true;
		}else {
			return false;
		}
	}
}