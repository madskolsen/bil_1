package com.company;

public class Bil {
    private String biltype;
    private String model;
    private int stelnummer;
    private int antalDøre;
    private static String softwareVersion = "0.0.1";
    private int hastighed;
    private Rat ditRat;
    private Motor dinMotor;
    private Bremse dinBremse;
    private Hjul ditHjul;
    public boolean motorStatus = false;
    public boolean turningLeft;
    public boolean turningRight;
    public int procentHastighed;

    public Bil(String biltype, String model, int stelnummer, int antalDøre, int hastighed, Rat ditRat, Motor dinMotor, Bremse dinBremse, Hjul ditHjul){
        this.biltype = biltype;
        this.model = model;
        this.stelnummer = stelnummer;
        this.antalDøre = antalDøre;
        this.hastighed = hastighed;
        this.dinBremse = dinBremse;
        this.dinMotor = dinMotor;
        this.ditHjul = ditHjul;
        this.ditRat = ditRat;
    }


    public boolean tændMotor(){
        motorStatus = true;
        System.out.println("Motoren er nu tændt.");
        return motorStatus;
    }
    public boolean slukMotor(){
        motorStatus = false;
        System.out.println("Motoren er nu slukket.");
        return motorStatus;
    }
    public int forøgHastighed(){
        this.procentHastighed++;
        System.out.println("Din hastighed er nu på: "+procentHastighed+"%");
        if (procentHastighed>=100){
            System.out.println("Din bil kan ikke kører hurtigere!!");
        } else {
        return procentHastighed;
        }
        return procentHastighed;
    }
    public int bremsBil(){
        this.procentHastighed--;
        System.out.println("din hastighed faldt med 1%");
        System.out.println(procentHastighed+"%");
        return procentHastighed;
    }
    public void turnRight(int gradersdrej){
        ditRat.setTurnRight(true);
        turningRight=true;
        if (turningLeft){
            turningLeft=false;
        }
        System.out.println("Din bil drejer "+gradersdrej+" grader mod højre.");

    }
    public void turnLeft(int gradersdrej){
        ditRat.setTurnLeft(true);
        turningLeft = true;

        if (turningRight){
            turningRight = false;
        }

        System.out.println("Din bil drejer "+gradersdrej+" grader mod venstre.");

    }
    public void fullStop(){
        double bremselængde = (procentHastighed*1.5/2);
        procentHastighed = 0;
        System.out.println("Din bil har nu en hastighed på "+procentHastighed);
        System.out.println("Du stoppede bilen på en strækning på "+bremselængde+" meter");

    }
    public void straightDrive(){
        turningLeft = false;
        ditRat.setTurnLeft(false);
        turningRight = false;
        ditRat.setTurnRight(false);
        System.out.println("Du kører nu lige ud.");
    }



    public String getBiltype() {
        return biltype;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStelnummer() {
        return stelnummer;
    }

    public void setStelnummer(int stelnummer) {
        this.stelnummer = stelnummer;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public int getHastighed() {
        return hastighed;
    }

    public void setHastighed(int hastighed) {
        this.hastighed = hastighed;
    }

    @Override
    public String toString() {
        return biltype + " model: " + model + ", stelnummer: " + stelnummer + " med "+antalDøre+" døre." + " En top fart på " + hastighed +", der kører på software version: " + softwareVersion;
    }

    public Rat getDitRat() {
        return ditRat;
    }

    public void setDitRat(Rat ditRat) {
        this.ditRat = ditRat;
    }

    public Motor getDinMotor() {
        return dinMotor;
    }

    public void setDinMotor(Motor dinMotor) {
        this.dinMotor = dinMotor;
    }

    public Bremse getDinBremse() {
        return dinBremse;
    }

    public void setDinBremse(Bremse dinBremse) {
        this.dinBremse = dinBremse;
    }

    public Hjul getDitHjul() {
        return ditHjul;
    }

    public void setDitHjul(Hjul ditHjul) {
        this.ditHjul = ditHjul;
    }
}