package com.campuscoders.objects;

public class RunnableClass {

	public static void main(String[] args) {
		// class --> blueprint for an object
		// object --> a noun, it's an instantiation of a class
		
		//data type, variable name, assignment operation
		int someNumber = 93;

		Human rubenPage = new Human();
		
		rubenPage.eyeColor = "brown";
		rubenPage.gender = "male";
		rubenPage.height = "5'5\"";
		rubenPage.weight = "160";
		
		System.out.println(rubenPage.getInfo());
		
		Human albertEinstein = new Human();
		albertEinstein.eyeColor = "brown";
		albertEinstein.gender = "male";
		albertEinstein.height = "5'7\"";
		albertEinstein.weight = "198";
		
		System.out.println(albertEinstein.getInfo());		
		
		Human angelinaJolie = new Human();
		
		angelinaJolie.eyeColor = "blue";
		angelinaJolie.gender = "female";
		angelinaJolie.height = "5'7\"";
		angelinaJolie.weight = "119";
			
		System.out.println(angelinaJolie.getInfo());
	}

};

