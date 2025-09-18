package Interfaces;

public class interfaceDemo {
    public static void main(String[] args) {
        Phone jio = new jio();      
        jio.call();
        jio.message();

        Phone samsung = new Samsung();  
        samsung.call();
        samsung.message();
    }
}