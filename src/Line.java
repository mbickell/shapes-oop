public class Line extends Shape {
  private double xCoord;
  private double yCoord;
  private double lenth;

  Line(int xCoord, int yCoord, String color, boolean transparent) {
    super(color, transparent);

    this.xCoord = xCoord;
    this.yCoord = yCoord;

    this.lenth = Math.abs(xCoord - yCoord);
  }

  public double getxCoord() {
    return xCoord;
  }

  public void setxCoord(double xCoord) {
    this.xCoord = xCoord;
  }

  public double getyCoord() {
    return yCoord;
  }

  public void setyCoord(double yCoord) {
    this.yCoord = yCoord;
  }

  public double getLenth() {
    return lenth;
  }

  @Override
  double area() {
    return -1;
  }

  @Override
  String draw() {
    return "Drawing Line";
  }
}
