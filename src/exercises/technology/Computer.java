package exercises.technology;

public class Computer extends AbstractEntity{
    private int hardDrive;
    private boolean touchScreen;
    private double cpu;
    private boolean isRunning;

    public Computer(int aHardDrive){
        setHardDrive(aHardDrive);
    }
    public int getHardDrive() { return this.hardDrive;}

    public void setHardDrive(int hardDrive) { this.hardDrive = hardDrive; }

    public boolean isTouchScreen() { return this.touchScreen; }

    public void setTouchScreen(boolean touchScreen) { this.touchScreen = touchScreen; }

    public double getCpu() { return this.cpu; }

    public void setCpu(double cpu) { this.cpu = cpu; }

    public boolean isRunning() { return this.isRunning; }

    public void setRunning(boolean running) { this.isRunning = running; }


}
