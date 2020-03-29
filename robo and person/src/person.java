
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
	this.issitting=true;
	System.out.println("true");
	}
void standup() {
	this.issitting=false;
}
}
