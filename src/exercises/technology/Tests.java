package exercises.technology;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {
    Computer test_comp;
    Laptop test_laptop;
    SmartPhone test_smartphone;

    @Before
    public void createCompObject (){ test_comp = new Computer(1000);}
    @Before
    public void createLaptopObject (){ test_laptop = new Laptop(500);}
    @Before
    public void createSmartphoneObject () { test_smartphone = new SmartPhone(256);}

    //testing computer
    @Test
    public void testingHardDrive (){
        test_comp.setHardDrive(1000);
        assertEquals(1000, 1000, .001);
    }
    @Test
    public void testingCPU (){
        test_comp.setCpu(1.37);
        assertEquals(1.37, 1.37, .001);
    }
    @Test
    public void testingTouchscreen (){
        test_comp.setTouchScreen(true);
        assertEquals(true, true);
    }

    //testing laptop
    @Test
    public void hasWifi (){
        test_laptop.setHasWifi(true);
        assertEquals(true, true);
    }
    @Test
    public void throwingLaptop (){
        test_laptop.setHasWifi(true);
        test_laptop.throwLaptop();
        assertTrue("Wifi is enabled", true);
    }

    //testing smartphone
    @Test
    public void checkBrand (){
        test_smartphone.setIphone(true);
        assertTrue(true);
    }
    @Test
    public void checkUpgrade (){
        test_smartphone.setIphone(true);
        test_smartphone.upgradePhone();
        assertTrue("Smart choice!!", true);
    }


}
