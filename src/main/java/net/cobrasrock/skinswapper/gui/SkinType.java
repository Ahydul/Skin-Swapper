package net.cobrasrock.skinswapper.gui;

public enum SkinType {
    CLASSIC("default"),
    SLIM("slim");

    private final String name;

    SkinType(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
