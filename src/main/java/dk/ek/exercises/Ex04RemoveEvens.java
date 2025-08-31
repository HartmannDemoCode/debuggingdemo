package dk.ek.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * 1. Create a Unit Test and test the run method
 * 2. Run the test expecting nums to be {1,3,5}
 * 3. Run the debugger and find the problem
 */
public class Ex04RemoveEvens {
        public List<Integer> run() {
            List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

            for (Integer n : nums) {
                if (n % 2 == 0) {
                    nums.remove(n);
                }
            }
            return nums;
        }
    }

