package exercises.technology;

public class Laptop extends Computer{
    private boolean hasWifi;

    public Laptop(int aHardDrive) {
        super(aHardDrive);
    }

    public String throwLaptop(){
        if (this.hasWifi == false){
            return ("Throw this junk away!");
        } else {
            return ("Wifi is enabled");
        }
    }

    public boolean isHasWifi() {
        return this.hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
}
