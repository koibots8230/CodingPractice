
public class RobotFunctions {
    //no main method, as we want RobotMain to be our program
    //public and static, as we want other classes to access it, and the static keyword
    //is to indicate that it is a method that should be accessed through the class, not as an object
    //This way, instead of creating a RobotFunctions object, we only need a RobotFunctions class
    public static int CheckMotorRotation(Motor Motor) {
        return Motor.Encoder;
    }
    

}
