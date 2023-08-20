package test06;

public class Samp {

	int id;
	public Samp(int x) {this.id = x;}	
	public void st(int x) {this.id = x;}
	public int get() {return this.id;}
	
	
	public static void main(String[] args) {
		Samp ob1 = new Samp(3);
		Samp ob2 = new Samp(4);
		Samp s;
		
		s = ob2;
		ob1 = ob2; // °´Ã¼ÀÇ Ä¡È¯
		System.out.println("ob1.id="+ob1.id);
		System.out.println("ob2.id="+ob2.id);

	}

}
