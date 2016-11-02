package org.firstinspires.ftc.teamcode;

/**
 * Created by mg15 on 10/29/2016.
 */

public class SpeedController {
    double startingMiliseconds;
    int targetSpeedRPM;
    int startingTicks;
    public SpeedController(int targetSpeedRPM){
        this.targetSpeedRPM = targetSpeedRPM;
    }

    public void Init(double startingMiliseconds, int startingTicks){
        this.startingMiliseconds = startingMiliseconds;
                this.startingTicks = startingTicks;
    }

    public int getMotorSpeed(double currentMiliseconds, int currentTIcks){
        return 1;

    }
}
