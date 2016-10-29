package org.firstinspires.ftc.teamcode;

/**
 * Created by mg15 on 10/14/2016.
 */

public class Settings {
    public static double normalDriveSpeed = 0.5;
    public static int stageBlueCorner1Forward = 1;
    public static int stageBlueCorner2Right = 2;
    public static int stageBlueCorner3Line = 3;
    public static int getStageBlueCorner4Turn = 4;
    public static int stageBlueCorner5Fire = 5;
    public static int blueLine = 15;
    public static double gearratio = 3/ 1;//motor revolutions /wheel revolution
    public final static int ticsPerRevoulution = 1440;
    public final static double wheelCircumfence = 10*Math.PI; //wheel diameter * PI
    public static double TicsPerCM = (gearratio *ticsPerRevoulution)/wheelCircumfence;
    public static int blueTapeAngle = 45;
    public static int fireAngle = 15;
    public static double lineFollowHigh = .8;
    public static double lineFollowLow = .25;
    public static int stage3Distance = 50;
    public static int stage1FIRE = 1;
    public static int stage2Charge = 2;
    public static int stage3Stop = 3;
    public static double driveSpeed = 1;
    public static int cornerDriveDistance = 145;
    public static int middleDriveDistance = 135;


    public static double Tics2CM (int tics){
        return tics / TicsPerCM;
    }

}