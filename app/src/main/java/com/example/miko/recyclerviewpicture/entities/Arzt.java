package com.example.miko.recyclerviewpicture.entities;

/**
 * Created by miko on 11.05.2017.
 */

public class Arzt {
    private String arztName;
    private String arztPicture;

    public Arzt(String arztName, String arztPicture){
        this.arztName = arztName;
        this.arztPicture = arztPicture;

            }
    public String getArztName(){
        return arztName;

    }

    public String getArztPicture() {
        return arztPicture;
    }
}
