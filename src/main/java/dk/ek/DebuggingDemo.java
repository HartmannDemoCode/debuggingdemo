package dk.ek;

import lombok.AllArgsConstructor;
import lombok.Data;

public class DebuggingDemo {
    public static void main(String[] args) {
        demoCollection();
    }

    public static void demoCollection() {
        DebuggingDemo demo = new DebuggingDemo();

//        System.out.println("Out of Bound");
//        demo.outOfBoundDemo();

//        System.out.println("NullPointer");
//        demo.nullPointerDemo();

//        System.out.println("Infinite loop");
//        demo.infiniteLoop();

        System.out.println("Calculate error");
        demo.calculateError();
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
