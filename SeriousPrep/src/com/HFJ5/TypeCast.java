package com.HFJ5;

public class TypeCast {

	public static void main(String[] args) {
		int ran1;
//int ran=(int) (Math.random()*90);
		int i = 0;
		while (true) {
			i= i + 1;
		 //System.out.println(i);

			// generate a random number
			ran1 = (int) (Math.random() * 46);

			// check if random number > 45
			if (ran1 == 45) {
				System.out.println(ran1 );
				//System.out.println(i);
				break;
			}
			//System.out.println(i);
			
			// System.out.println(i);
			// if yes, break out of the loop
			// if no, continue running

		}
		System.out.println(i);

	}
}
