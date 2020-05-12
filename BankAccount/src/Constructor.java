
public class Constructor {
	private String Name;
	private double balance;
	public Constructor (String name,double balance)
	{
		this.Name=name;
		if(balance>0.0) {
			this .balance=balance;
		}
		public void deposit (double depositAmount) 
		{
			if(depositAmount>0.0) {
				balance = balance+depositAmount;
			}
		}
		
	}
	public double getBalance() {
		return balance;
	}
	public void setName(String name)// public means other classes using this method will be able to invoke it.
	 {
		 this.Name = name; //local variable are inside a method 
	 }
	 public String getName() //returns string. public means other classes will be able to use this method to get 
	 {
		 return this.Name;
	 }
}
