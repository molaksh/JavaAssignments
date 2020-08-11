final class ImmutableClass {

    private final String att1;
    private final String att2;
    private final DependencyClass dependencyClass;

    @Override
    public String toString() {
      return "ImmutableClass [att1=" + att1 + ", att2=" + att2 + ", dependencyClass=" + dependencyClass + "]";
    }

    public ImmutableClass(String att1, String att2, DependencyClass dependencyClass) {
      this.att1 = att1;
      this.att2 = att2; 
      this.dependencyClass = new DependencyClass(dependencyClass.getdAtt1(), dependencyClass.getdAtt2());
    }

    public DependencyClass getDependency(){
      DependencyClass d1 = new DependencyClass(this.dependencyClass.getdAtt1(),this.dependencyClass.getdAtt2());
      return d1;
    }

    

    
   

}