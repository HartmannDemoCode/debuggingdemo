package dk.ek.exercises;

import java.awt.*;

/**
 * 1. Create a Unit Test and test the run method
 * 2. Run the test expecting equal
 * 3. Run the debugger and find the problem
 */
public class Ex05ExpectEqual {

    public boolean run() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 3);

        if (p1.equals(p2)) {
            return true;
        } else {
            return false;
        }
    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
