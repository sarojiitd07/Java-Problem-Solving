package com.in28minutes.java_8.p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CabBookingDesign {
	
	public static List<Cab> cabsInFareRange(int min,int max, List<Cab> cabs) {
		List<Cab> list = new ArrayList<>();
		for(int i=0;i<cabs.size();i++) {
			if(cabs.get(i).getFare()>=min && cabs.get(i).getFare()<=max) {
				list.add(cabs.get(i));
			}
		}
		return list.stream().sorted(Comparator.comparing(Cab::getFare)).collect(Collectors.toList());
	}
	
	public static Cab chooseCab(int min,int max, List<Cab> cabs) {
		List<Cab> list = cabsInFareRange(min,max,cabs);
		List<Cab> collect = list.stream().filter(e->e.isBooked()==false)
				.sorted(Comparator.comparing(Cab::getFare)).collect(Collectors.toList());
		if(collect.size()==0) {
			throw new RuntimeException("No Cabs are available in this price range");
		}else {
			collect.get(0).setBooked(true);
			System.out.println("Cab is booked");
			System.out.print("Details: ");
			return collect.get(0);
		}
	}	
	
	public static List<Cab> availableCabs(List<Cab> cabs){
		return cabs;
	}

	public static void main(String[] args) {
		List<Cab> set = new ArrayList<>();
		set.add(new Cab(001,false,60));
		set.add(new Cab(002,false,50));
		set.add(new Cab(003,false,150));
		set.add(new Cab(004,false,30));
		set.add(new Cab(005,false,88));
		set.add(new Cab(006,false,54));
		
		System.out.println(CabBookingDesign.availableCabs(set));
		System.out.println("Cabs in range ("+0 +","+ 60+") " +CabBookingDesign.cabsInFareRange(0,60,set));
		System.out.println(CabBookingDesign.chooseCab(0,60,set));
		

	}

}

class Cab{
	private int cabNo;
	private boolean isBooked;
	private int fare;
	
	public Cab(int cabNo, boolean isBooked, int fare) {
		this.cabNo =cabNo;
		this.isBooked = isBooked;
		this.fare =fare;
	}

	
	public int getFare() {
		return fare;
	}


	public void setFare(int fare) {
		this.fare = fare;
	}


	public int getCabNo() {
		return cabNo;
	}

	public void setCabNo(int cabNo) {
		this.cabNo = cabNo;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	@Override
	public String toString() {
		return "Cab [cabNo = " + cabNo + ", isBooked = " + isBooked + ", fare = " + fare + "]";
	}
	
	
}