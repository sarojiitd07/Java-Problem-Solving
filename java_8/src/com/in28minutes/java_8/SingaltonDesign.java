package com.in28minutes.java_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

class SingalTon implements Serializable{
	private static SingalTon singalTon;
	
	private SingalTon() {
		if(singalTon!=null) {
			throw new RuntimeException("You are trying to break singalton pattern.");
		}
		
	}
//	Lazying object creation
	public static SingalTon getObject() {
		if(singalTon==null) {
			synchronized(SingalTon.class){
				if(singalTon==null) {
				singalTon = new SingalTon();
			}}
		}
		return singalTon;
	}
	
	public Object readResolve() {
		return singalTon;
	}
}
// Eager object creation
class SingalTonEagarLoad{
	private static SingalTonEagarLoad singalTonEagarLoad = new SingalTonEagarLoad();
	
	public static SingalTonEagarLoad getSingalTonEagarLoad() {
		return singalTonEagarLoad;
	}
}

public class SingaltonDesign {

	public static void main(String[] args) throws Exception{
//		SingalTon singalTon1 = SingalTon.getObject();
//		SingalTon singalTon2 = SingalTon.getObject();
//		System.out.println(singalTon1.hashCode() + " " + singalTon2.hashCode());
//		
//		SingalTonEagarLoad singalTonEagarLoad1 = SingalTonEagarLoad.getSingalTonEagarLoad();
//		SingalTonEagarLoad singalTonEagarLoad2 = SingalTonEagarLoad.getSingalTonEagarLoad();
//		
//		System.out.println(singalTonEagarLoad1.hashCode()+ " "+ singalTonEagarLoad2.hashCode());
		
//		Singalton pattern break types:
//		1. Reflection API
//		solution : if object is already created then throw exception inside constructor.
//		SingalTon s1 = SingalTon.getObject();
//		System.out.println(s1.hashCode());
//		
//		Constructor<SingalTon> con = SingalTon.class.getDeclaredConstructor();
//		con.setAccessible(true);;
//		SingalTon s2 = con.newInstance();
//		System.out.println(s2.hashCode());
		
//		2. Deserialization
//		Solution: implements readResolve() and return type as Object
		SingalTon singal1 = SingalTon.getObject();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
		oos.writeObject(singal1);
		System.out.println(singal1.hashCode());

		System.out.println("Deserialization is done");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
		SingalTon singal2 = (SingalTon) ois.readObject();
		System.out.println(singal2.hashCode());
		ois.close();
		
//		3. clonning

	}
}


