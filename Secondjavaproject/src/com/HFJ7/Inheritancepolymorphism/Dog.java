package com.HFJ7.Inheritancepolymorphism;

public class Dog extends Animal{
int i;

	public void eat(int i)
	  {
		  super.eat(3);
		   System.out.println("i love foooddd");
		   System.out.println("value is " +i);
		   }
   public void dance() {
	   System.out.println("i cant dance");
   }
}
