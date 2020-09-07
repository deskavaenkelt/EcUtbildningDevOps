package se.dsve;

public class Chair {
    private boolean haveWheels;
    private String material;

    public Chair(boolean haveWheels, String material) {
        this.haveWheels = haveWheels;
        this.material = material;
    }

    public boolean getHaveWheels() {
        return haveWheels;
    }

    public void setHaveWheels(boolean haveWheels) {
        this.haveWheels = haveWheels;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
