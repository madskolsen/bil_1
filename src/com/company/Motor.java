package com.company;

public class Motor {
    private int hestekræfter;
    private int liter;
    private boolean elbil;


    public Motor(int hestekræfter, int liter, boolean elbil){
        this.hestekræfter = hestekræfter;
        this.liter = liter;
        this.elbil = elbil;
    }






    public int getHestekræfter() {
        return hestekræfter;
    }

    public void setHestekræfter(int hestekræfter) {
        this.hestekræfter = hestekræfter;
    }

    public int getLiter() {
        return liter;
    }

    public void setLiter(int liter) {
        this.liter = liter;
    }

    public boolean isElbil() {
        return elbil;
    }

    public void setElbil(boolean elbil) {
        this.elbil = elbil;
    }
}
