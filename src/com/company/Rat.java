package com.company;

public class Rat {
    private static String form = "rundt";
    private boolean turnLeft;
    private boolean turnRight;
    private boolean horn;


    public Rat(boolean horn){
        this.horn = horn;
    }

    public static String getForm() {
        return form;
    }

    public static void setForm(String form) {
        Rat.form = form;
    }

    public boolean isTurnLeft() {
        return turnLeft;
    }

    public void setTurnLeft(boolean turnLeft) {
        this.turnLeft = turnLeft;
    }

    public boolean isTurnRight() {
        return turnRight;
    }

    public void setTurnRight(boolean turnRight) {
        this.turnRight = turnRight;
    }

    public boolean isHorn() {
        return horn;
    }

    public void setHorn(boolean horn) {
        this.horn = horn;
    }
}
