package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		PrototypeDesign prototye = new PrototypeDesign();
		prototye.setIpAddress("123.45.67.890");
		prototye.loadVeryImpotanatData();

		
		PrototypeDesign clone1 = (PrototypeDesign) prototye.clone();
		clone1.getDomains().remove(0);
		PrototypeDesign clone2 = (PrototypeDesign) prototye.clone();
		
		System.out.println(prototye);
//		prototye.getDomains().remove(0);
		System.out.println(clone1);
		System.out.println(clone2);
		System.out.println(prototye);
	}

}

class PrototypeDesign implements Cloneable{
	private String ipAddress;
	private String complexData;
	private List<String> domains = new ArrayList<>();
	
	public PrototypeDesign() {
	}
	
	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = new ArrayList<>(domains);
	}
	
	public String getComplexData() {
		return complexData;
	}
	
	public void loadVeryImpotanatData() throws InterruptedException {
		this.complexData = "Very very impotant data";
		domains.add("www.google.com");
		domains.add("www.yahoo.com");
		domains.add("www.youtube.com");
		domains.add("www.gmail.com");
		Thread.sleep(5000);
	}

	public void setComplexData(String complexData) {
		
		
		this.complexData = complexData;
		
	}

	
	public String getIpAddress() {
		return ipAddress;
	}
	
	public void setIpAddress(String ipAddress) {
		this.ipAddress=ipAddress;
	}
	
	@Override
	public String toString() {
		return ipAddress + " " + complexData + " "+domains;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		PrototypeDesign prototypeDesign= new PrototypeDesign();
		prototypeDesign.setIpAddress(this.getIpAddress());
		prototypeDesign.setDomains(this.getDomains());
		prototypeDesign.setComplexData(this.getComplexData());
		return prototypeDesign;
	}
	
}