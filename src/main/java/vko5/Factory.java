package vko5;

import java.util.ArrayList;

public class Factory {
    private String name;
    private ArrayList<Machine> machines = new ArrayList<>();

    public void addMachine(Machine machine){
        machines.add(machine);
    }

    public ArrayList<Machine> getMachines(){
        return machines;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}