# CodingPractice

practice coding -
It's fine if you don't complete all of these! They are just introductory tasks to figure out java's syntax and
structure. And remember, google is always your friend :)

use `javac` to compile classes.

```shell
javac ./RobotMain.java
```

use `java` to run RobotMain.class, which will run your program

```shell
java RobotMain
```

NOTE: An encoder value is what is used to measure the rotation of a motor. For simplicity, 'rotating' and 'setting' the
rotation of the motor will be modifying this value.

task one: Compile the classes and run the program in RobotMain.

You should get the output:
0

task two. Change the encoder value in the motor by a function in RobotFunctions.
Create a function called `SetMotor`
it should be...  (*note: the \*\* asterisks are just used to bold words*)

- a **public** function: we want classes to access it
- a **static** function: we want classes to access it without creating a RobotFunctions object
- a **void** function: we don't want the function to *return* any value.

and it needs to take

- a **motor** parameter: Motor (Type Your Reference Word Here)

task three. Create a function called RotateMotor. It should rotate the motor by a specified value.

task four. Create a function in RobotFunctions called ResetEncoder. it should set the encoder back to zero.

task five. try taking an object-oriented approach - put the RotateMotor, ResetEncoder, and SetMotor in the Motor class
and
call those from there. Make a RobotMain program that rotates five motors and prints the encoder value of each one!


