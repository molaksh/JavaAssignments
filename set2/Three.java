class Vehicle{
    public String vehicle = "Vehicle";
    void getMessage(){
        System.out.println("I am a vehicle");
    }

    void acceleration(){
        System.out.println("can accelerate");
    }
}
class Car extends Vehicle{
    public boolean wheels = true;
}
class Boat extends Vehicle{
    boolean waterEngine = true;
}
class SportsCar extends Car{
    void acceleration(){
        System.out.println("maximum acceleration");
    }
    boolean getWheels(){
        return wheels;
    }
}
class Truck extends Car{
    void acceleration(){
        System.out.println("medium acceleration");
    }
}
class Luxury extends Car{
    void acceleration(){
        System.out.println("smooth acceleration");
    }
}
class SailingBoat extends Boat{}
class MotorBoat extends Boat{}
class CargoShip extends Boat{}
class Driver{
    public static void main(String[] args) {

        Car c = new Car();

        Vehicle c1 = new SportsCar();
        Vehicle c2 = new Truck();
        Vehicle c3 = new Luxury();


        Vehicle b1 = new SailingBoat();
        Vehicle b2 = new MotorBoat();
        Vehicle b3 = new CargoShip();

        c1.getMessage();
        c1.acceleration();
        if(c.wheels){System.out.println("I have wheels");}
        //if(){System.out.println("I have wheels");}
        System.out.println(c1.vehicle);



    }
}

