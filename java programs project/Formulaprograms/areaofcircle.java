import java.util.Scanner;
    class areaofcircle{
        public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value radius of circle(r):");
        double radius = scan.nextDouble();
        // double area = Math.PI * Math.pow(radius,2);
        double pi = 3.14159;
        double area=(pi * radius * radius);
        System.out.print("The AreaOfCircle:"+area);
        }
    }
