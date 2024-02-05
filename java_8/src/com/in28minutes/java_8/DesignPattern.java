package com.in28minutes.java_8;

public class DesignPattern {

	public static void main(String[] args) {
		Animal animal = FactoryDesign.getAnimal("Cat");
		animal.sound();
		System.out.println(animal.sound());

	}

}

interface Animal{
	public String sound();
}

class Dog implements Animal{
	public String sound() {
		return "bauw bauw";
	}
}

class Cat implements Animal{
	public String sound() {
		return "meow meow";
	}
}

class FactoryDesign{
	public static Animal getAnimal(String animal) {
		if(animal.equals("Dog")) {
			return new Dog();
		}else {
			return new Cat();
		}
	}
}