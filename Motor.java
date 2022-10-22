public class Motor {
    //we want this variable to be accessible by other classes;
    //therefore, it is made to be public

    //NOTICE: In most OOP programing, you do not want variables to be like this.
    //to prevent scope issues and to have safer code, it is better to keep variables private
    //and to have getter methods for them. 
    //For example, in the robot code, we have a getter method in the Encoder object rather than a Motor.Encoder value
    public int Encoder = 0;
}
