package com.company;

public class Prisoner {
    private boolean isDead;

    public Prisoner(){
        isDead = false;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
