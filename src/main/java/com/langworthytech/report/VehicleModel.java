package com.langworthytech.report;

import java.util.Objects;

public class VehicleModel {

    private String vin;
    private String year;
    private String make;
    private String model;
    private String city;
    private String state;

    public VehicleModel(String vin, String year, String make, String model, String city, String state) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.city = city;
        this.state = state;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleModel that = (VehicleModel) o;
        return Objects.equals(vin, that.vin) && Objects.equals(year, that.year) && Objects.equals(make, that.make) && Objects.equals(model, that.model) && Objects.equals(city, that.city) && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, year, make, model, city, state);
    }

    @Override
    public String toString() {
        return "VehicleModel{" +
                "vin='" + vin + '\'' +
                ", year='" + year + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
