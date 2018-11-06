package designpatterns.creational;

public class Singleton {
	public static void main(String[] args) {
		Abc obj1 = Abc.getInstance();
		//System.out.println(obj1);
		
	}

}

class Abc{
	static Abc obj = new Abc();
	
	private Abc() {
		
	}
	
	public static Abc getInstance() {
		System.out.println("getting instance");
		return obj;
	}
	
	
}