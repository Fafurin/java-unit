package Task2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehicleTest {

    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    public void init(){
        car = new Car("KIA","Carnival",2020);
        motorcycle = new Motorcycle("Honda","GL 1800 Cold Wings",2018);
    }

    @Test
    public void testIsTheCarObjectTheVehicle()
    {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testIsTheCarObjectHas4Wheels()
    {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testIsTheMotorcycleObjectHas2Wheels()
    {
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testIsTheCarObjectHasSpeed60InTestDrivingMode()
    {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testIsTheMotorcycleObjectHasSpeed75InTestDrivingMode()
    {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testIsTheCarObjectStopInParkingMode()
    {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testIsTheMotorcycleObjectStopInParkingMode()
    {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

}