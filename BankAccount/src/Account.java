
public class Account// class def public means this class can be used in other applications.
{
 private String name;//instance variables initial value will be initiated to null
 //private: only the 2 below methods know that the variable 'name' exists.this is called encapsulating data in a class.
 public void setName(String name)// public means other classes using this method will be able to invoke it.
 {
	 this.name=name; //local variable are inside a method 
 }
 public String getName() //returns string. public means other classes will be able to use this method to get 
 {
	 return this.name;
 }
 

}

//data inside class will always be private and methods inside a class will be public.
