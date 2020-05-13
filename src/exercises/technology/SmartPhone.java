package exercises.technology;

public class SmartPhone extends Computer{
    private boolean isIphone;

    public SmartPhone(int aHardDrive) {
        super(aHardDrive);
    }

    public String upgradePhone(){
        if(this.isIphone == false){
            return ("Android is trash, get an IPhone!");
        } else {
            return ("Smart choice!!");
        }
    }

    public boolean isIphone() {
        return this.isIphone;
    }

    public void setIphone(boolean iphone) {
        this.isIphone = iphone;
    }
}
