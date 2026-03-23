public class Shape {
  String color;
  boolean transparent;

  Shape(String color, boolean transparent) {
    this.color = color;
    this.transparent = transparent;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isTransparent() {
    return transparent;
  }

  public void setTransparent(boolean transparent) {
    this.transparent = transparent;
  }

  double area() {
    return -1;
  }

  String draw() {
    return "Shape is abstract thing, I cannot draw it";
  }
}
