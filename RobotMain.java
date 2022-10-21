import java.lang.String;
//import the String object; data types in Java can be objects!
//For example, integers are their own objects with their own methods.  Integer objects are pointed to by
//java variables. The variable 'int Two = 2' is pointing to an integer object that stores the value of 2.
//This principle of OOP is not so important for the robot program but is important to understand the syntax.

//declare the class RobotMain
public class RobotMain {
    //this is the main method; the 'main' method is where the program runs
    public static void main(String[] args) {
        Motor TestMotor = new Motor();
        String MotorRotation = String.valueOf(RobotFunctions.CheckMotorRotation(TestMotor));

        // System is an Object that provides a lot of useful functions for interacting with your system.
        // Within System, "out" is an output "stream." Streams are just things you can send and receive data to/from.
        // The println function will print what's passed to it, followed by a new line (ln)
        System.out.println(MotorRotation);
    }
}