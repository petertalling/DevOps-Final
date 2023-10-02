package com.example.demo;

public class Car {
    Light light;

    Engine engine;

    public Car() {
        this.light = new Light(false, "HALF", false);
        this.engine = new Engine(false);
    }

    public void stopEngine() {
        engine.setEngineStatus(false);
        light.frontLightsOff();
        light.backLightsOff();
    }

    public void startEngine() {
        engine.setEngineStatus(true);
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public Engine getEngine() {
        return engine;
    }

}