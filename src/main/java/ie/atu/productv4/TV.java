package ie.atu.productv4;

public class TV extends Product {

    private int ScreenSize;
    private String Manufacturer;

    public TV() {
        super();
        ScreenSize = 0;
        Manufacturer = "";
        count++;
    }

    public void setScreensSize(int ScreenSize) {
        this.ScreenSize = ScreenSize;
    }

    public int getScreenSize() {
        return ScreenSize;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + Manufacturer + " with a screen size of " + ScreenSize;
    }
}
