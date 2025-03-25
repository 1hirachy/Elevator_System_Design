package org.example.models;

import  org.example.enums.DoorAction;

public class Door {

    private DoorAction doorAction;

    public Door(DoorAction doorAction) {
        this.doorAction = doorAction;
    }

    public Door() {
        this.doorAction = DoorAction.CLOSE;
    }


    public void openDoor() {
        doorAction = DoorAction.OPEN;
    }


    public void closeDoor() {
        doorAction = DoorAction.CLOSE;
    }


    public boolean isOpen() {
        return doorAction == DoorAction.OPEN;
    }

}
