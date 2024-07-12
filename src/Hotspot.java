public interface Hotspot {
    String password="kmit123$";//strings are public static
    int noofdevices=10;
    void getpassword();
    default void changeSignalStrength(){
        System.out.println("changing from airtel to bsnl");
    }
    static void hello(){
        System.out.println("static method call");
    }//no of methods in interface
    //static,default,abstract default & static has a body you dont create obj for static methods ,default mathods are like instance methods
    void m3();
    private void m2(){
        System.out.println("private methods");
    }
}
