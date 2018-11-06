package designpatterns.creational;

public class BuilderDesignPattern {
	public static void main(String[] args) {
		//Phone p = new Phone("sfsd", 3, "wehw", 8f, 23);
		Phone p = new PhoneBuilder().setOs("fhwfiewi").setRam(8).setProcessor("23424dswf").getPhone();
		System.out.println(p);
	}

}

class Phone {
	private String os;
	private int ram;
	private String processor;
	private double screensize;
	private int battery;

	public Phone(String os, int ram, String processor, double screensize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screensize = screensize;
		this.battery = battery;

	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screensize=" + screensize + ", battery=" + battery + "]";
	}

}

class PhoneBuilder {
	private String os;
	private int ram;
	private String processor;
	private double screensize;
	private int battery;

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}

	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	public Phone getPhone() {
		return new Phone(os, ram, processor, screensize, battery);
	}
}