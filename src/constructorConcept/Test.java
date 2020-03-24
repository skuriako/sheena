package constructorConcept;

public class Test {

	public Test() {
		System.out.println("In default Constructor");
	}
	public Test(int a, int b) {
		System.out.println("In Parameterised Constructor");
	}
	
	public void methodtest() {
		System.out.println("insode method");
	}
	
	public static void main(String[] args) {

Test t=new Test();
		Test test=new Test(2,3);
//t.methodtest();


	}
}
