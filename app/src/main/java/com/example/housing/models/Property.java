package com.example.housing.models;

public class Property {
    private String price;
    private String property;
    private String propertyby;
    private String location;
    private String twinshareac;
    private String tripleshareac;

    // Constructor
    public Property(String price, String property, String propertyby,
                    String location, String twinshareac, String tripleshareac) {
        this.price = price;
        this.property = property;
        this.propertyby = propertyby;
        this.location = location;
        this.twinshareac = twinshareac;
        this.tripleshareac = tripleshareac;
    }

    // Getter methods
    public String getPrice() {
        return price;
    }

    public String getProperty() {
        return property;
    }

    public String getPropertyBy() {
        return propertyby;
    }

    public String getLocation() {
        return location;
    }

    public String getTwinSharePrice() {
        return twinshareac;
    }

    public String getTripleSharePrice() {
        return tripleshareac;
    }
}
