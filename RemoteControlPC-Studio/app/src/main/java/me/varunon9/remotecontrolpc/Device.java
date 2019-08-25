package me.varunon9.remotecontrolpc;

public class Device {
    private String name;
    private String mac;
    private float rssi;

    public Device(String name, String mac, float rssi) {
        this.name = name;
        this.mac = mac;
        this.rssi = rssi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public float getRssi() {
        return rssi;
    }

    public void setRssi(float rssi) {
        this.rssi = rssi;
    }

    public float getDistance() {
        return (float) Math.pow(10, (Math.abs(rssi) - 45) / (10 * 3.25));
    }
}
