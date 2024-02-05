package com.in28minutes.java_8;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
	
	private final String id;
	private final String name;
	private final List<String> celphoneNos; 
	
	ImmutableClass(String id, String name, List<String> celphoneNos) {
		this.id=id;
		this.name=name;
//		List<String> arrList = new ArrayList<>();
//		for(int i=0;i<celphoneNos.size();i++) {
//			arrList.add(celphoneNos.get(i));
//		}
		this.celphoneNos = new ArrayList<>(celphoneNos);
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	

	public List<String> getCelphoneNos() {
		
		return new ArrayList<>(celphoneNos);
	}

	public static void main(String[] args) {
		
		ImmutableClass im = new ImmutableClass("10", "Saroj", List.of("9582685116","8072873892"));
		System.out.println(im.getId()+" "+im.getName() + " " + im.getCelphoneNos());
		System.out.println(im.hashCode());

	}

}
