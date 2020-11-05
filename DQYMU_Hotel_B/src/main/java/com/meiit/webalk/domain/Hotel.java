package com.meiit.webalk.domain;
import java.util.List;

public class Hotel {
    private String name;
    private String adress;
    private int stars;
    private List<Floor> floors;


    public Hotel(String name, String adress, int stars, List<Floor> floors) {
        super();
        this.name = name;
        this.adress = adress;
        this.stars = stars;
        this.floors = floors;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public int getStairs() {
        return stars;
    }
    public void setStairs(int stars) {
        this.stars = stars;
    }
    public List<Floor> getFloors(){
        return floors;
    }

}
