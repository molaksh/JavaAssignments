package designpatterns.creational;

public class FactoryDesignPattern {
	public static void main(String[] args) {
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS os = osf.getInstance("open");
		os.show();
	}
	
}

class OperatingSystemFactory {

	public OS getInstance(String str) {
		if(str.equals("closed")) {
			return new IOS();
		}else if(str.equals("open")) {
			return new Android();
		}else {
			return new Windows();
			}
	}
	
}

interface OS{
	public void show();
}

class IOS implements OS{

	@Override
	public void show() {
		System.out.println("IOS");
		
	}
	
}
class Android implements OS{

	@Override
	public void show() {
		System.out.println("Android");
		
	}
	
}
class Windows implements OS{

	@Override
	public void show() {
		System.out.println("Windows");
		
	}
	
}
