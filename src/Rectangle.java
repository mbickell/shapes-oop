public class Rectangle extends Shape {
  double width;
  double height;

  Rectangle(double width, double height, String color, boolean transparent) {
    super(color, transparent);
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  double area() {
    return width * height;
  }

  @Override
  String draw() {
    return "Drawing Rectangle";
  }
}
