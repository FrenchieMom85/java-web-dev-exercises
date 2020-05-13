package exercises.technology;

public class Main {
    public static void main (String[] args){
        Laptop hp = new Laptop(550);
        hp.setHasWifi(false);
        System.out.println(hp.throwLaptop());
        SmartPhone proMax = new SmartPhone(265);
        proMax.setIphone(false);
        System.out.println(proMax.upgradePhone());
        proMax.setTouchScreen(true);
        System.out.println(hp.iD);
        System.out.println(proMax.iD);
    }
}
