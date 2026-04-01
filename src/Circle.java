public class Circle extends Shape implements CanCalculateArea {
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

  public double area() {
    return Math.PI * (Math.pow(radius, 2));
  }

  @Override
  public String draw() {
    return "Drawing Circle";
  }
}
