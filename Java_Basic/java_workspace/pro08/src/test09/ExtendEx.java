package test09;

public class ExtendEx {

	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();

		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB();
		System.out.println();

		InterfaceB ib = impl;
		//ib.methodA();
		ib.methodB();
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}