
public class Robo {
	String name;
	String color;
	int weight;
	Robo lookingAt;
	
	Robo(String n,String c,int w){
		this.name= n ;
		this.color=c;
		this.weight=w;
		
		
	}
	
	void introduce() {
		System.out.println("My name is "+this.name);
	}

}
