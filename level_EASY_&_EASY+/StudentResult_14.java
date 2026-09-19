//SAMRAT_MUKHERJEE
//WAP IN JAVA to Create a Student class with marks of three subjects. Calculate total, average, and result using methods.


class Student {
    int mark1;
    int mark2;
    int mark3;

    // Constructor to initialize marks
    Student(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate total marks
    int total() {
        return mark1 + mark2 + mark3;
    }

    // Method to calculate average marks
    double average() {
        return total() / 3.0;
    }

    // Method to calculate result
    String result() {
        if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}

public class StudentResult_14 {
    public static void main(String[] args) {

        // Create Student object
        Student s = new Student(75, 80, 65);

        // Display total, average and result
        System.out.println("Total = " + s.total());
        System.out.println("Average = " + s.average());
        System.out.println("Result = " + s.result());
    }
}