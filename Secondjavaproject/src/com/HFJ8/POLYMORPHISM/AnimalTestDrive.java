package com.HFJ8.POLYMORPHISM;

import com.HFJ7.Inheritancepolymorphism.Cat;

public class AnimalTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAnimalList list = new MyAnimalList();
		Dog a = new Dog();
		System.out.println(a.hashCode());
		Dog b = new Dog();
		a=b;
		if(a.equals(b))
		{
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}
		Cat c = new Cat();
		//xyz blah = new xyz();
		
		System.out.println(a.toString());
		list.add(a);
		//list.add(c);

	}

}
