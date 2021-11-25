/* ******************************************************************************8
#  problem statement 
Q14. Define a class Circle and write a method that computes the area of a circular region, given the radius of the inner and outer circles.
 */

//  imports 
import java.lang.*; // dont need to import but this is good to remember
import java.math.*; // get the mathematical functions and constants 
import  java.util.Scanner; // import to get the input form user

class Circle {
    private float innerRadius; // radius of inner circle 
    private float outerRadius; //radius of outer circle
    private double area; // area of circular region
    public Circle( float innerRadius, float outerRadius) {
        this.innerRadius = innerRadius; // setting the parameters 
        this.outerRadius = outerRadius; // setting the parameters 
        this.area = Math.PI * (this.outerRadius*this.outerRadius) - Math.PI * (this.innerRadius * this.innerRadius); // calculate the circular 
        area of both the circles        
    }
    @Override
    public String toString() {
        //returns the area of circle when we try to print the obejct hence need of getters is reduced 
        return "" + this.area;
    }

}

class Executor {
    // main class (driver class ) 
    public static void main(String[] args) {
      Scanner myScanner = new Scanner(System.in); //initalizing the getter object 
      float innerRadius ; // local var
      float outerRadius; // local var 
      System.out.println("Hey!  Welcome to the easiest area calculator for a concenteric circle"); // welcome statement 
      System.out.println(" please Enter the Radius of inner circle  >>  "); // input prompt 
      innerRadius = myScanner.nextFloat(); //parsing the comming input string to float 
      System.out.println(" please Enter the Radius of outer circle >>  "); //input prompt 
      outerRadius = myScanner.nextFloat();//parsing the comming input string to float 
      Circle firstCircle = new Circle(innerRadius, outerRadius); // using the created circle class
      System.out.println("area of the circle is "+ firstCircle ); // printing the area calculated 
      myScanner.close(); // clossing the scanner for optimizing the program form memory leaks 
    }
}
/////////////////////////done //////////////////////////////////

/*
to compile the program use ======> javac Executor.java
to interpret the compiled program  ====> java Exector
*/

