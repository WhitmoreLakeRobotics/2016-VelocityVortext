package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.Servo;
t import com.qualcomm.robotcore.util.Hardware;


public class Shooter extends OpMode {
    private DcMotor leftShootMotor = null;
    private DcMotor rightShootMotor = null;
    private Servo shootTrigger = null;
    private double shooterSpeed = 1;
    private boolean triggerIsReset = false;
    private ElapsedTime shotTimer = null;
    public double timeTriggerUp = 1.0;
    public double timeTriggerDown = 2.0;

    public static double posTriggerShoot = 0;
    public static double posTriggerReset = .6;
    public static double posTriggerTol = .1;

    Shooter() {

        leftShootMotor = hardwareMap.dcMotor.get("leftShootMotor");
        rightShootMotor = hardwareMap.dcMotor.get("rightShootMotor");
        shootTrigger = hardwareMap.servo.get("shootTrigger");
        shotTimer = new ElapsedTime();
        shotTimer = new ElapsedTime();
        setMotorSpeed(0);
        resetTrigger();
    }

    @Override
    public void init() {

    }

    public void setMotorSpeed(double speed) {
        //set the shooter motor speeds

        if (shooterSpeed != speed) {
            shooterSpeed = speed;
            if (shooterSpeed > 1.0) {
                shooterSpeed = 1.0;
            }
            if (shooterSpeed < 0.0) {
                shooterSpeed = 0.0;
            }
            leftShootMotor.setPower(shooterSpeed);
            rightShootMotor.setPower(shooterSpeed);
        }
    }

    private void pullTrigger() {
        //moves the trigger to the shoot position
        if (triggerIsReset) {
            shotTimer.reset();
            shootTrigger.setPosition(posTriggerShoot);
            triggerIsReset = false;
        }
    }

    private void resetTrigger() {
        //moves the trigger to the reset position
        if (triggerIsReset == false) {
            triggerIsReset = true;
            shootTrigger.setPosition(posTriggerReset);
        }
    }

    public void shoot() {
        if (triggerIsReset) {
            pullTrigger();
        }
    }

    public boolean isShotDone() {
        //This is to be called repeatedly to keep the shot progressing
        if (shotTimer.time() > timeTriggerUp + timeTriggerDown) {
            return isTriggerinPosition(posTriggerReset, posTriggerTol);
        } else {
            return false;
        }
    }

    public void loop() {
        // put this in the loop to make the shooter cycle


    }

    private boolean isTriggerinPosition(double setPosition, double tol) {
        //Is the trigger in the requested position ?  with some tollerance window

        double currPos = shootTrigger.getPosition();
        boolean retValue = false;
        if (currPos > (setPosition - tol) ||
                currPos < (setPosition + tol)){
            retValue = true;
        }

        return retValue;

    }


    public void adjustSpeed() {
        //Read encoders and adjust speed as needed to bring it back to
        //set speed.
    }
}
