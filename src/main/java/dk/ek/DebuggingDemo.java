package dk.ek;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

public class DebuggingDemo {
    public static void main(String[] args) {
        demoCollection();
//        String name = null;
//
//        Integer namelength = Integer.parseInt(name);
////        System.out.println(name.length());
    }

    public static void demoCollection() {
        DebuggingDemo demo = new DebuggingDemo();

//            System.out.println("Out of Bound");
//            demo.outOfBoundDemo();

        System.out.println("NullPointer");
        demo.nullPointerDemo();

//        System.out.println("Infinite loop");
//        demo.infiniteLoop();

//        System.out.println("Calculate error");
//        demo.calculateError();

//        System.out.println("Stream debugging");
//        demo.streamDebugging()iwull;
    }

    public void outOfBoundDemo() {
        int[] numbers = {3, 5, 7, 9, 11};
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) { // bug: should be <
            sum += numbers[i];
        }
        System.out.println("Sum = " + sum);
    }

    public void nullPointerDemo() {
        Student[] students = new Student[3];
        students[0] = new Student("Alice", 85);
        students[2] = new Student("Charlie", 90);

        for (Student s : students) {
            System.out.println(s.name + " got " + s.grade); // NPE at index 1
        }
    }

    public void infiniteLoop(){
        int i = 1;
        while (i != 10) { // bug: i will skip 10
            i += 2;
            System.out.println("i = " + i);
        }
    }

    public void calculateError(){
        int result = new Calculator().multiply(4, 5);
        System.out.println("Result: "+ result);
    }

    /**
     * Use 'Trace current stream chain' in IntelliJ to debug the stream
     */
    public void streamDebugging(){
        List<Student> students = List.of(
                new Student("Alice", 85),
                new Student("Bob", 70),
                new Student("Charlie", 90),
                new Student("David", 60)
        );
        double average = students.stream()
                .filter(s -> s.grade >= 75)
                .mapToInt(s -> s.grade)
                .average()
                .orElse(0);
        System.out.println("Average grade of students with grade >= 75: " + average);
    }

    @Data
    @AllArgsConstructor
    class Student {
        String name;
        int grade;
    }
    @Data
    class Calculator{
        public int multiply(int a, int b){
            return a + b; // should be *
        }
    }
}
