package org.firstinspires.ftc.teamcode;

/**
 * Created by mg15 on 10/14/2016.
 */

//test small change

public class Settings {
    public static double normalDriveSpeed = 0.5;
    public static int stageBlueCorner1Forward = 1;
    public static int stageBlueCorner2Right = 2;
    public static int stageBlueCorner3Line = 3;
    public static int getStageBlueCorner4Turn = 4;
    public static int stageBlueCorner5Fire = 5;
    public static int blueLine = 15;
    public static double gearratio = 2/ 1;//motor revolutions /wheel revolution
    public final static int ticsPerRevoulution = 1440;
    public final static double wheelCircumfence = 8*Math.PI; //wheel diameter * PI-
    public static double TicsPerCM = (gearratio *ticsPerRevoulution)/wheelCircumfence;
    public static int blueTapeAngle = 45;
    public static int fireAngle = 15;
    public static double lineFollowHigh = .8;
    public static double lineFollowLow = .25;
    public static int stage3Distance = 50;
    public static int stage1FIRE = 1;
    public static int stage2Charge = 2;
    public static int stage3turn180 = 3;
    public static int stage4backup = 4;
    public static int stage5stop = 5;
    public static double driveSpeed = 1;
    public static int cornerDriveDistance = 155;
    public static int middleDriveDistance = 149;
    public static int middleBackupDriveDistance = -30;
    public static int beforeShootDrive = 25;
    public static int stagecorner1shoot = 1;
    public static double spinnerShooterAuto = 1;
    public static double spinnerShooterMiddle = .7;
    public static int turnOffShooter = 6;
    public static double launch = .6;
    public static double reset = 0;
    public static int firstLaunch = 2;
    public static int firstReset = 3;
    public static int secondLaunch = 5;
    public static int secondReset = 6;
    public static int stageDriveForwardcorner2 = 2;
    public static double shooterSpeedTeleOP = -.9;
    public static double shooterSpeedAuto = -.7;
    public static double bestShooterSpeed = 120 * Math.PI;
    public static int beaconRight = 1;
    public static int beaconLeft = 0;
    public static double Tics2CM (int tics){
        return tics / TicsPerCM;
    }
}





