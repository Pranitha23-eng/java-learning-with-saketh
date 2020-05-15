package com.HFJ3.Primitiveandreferencevariables;

public class DogTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1= new Dog();
		d1.name = "bingo";
		d1.bark();
		//d1.name = "bingo";
		Dog[] myDogs = new Dog[3];
		myDogs[0]=new Dog();
		myDogs[1]=new Dog();
		myDogs[2]=d1;
		myDogs[0].name="bret";
		myDogs[1].name="lovely";
		System.out.printf("last dog name is ");
		System.out.println(myDogs[2].name);
		int x=0;
		while(x<myDogs.length) {
			myDogs[x].bark();
			x=x+1;
		}
	}
}
