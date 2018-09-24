package egen.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name="Readings")
public class Readings {

    @Id
    //@Column(columnDefinition = "varchar(36)")
    private String vin;
    private Double latitude;
    private Double longitude;
    private Timestamp timestamp;
    private int fuelVolume;
    private int speed;
    private int engineHp;
    private boolean checkEngineLightOn;
    private boolean engineCoolantLow;
    private boolean cruiseControlOn;
    private int engineRpm;
    @Embedded
    private Tires tires;


    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEngineHp() {
        return engineHp;
    }

    public void setEngineHp(int engineHp) {
        this.engineHp = engineHp;
    }

    public boolean isCheckEngineLightOn() {
        return checkEngineLightOn;
    }

    public void setCheckEngineLightOn(boolean checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    public boolean isEngineCoolantLow() {
        return engineCoolantLow;
    }

    public void setEngineCoolantLow(boolean engineCoolantLow) {
        this.engineCoolantLow = engineCoolantLow;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    public void setCruiseControlOn(boolean cruiseControlOn) {
        this.cruiseControlOn = cruiseControlOn;
    }

    public int getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(int engineRpm) {
        this.engineRpm = engineRpm;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Readings{" +
                ", vin='" + vin + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", timestamp=" + timestamp +
                ", fuelVolume=" + fuelVolume +
                ", speed=" + speed +
                ", engineHp=" + engineHp +
                ", checkEngineLightOn=" + checkEngineLightOn +
                ", engineCoolantLow=" + engineCoolantLow +
                ", cruiseControlOn=" + cruiseControlOn +
                ", engineRpm=" + engineRpm +
                ", tires=" + tires +
                '}';
    }
}
