/* ******************************************************************************8
#  problem statement 
Q14. Define a class Circle and write a method that computes the area of a circular region, given the radius of the inner and outer circles.
 */

//  imports 
import java.lang.*;
import java.math.*;
import  java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class Circle {
    private float innerRadius;
    private float outerRadius;
    private double area;
    public Circle( float innerRadius, float outerRadius) {
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
        this.area = Math.PI * (this.outerRadius*this.outerRadius) - Math.PI * (this.innerRadius * this.innerRadius);      
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "" + this.area;
    }

}

class Executor {

    public static void main(String[] args) {
      Scanner myScanner = new Scanner(System.in);
      float innerRadius ;
      float outerRadius;
      System.out.println("Hey Welcome to the easiest area calculator for a concenteric circle");
      System.out.println(" please Enter the Radius of inner circle : ");
      innerRadius = myScanner.nextFloat();
      System.out.println(" please Enter the Radius of outer circle : ");
      outerRadius = myScanner.nextFloat();
      Circle firstCircle = new Circle(innerRadius, outerRadius);
      System.out.println("area of the circle is "+ firstCircle );
      myScanner.close();
    }
}
