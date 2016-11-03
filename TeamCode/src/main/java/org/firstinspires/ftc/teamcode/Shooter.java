package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.Servo;


public class Shooter {
    private DcMotor leftShootMotor = null;
    private DcMotor rightShootMotor = null;
    private server trigger = null;
    private double shooterSpeed = 1;
    private boolean triggerIsReset = false;

    Shooter (DcMotor leftShooter, DcMotor rightShooter, Servo trigger){
        leftShootMotor = leftShooter;
        rightShootMotor = rightShooter;
        shootTrigger = trigger;
        setMotorSpeed(0)
        resetTrigger()
    }

    public void setMotorSpeed(double speed){
        //set the shooter motor speeds
        if (shooterSpeed != speed) {
          shooterSpeed = speed;
          leftShootMotor.setMotorSpeed(speed);
          rightShootMotor.setMotorSpeed(speed);
        }
    }

    public void pullTrigger(){
        //moves the trigger to the shoot position
        if (triggerIsReset) {
          shootTrigger.setPosition(settings.posTriggerShoot);
          triggerIsReset = false;
        }
    }

    public void resetTrigger(){
        //moves the trigger to the reset position
        if (triggerIsReset == false) {
            triggerIsReset = true;
            shootTrigger.setPosition(settings.posTriggerReset);
        }
    }

    public void adjustSpeed(){
      //Read encoders and adjust speed as needed to bring it back to
      //set speed.
    }
}
