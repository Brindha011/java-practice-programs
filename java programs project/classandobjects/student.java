//write a program for a to demonstrate class and object using a student class
//The Student class should contain:
//Data members:id, name, marks
//The class should have:
//A method calculateGrade() that:,Returns A if marks ≥ 90,Returns B if marks ≥ 75,Returns C if 
//marks ≥ 50,Returns Fail otherwise
//A method displayDetails() that prints:Student id,Student name,Student marks,Student grade
//In the main method:Create two Student objects,Assign values to their data members
//Call the methods and display the output

public class student{
    int id;
    String name;
    int marks;

    String calculateGrade() {
        if (marks>=90) {
            return "A";
        }else if(marks >=75) {
            return "B";
        }else if(marks >=50) {
            return "c";
        }else{
            return "Fail";
        }
    }

        void displayDetails() {
            System.out.println("ID: "+id);
            System.out.println("NAME: "+name);
            System.out.println("MARKS: "+marks);
            System.out.println("GRADE: "+calculateGrade());
            System.out.println("------------------------------");
        }


    public static void main(String[] args){
        student st1 = new student();

        st1.id = 101;
        st1.name = "Brindha";
        st1.marks = 90;

        student st2 = new student();

        st2.id = 102;
        st2.name = "Darshika";
        st2.marks = 92;
        
        System.out.println(st2.name);
        Syste.out.println(st1.name);
        st1.displayDetails();
        st2.displayDetails();

    }
}