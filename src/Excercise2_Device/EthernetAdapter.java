package Excercise2_Device;

import java.util.Objects;

public class EthernetAdapter extends Device{
private int speed;
private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter :" +
                " "+"manufacturer :"+this.getManufacturer()+" "+
                "price :"+this.getPrice()+" "+
                "serialNumber :"+this.getSerialNumber()+" "+
                "speed :"+speed+" "+
                "mac :"+mac;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)return true;
        if (obj==null) return false;
        if (getClass()!=obj.getClass())return false;
        EthernetAdapter that = (EthernetAdapter) obj;
        if (mac==that.mac &&
                getSerialNumber()==that.getSerialNumber()){return true;}
                                                            else return false;
    }

//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        EthernetAdapter that = (EthernetAdapter) o;
//        return speed == that.speed && Objects.equals(mac, that.mac);
//    }


}
