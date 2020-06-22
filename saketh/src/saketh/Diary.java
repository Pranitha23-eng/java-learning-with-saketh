package saketh;

    public  class Diary {
	private int PageNumber;
	
	public void addPage(int n) {
		this.PageNumber = n;
		System.out.println("added page number" +n);
	}
	public void removePage(int n ) {
		this.PageNumber = n;
		System.out.println("Page Number removed is " + n);
	}
}
