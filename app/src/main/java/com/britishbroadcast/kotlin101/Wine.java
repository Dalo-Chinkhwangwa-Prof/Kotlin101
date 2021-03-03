package com.britishbroadcast.kotlin101;

import java.util.Objects;

//data class WineK(val year: Int, val name: String, val location: String, val type: String)
public class Wine {

    private int year;
    private String name;
    private String location;
    private String type;

    public Wine(int year, String name, String location, String type) {
        this.year = year;
        this.name = name;
        this.location = location;
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //hashCode
    //equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wine wine = (Wine) o;
        return year == wine.year &&
                Objects.equals(name, wine.name) &&
                Objects.equals(location, wine.location) &&
                Objects.equals(type, wine.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name, location, type);
    }
}


