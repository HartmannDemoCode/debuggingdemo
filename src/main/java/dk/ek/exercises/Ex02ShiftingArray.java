package dk.ek.exercises;

/**
 * Exercise to find out why crash at runtime
 * 1. Create a Unit Test for this class
 * 2. Create a test that tests the run method
 * 3. Run the test to see the problem
 * 4. Set breakpoint(s)
 * 5. Use the debugger to solve the problem
 */
public class Ex02ShiftingArray {
    public int[] run() {
        int[] arr = {1, 2, 3, 4, 5};

        // Shift elements left
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i + 1];
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
        return arr;
    }
}

