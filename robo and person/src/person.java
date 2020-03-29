
public class person {
String name;
String Personality;
Boolean issitting;
Robo roboowner;

person(String n,String P,Boolean i)
{
	this.name=n;
	this.Personality=P;
	this.issitting=i;
	}
void sitdown() { 
	if(this.issitting== true) {;
	System.out.println("hmm");
	}
}
	

void standup() {
	this.issitting=false;
}
void sing() {
	System.out.println(this.name  + " is singing haaaaa");
}
}
