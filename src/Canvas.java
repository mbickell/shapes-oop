import java.util.ArrayList;

public class Canvas {
  private ArrayList<Drawable> shapes;

  Canvas() {
    shapes = new ArrayList<Drawable>();
  }

  public ArrayList<Drawable> getShapes() {
    return shapes;
  }

  void addShape(Drawable shape) {
    shapes.add(shape);
  }

  void removeShape(Drawable shape) {
    shapes.remove(shape);
  }

  void drawAll() {
    shapes.forEach(shape -> {
      System.out.println(shape.draw());
    });
  }

  double totalArea() {
    double total = 0;

    for (Drawable shape : shapes) {
      if (shape instanceof CanCalculateArea areaShape) {
        total += areaShape.area();
      }
    }

    return total;
  }
}
