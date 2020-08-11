class Animal implements Comparable<Animal>{
    private String kind;
    private int speed;
    private String Environment;

    public String getKind() {
      return kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }

    public int getSpeed() {
      return speed;
    }

    public void setSpeed(int speed) {
      this.speed = speed;
    }

    public String getEnvironment() {
      return Environment;
    }

    public void setEnvironment(String environment) {
      Environment = environment;
    }

    @Override
    public String toString() {
      return "Animal [Environment=" + Environment + ", kind=" + kind + ", speed=" + speed + "]";
    }

    public Animal(String kind, int speed, String environment) {
      this.kind = kind;
      this.speed = speed;
      Environment = environment;
    }

   @Override
   public int compareTo(Animal animal) {
     
       //return animal.getKind().compareTo(this.getKind());
       return this.getKind().compareTo(animal.getKind());
     
    
   }

   
}