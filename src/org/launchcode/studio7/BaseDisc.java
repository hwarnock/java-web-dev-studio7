package org.launchcode.studio7;

public class BaseDisc {

    private String name;
    private Double size;
    private Double spinRate;

    public BaseDisc(String name, Double size, Double spinRate) {
        this.name = name;
        this.size = size;
        this.spinRate = spinRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(Double spinRate) {
        this.spinRate = spinRate;
    }
}
