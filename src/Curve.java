public class Curve extends Shape implements CanCalculateLength {
  private float radius;
  private int angle;

  Curve(float radius, int angle, String color, boolean transparent) {
    super(color, transparent);

    this.radius = radius;
    this.angle = angle;
  }

  public void setAngle(int angle) {
    this.angle = angle;
  }

  public int getAngle() {
    return angle;
  }

  public void setRadius(float radius) {
    this.radius = radius;
  }

  public float getRadius() {
    return radius;
  }

  @Override
  String draw() {
    return "Drawing Curve";
  }

  public double calculateLength() {
    return 2.0 * Math.PI * radius * (angle / 360.0);
  }
}
