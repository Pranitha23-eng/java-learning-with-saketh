
public class RPRUNNER {

	public static void main(String[] args) {
		Robo r1 = new Robo("tom","red",30);
		Robo r2 = new Robo("jerry","blue",40);
		r1.introduce();
		r2.introduce();
		
		person p1 = new person("alice","aggresive",false);
		person p2 = new person("becky","talkative",true);
		
		p1.sitdown();
		p1.roboowner= r2;
		p1.roboowner.introduce();
		p1.sing();
		
		}
	}
