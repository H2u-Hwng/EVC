import java.util.*;

public class SortPoints {

    public static void main(String[] args) {
        // Create 100 random points
        Point[] points = new Point[100];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
            points[i].x = Math.random() * 100;
            points[i].y = Math.random() * 100;
        }
        
        // Sort by x-coordinates
        Arrays.sort(points);
        System.out.println("Points sorted on x-coordinates");
        for (Point p : points) {
            System.out.println(p.toString());
        }
        
        System.out.println(); // New line
        
        // Sort by y-coordinates
        Arrays.sort(points, new CompareY());
        System.out.println("Points sorted on y-coordinates");
        for (Point p : points) {
            System.out.println(p.toString());
        }
    }

    static class Point implements Comparable<Point> {
        double x;
        double y;
        
        public double getX() {
            return x;
        }		
        
    	public double getY() {
    	    return y;
    	}
      
        @Override
        public int compareTo(Point p) {
    	    if (x != p.x) {
                return (x > p.x) ? 1 : -1;
    	    } else {
    	        return (y > p.y) ? 1 : (y == p.y) ? 0 : -1;
    	    }
        }
    
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
    
    static class CompareY implements Comparator<Point> {
        @Override
        public int compare(Point p1, Point p2) {
            if (p1.y != p2.y) {
                return (p1.y > p2.y) ? 1 : -1;
    	    } else {
    	        return (p1.x > p2.x) ? 1 : (p1.x == p2.x) ? 0 : -1;
    	    }
        }
    }
}
