package org.launchcode.studio7;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class DVD extends BaseDisc implements OpticalDisc {

    private String videoType;

    public DVD(String name, Double size, Double spinRate, String videoType) {
        super(name, size, spinRate);
        this.videoType = videoType;
    }

    @Override
    public void spinDisc() {
        System.out.println(this.getName() + " dvd spins at a rate of " + this.getSpinRate());
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
