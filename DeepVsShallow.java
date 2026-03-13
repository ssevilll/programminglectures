public class DeepVsShallow {

    class Segment implements Cloneable {

        // why do we implement cloneable interface? because we want to create a copy of
        // the object and we need to override the clone method to create a deep copy

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
        // to copy an object we can use clone method, but it creates a shallow copy by
        // default
        // to create a deep copy we need to override the clone method and create new
        // objects for the fields that are objects


        // why do we clone the points in the segment? because if we don't clone the
        // points, then the cloned segment will reference the same points as the
        // original segment, and any changes to the points in the cloned segment will
        // affect the original segment. By cloning the points, we create new point
        // objects for the cloned segment, so that changes to the points in the cloned
        // segment do not affect the original segment.

        
        // why do we override the clone method in the point class? because if we don't
        // override the clone method in the point class, then when we clone the segment,
        // the points will not be cloned and will reference the same points as the
        // original segment. By overriding the clone method in the point class, we
        // ensure that when we clone the segment, the points are also cloned and do not
        // reference the same points as the original segment.

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