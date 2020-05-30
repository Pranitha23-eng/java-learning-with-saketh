package com.HFJ7.Inheritancepolymorphism;

public class Mixed2 {
	// TODO Auto-generated method stub

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		A a2 = new C();

		b.m1();
		c.m2();
		a.m3();
	}
}
