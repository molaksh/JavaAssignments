class Four{
    public static void main(String[] args) {
        Rock r = new Rock();
        System.out.println("My name is The "+r.getClass());
        r.themeMusic();
        r.finisher();
        System.out.println("the salary for this week is "+r.salary(2,r.salaryPerHour));
        
        StoneCold s = new StoneCold();
        System.out.println("\nMy name is "+s.getClass());
        s.themeMusic();
        s.finisher();
        System.out.println("the salary for this week is "+r.salary(1, s.salaryPerHour));
        
        
    }
}
public abstract class Wrestler{
    

    public int salary(int hours, int sph){
        int s = hours*sph;
        return s;
    }

    public abstract void themeMusic();
    public abstract void finisher();


}

class Rock extends Wrestler{
    int salaryPerHour = 1000;
    public void themeMusic(){
        System.out.println("if you smeeeeeelllllalalalalalala what the rock is cooking!!!!");
    }
    public void finisher(){
        System.out.println("Rock Bottom");
    }
    
}

class StoneCold extends Wrestler{
    int salaryPerHour =990;
    public void themeMusic(){
        System.out.println("Stone Cold Theme Music");
    }
    public void finisher(){
        System.out.println("Stone Cold Stunner");
    }
}