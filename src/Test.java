public class Test{
    public static void main(String[] args)
    {
        Computer c=new Computer("Lenovo",256,12);
        //Computer c1=new Computer("Dell",512,8);
        c.displaySpecs();
        c.powerOn();
        c.enableBluetooth();
        Bluetooth b=new Computer("IBM",256,12);
        b.enableBluetooth();
        System.out.println(Hotspot.password);
     //c.changeSignalStrength();
    }
}
