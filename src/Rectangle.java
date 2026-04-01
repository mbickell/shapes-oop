public class Rectangle extends Shape implements CanCalculateArea {
  private double width;
  private double height;

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

  public double area() {
    return width * height;
  }

  @Override
  public String draw() {
    return "Drawing Rectangle";
  }
}
