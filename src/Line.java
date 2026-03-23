public class Line extends Shape {
  private double xCoord;
  private double yCoord;
  private double length;

  Line(int xCoord, int yCoord, String color, boolean transparent) {
    super(color, transparent);

    this.xCoord = xCoord;
    this.yCoord = yCoord;

    setLength();
  }

  public double getxCoord() {
    return xCoord;
  }

  public void setxCoord(double xCoord) {
    this.xCoord = xCoord;
    setLength();
  }

  public double getyCoord() {
    return yCoord;
  }

  public void setyCoord(double yCoord) {
    this.yCoord = yCoord;
    setLength();
  }

  public double getLength() {
    return length;
  }

  private void setLength() {
    this.length = Math.abs(xCoord - yCoord);
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
