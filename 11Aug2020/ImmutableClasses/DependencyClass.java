public class DependencyClass {
  private String dAtt1;
  private String dAtt2;

  public String getdAtt1() {
    return dAtt1;
  }

  public void setdAtt1(String dAtt1) {
    this.dAtt1 = dAtt1;
  }

  public String getdAtt2() {
    return dAtt2;
  }

  public void setdAtt2(String dAtt2) {
    this.dAtt2 = dAtt2;
  }

  @Override
  public String toString() {
    return "DependencyClass [dAtt1=" + dAtt1 + ", dAtt2=" + dAtt2 + "]";
  }

  public DependencyClass(String dAtt1, String dAtt2) {
    this.dAtt1 = dAtt1;
    this.dAtt2 = dAtt2;
  }


}