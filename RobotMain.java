import java.lang.String;
//import the String object; data types in Java can be objects! 
//For example, integers are their own objects with their own methods.  Integer objects are pointed to by
//java variables. The variable 'int Two = 2' is pointing to an integer object that stores the value of 2.
//This principle of OOP is not so important for the robot program but is important to understand the syntax.

import java.io.*;
//declare the class RobotMain
public class RobotMain {
    //this is the main method; the 'main' method is where the program runs
    public static void main(String[] args){
            Motor TestMotor = new Motor();
            System.out.println(String.valueOf(RobotFunctions.CheckMotorRotation(TestMotor)));
        }
    }