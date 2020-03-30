
class Xcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orig=42;
		Xcopy x = new Xcopy();
		int y = x.go(orig);
		System.out.println(orig );
		System.out.println(y);;
		}
	int go(int arg) {
		arg=arg*2;
		return arg;
	}

}
