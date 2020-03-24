package interfaceConcept;

public class Develop implements Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Develop d= new Develop();
d.checkBalance();

//another concept :runtime polymorphism
Banking dr= new Develop();
dr.checkBalance();
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}
public void test() {
	
}
}
