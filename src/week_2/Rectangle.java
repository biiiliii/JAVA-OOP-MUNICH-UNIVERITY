package week_2;

public class Rectangle {
        private Vector2D v1;
        private Vector2D v2;
        public Rectangle(Vector2D v1, Vector2D v2) {
            this.v1 = v1;
            this.v2 = v2;
        }
        public String toString() {
            return "Rectangle has " + v1 + " as the top-left point and " + v2 + " as the bottom-right point.";
        }
        public double calculateArea() {
            double width = v2.getX() - v1.getX();
            double height = v2.getY() - v1.getY();
            return width * height;
        }
        public void shiftBy(Vector2D v) {
            v1.setX(v1.getX() + v.getX());
            v1.setY(v1.getY() + v.getY());
            v2.setX(v2.getX() - v.getX());
            v2.setY(v2.getY() - v.getY());
        }
}
