import java.awt.Point;

public class Line extends Shape implements CanCalculateLength {
  private Point startCoord;
  private Point endCoord;

  Line(Point startCoord, Point endCoord, String color, boolean transparent) {
    super(color, transparent);

    this.startCoord = startCoord;
    this.endCoord = endCoord;
  }

  public Point getstartCoord() {
    return startCoord;
  }

  public void setstartCoord(Point startCoord) {
    this.startCoord = startCoord;
  }

  public Point getendCoord() {
    return endCoord;
  }

  public void setendCoord(Point endCoord) {
    this.endCoord = endCoord;
  }

  @Override
  double area() {
    return -1;
  }

  @Override
  String draw() {
    return "Drawing Line";
  }

  public double calculateLength() {
    Point differences = new Point(startCoord.x - endCoord.x, startCoord.y - endCoord.y);

    return Math.sqrt(Math.pow(differences.x, 2) + Math.pow(differences.y, 2));
  }
}
