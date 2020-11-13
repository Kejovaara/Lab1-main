import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Labb1Test {
    @org.junit.Test
    public void testDoors() {
        Volvo240 volvo = new Volvo240();
        assertEquals(volvo.getNrDoors(), 4);
        Saab95 saab95 = new Saab95();
        assertEquals(saab95.getNrDoors(), 2);
    }

    @org.junit.Test
    public void testEnginePower() {
        Volvo240 volvo = new Volvo240();
        assertTrue(volvo.enginePower >= 100);
        Saab95 saab = new Saab95();
        assertEquals(125, saab.enginePower, 0.0);
    }

    @org.junit.Test
    public void testColor() {
        Volvo240 volvo = new Volvo240();
        assertEquals(volvo.getColor(), Color.black);
        Saab95 saab = new Saab95();
        assertEquals(saab.getColor(), Color.red);
    }

    @org.junit.Test
    public void testModelName() {
        Volvo240 volvo = new Volvo240();
        assertEquals(volvo.getModelName(), "Volvo240");
        Saab95 saab = new Saab95();
        assertEquals(saab.getModelName(), "Saab95");
    }

    @org.junit.Test
    public void testSpeedFactor() {
        Volvo240 volvo = new Volvo240();
        assertTrue(volvo.speedFactor() >= 1.25);
    }

    @org.junit.Test
    public void testIncrementSpeed() {
        Saab95 saab = new Saab95();
        saab.startEngine(); //currentSpeed = 0.1;
        saab.incrementSpeed(10);
        saab.setTurboOff(); // speedFactor = 1.25
        saab.speedFactor();
        assertTrue(saab.currentSpeed >= 12.6);
    }

    @org.junit.Test
    public void testDecrementSpeed() {
        Volvo240 volvo = new Volvo240();
        volvo.startEngine(); //currentSpeed = 0.1;
        volvo.speedFactor(); // = 1.25
        volvo.getEnginePower(); //100
        volvo.decrementSpeed(10);
        assertTrue(volvo.currentSpeed >= -12.4);
        Saab95 saab = new Saab95();
        saab.startEngine(); //currentSpeed = 0.1;
        saab.speedFactor(); // = 1.25
        saab.getEnginePower(); //100
        saab.decrementSpeed(10);
        assertTrue(saab.currentSpeed >= -12.4);
    }

    @org.junit.Test
    public void testGas() {
        Volvo240 volvo = new Volvo240();
        volvo.startEngine(); // currentSpeed 0.1
        volvo.gas(5); //fel
        assertTrue(volvo.currentSpeed >= 1);
    }

    @org.junit.Test
    public void TestCurrentSpeed() {
        Saab95 saab = new Saab95();
        saab.currentSpeed = -1;
        saab.getCurrentSpeed();
        assertEquals(0, saab.currentSpeed, 0.0);
        saab.currentSpeed = 200;
        saab.getCurrentSpeed();
        assertEquals(saab.currentSpeed, saab.enginePower, 0.0);
    }

    @org.junit.Test
    public void testGasIncrementSpeed() {
        Volvo240 volvo = new Volvo240();
        volvo.startEngine(); // currentSpeed 0.1
        double speedBefore = volvo.currentSpeed;
        volvo.gas(1);
        double speedAfter = volvo.currentSpeed;
        assertTrue(speedAfter > speedBefore);
    }

    @org.junit.Test
    public void testBrake() {
        Volvo240 volvo = new Volvo240();
        volvo.startEngine(); // currentSpeed 0.1
        volvo.brake(-1); // amount = 0
        assertTrue(volvo.currentSpeed >= 0.1); // 0.1 - 1.25(speedFactor)
    }

    @org.junit.Test
    public void testBrakeDecrementSpeed() {
        Volvo240 volvo = new Volvo240();
        volvo.startEngine(); // currentSpeed 0.1
        double speedBefore = volvo.currentSpeed;
        volvo.brake(1);
        double speedAfter = volvo.currentSpeed;
        assertTrue(speedAfter < speedBefore);
    }

    @org.junit.Test
    public void testMove() {
        Volvo240 volvo = new Volvo240();
        volvo.startEngine();
        volvo.move();
        assertTrue(volvo.getY() >= 0.1);
    }

    @org.junit.Test
    public void testTurnLeft() {
        Volvo240 volvo = new Volvo240();
        volvo.startEngine();
        volvo.turnLeft();
        assertTrue(volvo.getX() >= -0.1);
    }

    @org.junit.Test
    public void testTurnRight() {
        Volvo240 volvo = new Volvo240();
        volvo.startEngine();
        volvo.turnRight();
        assertTrue(volvo.getX() >= 0.1);
    }

    @org.junit.Test
    public void testSetColor() {
        Volvo240 volvo = new Volvo240();
        volvo.setColor(Color.BLACK);
        assertEquals(volvo.getColor(), Color.BLACK);
    }

    @org.junit.Test
    public void TestSaab95SpeedFactorWithTurboOn() {
        Saab95 saab = new Saab95();
        saab.setTurboOn();
        assert (saab.speedFactor() >= 1.625);
    }

    @org.junit.Test
    public void TestSaab95SpeedFactorWithTurboOff() {
        Saab95 saab = new Saab95();
        saab.setTurboOff();
        assert (saab.speedFactor() >= 1.25);
    }

    @org.junit.Test
    public void TestplatformAngleInterval() {
        Scania640 scania = new Scania640();
        scania.platformAngleInterval(-1);
        assert (scania.getAnglePlatform() == 0);

    }

    @org.junit.Test
    public void testPlatform(){
      Scania640 scania = new Scania640();
      scania.startTruck(0);
      assert(scania.getCurrentSpeed() == 0.1);

      scania.startTruck(3);
      assert(scania.getCurrentSpeed() == 0);

    }


}
