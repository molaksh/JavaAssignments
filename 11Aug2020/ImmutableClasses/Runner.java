public class Runner {
  public static void main(String[] args) {

    DependencyClass d1 = new DependencyClass("dAtt1", "dAtt2");

    ImmutableClass m1 = new ImmutableClass("att1", "att2", d1);

    System.out.println("Immutable class before dependency change = \n"+m1);

    d1.setdAtt1("changed");
    d1.setdAtt2("changed");

    System.out.println("Immutable class after dependency change = \n"+ m1);
    System.out.println("Dependency from immutable class = \n"+ m1.getDependency());
    System.out.println("Dependency Class object used to create immutable Object = \n"+d1);

  }
}