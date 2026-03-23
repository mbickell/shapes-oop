public class Circle extends Shape {
  private double radius;

  Circle(double radius, String color, boolean transparent) {
    super(color, transparent);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  double area() {
    return Math.PI * (Math.pow(radius, 2));
  }

  @Override
  String draw() {
    return "Drawing Circle";
  }
}
