package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    private String audioType;

    public CD(String name, Double size, Double spinRate, String audioType) {
        super(name, size, spinRate);
        this.audioType = audioType;
    }

    @Override
    public void spinDisc() {
        System.out.println(this.getName() + " CD spins at a rate of " + this.getSpinRate());
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
