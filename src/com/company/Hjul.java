package com.company;

public class Hjul {
    private int antal;
    private String sommerellervinter;
    private int tommer;


    public Hjul(int antal, String sommerellervinter, int tommer){
        this.antal = antal;
        this.sommerellervinter = sommerellervinter;
        this.tommer = tommer;
    }


    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public String getSommerellervinter() {
        return sommerellervinter;
    }

    public void setSommerellervinter(String sommerellervinter) {
        this.sommerellervinter = sommerellervinter;
    }

    public int getTommer() {
        return tommer;
    }

    public void setTommer(int tommer) {
        this.tommer = tommer;
    }
}
