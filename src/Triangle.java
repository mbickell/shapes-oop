public class Triangle extends Shape {
  double base;
  double height;

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

  @Override
  double area() {
    return 1.5 * base * height;
  }

  @Override
  String draw() {
    return "Drawing Triangle";
  }
}
