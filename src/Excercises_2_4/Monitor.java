package Excercises_2_4;

import java.util.Objects;

public class Monitor extends Device{
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor :" +
                " "+ "manufacturer :"+this.getManufacturer()+" "+
                "price :"+this.getPrice()+" "+
                "serialNumber :"+this.getSerialNumber()+" "+
                "resolutionX=" + resolutionX +" "+
                ", resolutionY=" + resolutionY +" ";
    }

    public boolean equals(Object obj) {
        if (this==obj)return true;
        if (obj==null) return false;
        if (getClass()!=obj.getClass())return false;
        Monitor that = (Monitor) obj;
        if (getSerialNumber()==that.getSerialNumber() &&
                 getResolutionX()== that.getResolutionX()&&
                 getResolutionY()== that.getResolutionY()){return true;}
                                                          else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSerialNumber(),resolutionX, resolutionY);
    }
}
