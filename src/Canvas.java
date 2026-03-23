import java.util.ArrayList;

public class Canvas {
  ArrayList<Shape> shapes;

  Canvas() {
    shapes = new ArrayList<Shape>();
  }

  public ArrayList<Shape> getShapes() {
    return shapes;
  }

  void addShape(Shape shape) {
    shapes.add(shape);
  }

  void removeShape(Shape shape) {
    shapes.remove(shape);
  }

  void drawAll() {
    shapes.forEach(shape -> {
      System.out.println(shape.draw());
    });
  }

  double totalArea() {
    double total = 0;

    for (Shape shape : shapes) {
      if (shape.getClass().getSimpleName() != "Shape") {
        total += shape.area();
      }
    }

    return total;
  }
}
