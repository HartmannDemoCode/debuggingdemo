package dk.ek.exercises;

/**
 * 1. Create a Unit Test and test the check method
 * 2. Run the test expecting true
 * 3. Run the debugger and find the problem
 */
public class Ex03PasswordCheck {
        public boolean check() {
            String password = "secret123";
            String input = new String("secret123");

            if (password == input) {
                return true;
            } else {
                return false;
            }
        }
    }