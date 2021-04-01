/*
 * Author: Sonwabile Gxoyiya
 * Student Number: 219267189
 * Group Leader
 * File: Phone.java
 */

package za.ac.cput.JavaProjectForGit;

public class Phone {

    private int serialNumber;
    private String brand;
    private String model;
    private int processorPower;

    public Phone(){}

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProcessorPower(int processorPower) {
        this.processorPower = processorPower;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProcessorPower() {
        return processorPower;
    }

    public String runApplication()
    {
        if(processorPower < 2)
        {
            return "Cannot run application";
        }

        else{
            return "Successfully open Application";
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", processorPower=" + processorPower +
                '}';
    }
}
