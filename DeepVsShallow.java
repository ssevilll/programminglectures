public class DeepVsShallow {

    class Segment implements Cloneable {

        private Point p1;
        private Point p2;

        public Segment(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        public Point getP1() {
            return p1;
        }

        public Point getP2() {
            return p2;
        }

        @Override
        public Segment clone() {
            try {
                Segment cloned = (Segment) super.clone();

                // deep copy of points
                cloned.p1 = p1.clone();
                cloned.p2 = p2.clone();

                // deep copy vs shallow copy
                // deep copy creates a new object and copies all fields
                // shallow copy creates a new object but copies references to the same objects

                return cloned;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

    class Point implements Cloneable {

        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public Point clone() {
            try {
                return (Point) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}