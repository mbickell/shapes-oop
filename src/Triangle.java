public class Triangle extends Shape implements CanCalculateArea {
  private double base;
  private double height;

  Triangle(double base, double height, String color, boolean transparent) {
    super(color, transparent);
    this.base = base;
    this.height = height;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getBase() {
    return base;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public double area() {
    return 0.5 * base * height;
  }

  @Override
  public String draw() {
    return "Drawing Triangle";
  }
}
