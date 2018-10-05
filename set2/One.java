package set2;

class Driver1{
    public static void main(String[] args) {
        Car1 c = new Car1();
        Truck1 t = new Truck1();

        c.start();
        c.setSpeed();
        c.turn();
        c.openTrunk();
        c.closeTrunk();
        c.stop();

        t.start();
        t.setSpeed();
        t.turn();
        t.increaseSpeed();
        t.decreaseSpeed();
        t.openTailgate();
        t.closeTailgate();
        t.stop();
    }
}
class Vehicle1{
    
    int speed;

    public void start(){
        System.out.println("starting");
    }
    public void stop(){
        System.out.println("stopping");
    }
    public void turn(){
        System.out.println("turning");
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(){
        System.out.println("setspeed method from vehicle class");
        speed = 55;
        System.out.println("setting speed to "+getSpeed());
    }
    public void increaseSpeed(){
        System.out.println("increasing speed by 5 mph");
        speed+=5;
        System.out.println("current speed is " + getSpeed());
    }
    public void decreaseSpeed(){
        System.out.println("decreasing speed by 5 mph");
        speed-=5;
        System.out.println("current speed is " + getSpeed());
    }

}

class Truck1 extends Vehicle1{
    public void openTailgate(){
        System.out.println("opening Tailgate");
    }
    public void closeTailgate(){
        System.out.println("closing Tailgate");
    }

}
class Car1 extends Vehicle1{
    final int topSpeed = 75;
    public void setSpeed(){
        while(speed<topSpeed){
            increaseSpeed();
        }
        while(speed>5){
            decreaseSpeed();
        }
    }
    public void openTrunk(){
        System.out.println("Opening Trunk");
    }
    public void closeTrunk(){
        System.out.println("Closing Trunk");
    }
}