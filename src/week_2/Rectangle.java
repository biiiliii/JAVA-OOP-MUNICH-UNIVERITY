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

        public float area() {
            
        }
}
