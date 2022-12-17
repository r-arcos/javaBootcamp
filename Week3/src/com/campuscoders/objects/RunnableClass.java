package com.campuscoders.objects;

public class RunnableClass {

	public static void main(String[] args) {
		// class --> blueprint for an object
		// object --> a noun, it's an instantiation of a class
		
		//data type, variable name, assignment operation
		//int someNumber = 93;

		Human rubenPage = new Human();
		rubenPage.setProperties("male","5'5\"", "160", "brown");
		
		System.out.println(rubenPage.getInfo());
		
		Human albertEinstein = new Human();
		albertEinstein.setProperties("male", "5'7\"", "198", "brown");
		
		System.out.println(albertEinstein.getInfo());		
		
		Human angelinaJolie = new Human();
		angelinaJolie.setProperties("female", "5'7\"", "119", "blue");
			
		System.out.println(angelinaJolie.getInfo());
	}

};







