package org.energydata.model;

import java.util.ArrayList;

public class Sensor {

    private String identifySensor;
    private String descriptionSensor;
    private String location;
    private Appliance appliance;
    private HouseHold houseHold;
 
    private ArrayList<Measure> listOfMeasure;

    /**
     * Get the value of identifySensor
     *
     * @return the value of identifySensor
     */
    public String getIdentifySensor() {
        return identifySensor;
    }

    /**
     * Set the value of identifySensor
     *
     * @param identifySensor new value of identifySensor
     */
    public void setIdentifySensor(String identifySensor) {
        this.identifySensor = identifySensor;
    }

    /**
     * Get the value of descriptionSensor
     *
     * @return the value of descriptionSensor
     */
    public String getDescriptionSensor() {
        return descriptionSensor;
    }

    /**
     * Set the value of descriptionSensor
     *
     * @param descriptionSensor new value of descriptionSensor
     */
    public void setDescriptionSensor(String descriptionSensor) {
        this.descriptionSensor = descriptionSensor;
    }

    /**
     * Get the value of location
     *
     * @return the value of location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Set the value of location
     *
     * @param location new value of location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Measure> getListOfMeasure() {
        return listOfMeasure;
    }

    public void setListOfMeasure(ArrayList<Measure> listOfMeasure) {
        this.listOfMeasure = listOfMeasure;
    }

    public void addMeasure(Measure measure) {

        this.listOfMeasure.add(measure);

    }
    
    
       /**
     * Get the value of houseHold
     *
     * @return the value of houseHold
     */
    public HouseHold getHouseHold() {
        return houseHold;
    }

    /**
     * Set the value of houseHold
     *
     * @param houseHold new value of houseHold
     */
    public void setHouseHold(HouseHold houseHold) {
        this.houseHold = houseHold;
    }

    /**
     * Get the value of appliance
     *
     * @return the value of appliance
     */
    public Appliance getAppliance() {
        return appliance;
    }

    /**
     * Set the value of appliance
     *
     * @param appliance new value of appliance
     */
    public void setAppliance(Appliance appliance) {
        this.appliance = appliance;
    }
}
