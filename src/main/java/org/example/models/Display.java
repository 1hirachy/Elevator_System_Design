package org.example.models;

import  org.example.enums.Direction;
import  org.example.enums.FloorNumber;

public class Display {

    private FloorNumber floorNumber;
    private Direction direction;
    private Integer weight;

    public Display(FloorNumber floorNumber, Direction direction, Integer weight) {
        this.floorNumber = floorNumber;

        this.direction = direction;
        this.weight = weight;
    }

    public Display(){

    }

    public FloorNumber getFloorNumber(){
        return floorNumber;
    }

    public void setFloorNumber(){
        this.floorNumber = floorNumber;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
