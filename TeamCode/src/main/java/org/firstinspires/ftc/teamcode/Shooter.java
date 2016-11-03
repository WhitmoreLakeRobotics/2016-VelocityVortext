package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Hardware;


public class Shooter {
    private DcMotor leftShootMotor = null;
    private DcMotor rightShootMotor = null;
    private server trigger = null;
    private double shooterSpeed = 1;
    private boolean triggerIsReset = false;
    private ElapsedTime shotTimer = null;
    Shooter (){

      leftShootMotor = hardwareMap.dcMotor.get("leftShootMotor");
      rightShootMotor = hardwareMap.dcMotor.get("rightShootMotor");
      shootTrigger = hardwareMap.servo.get("shootTrigger");
      shotTimer = new ElapsedTime)();
      setMotorSpeed(0)
      resetTrigger()
    }

    public void setMotorSpeed(double speed){
        //set the shooter motor speeds

        if (shooterSpeed != speed) {
          shooterSpeed = speed
          if (shooterSpeed > 1.0) {shooterSpeed = 1.0}
          if (shooterSpeed < 0.0) {shooterSpeed = 0.0}
          leftShootMotor.setMotorSpeed(shooterSpeed);
          rightShootMotor.setMotorSpeed(shooterSpeed);
        }
    }

    private void pullTrigger(){
        //moves the trigger to the shoot position
        if (triggerIsReset) {
          shotTimer.reset()
          shootTrigger.setPosition(settings.posTriggerShoot);
          triggerIsReset = false;
        }
    }

    private void resetTrigger(){
        //moves the trigger to the reset position
        if (triggerIsReset == false) {
            triggerIsReset = true;
            shootTrigger.setPosition(settings.posTriggerReset);
        }
    }

    public void shoot(){
      if (triggerIsReset){
        pullTrigger()
      }
    }

    public boolean isShotDone(){
      //This is to be called repeatedly to keep the shot progressing
      if (shotTimer.time() > )

      return false;

    }



    private boolean isTriggerinPosition(double setPosition, double tol){
      return false;
    }

    public void adjustSpeed(){
      //Read encoders and adjust speed as needed to bring it back to
      //set speed.
    }
}
