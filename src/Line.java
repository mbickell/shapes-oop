public class Line extends Shape {
  double xCoord;
  double yCoord;
  double lenth;

  Line(int xCoord, int yCoord, String color, boolean transparent) {
    super(color, transparent);

    this.xCoord = xCoord;
    this.yCoord = yCoord;

    this.lenth = Math.abs(xCoord - yCoord);
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
