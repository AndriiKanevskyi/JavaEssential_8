package Excercise2_Device;

public class Main {
    public static void main(String[] args) {
        EthernetAdapter microtic = new EthernetAdapter("Microtic",130F,"DW7AA06",1000,"00:26:57:00:1f:02");
        EthernetAdapter zexell = new EthernetAdapter("Zexell",130F,"DW6PV61",1000,"00:28:55:01:4f:04");
        Monitor samsung = new Monitor("Samsung",100F,"DW6NR61",1080,720);
        //System.out.println(samsung.toString());
        //System.out.println(microtic.toString());
        System.out.println(microtic.equals(zexell));


    }
}
