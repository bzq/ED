package org.energydata.model;

import java.util.Date;

public class Measure {

    
        private Date date;
            private boolean state;
            
                private float energyValue;

    /**
     * Get the value of energyValue
     *
     * @return the value of energyValue
     */
    public float getEnergyValue() {
        return energyValue;
    }

    /**
     * Set the value of energyValue
     *
     * @param energyValue new value of energyValue
     */
    public void setEnergyValue(float energyValue) {
        this.energyValue = energyValue;
    }


    /**
     * Get the value of state
     *
     * @return the value of state
     */
    public boolean isState() {
        return state;
    }

    /**
     * Set the value of state
     *
     * @param state new value of state
     */
    public void setState(boolean state) {
        this.state = state;
    }


    /**
     * Get the value of date
     *
     * @return the value of date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the value of date
     *
     * @param date new value of date
     */
    public void setDate(Date date) {
        this.date = date;
    }

}
