package pruebas;

public class Sub extends Base{
	public void methodA() {
		System.out.println("Sub - methodA");
	}
	public void methodB() {
		System.out.println("sub - methodB");
	}
	
	public static void main(String[] args) {
		Base b = new Sub();
		b.methodA();
		if (b instanceof Sub hijoB) {
			hijoB.methodB();
		}
		((Sub)b).methodB();
	}
}
