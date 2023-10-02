package com.example.demo;

public class Engine {
    private boolean engineStatus;

    public Engine(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    public boolean getEngineStatus() {
        return engineStatus;
    }

    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }
}