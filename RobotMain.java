import java.lang.String;
import java.io.*;

public class RobotMain {
    public static void main(String[] args){
            Motor TestMotor = new Motor();
            System.out.println(String.valueOf(RobotFunctions.CheckMotorRotation(TestMotor)));
        }
    }