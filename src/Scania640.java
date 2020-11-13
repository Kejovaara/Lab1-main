import java.awt.*;

/**
 * This class specified the vehicle Scania640.
 *
 *   @author André Kejovaara
 *   @author Ingrid Nistal Sköldberg
 *   @author Shada Al-Wakkal
 *
 *   @version 1.0
 */


public class Scania640 extends Platform{

    /**
     * Sets value for the vehicle Scania640.
     */
    public Scania640(){
        super(2,100, Color.cyan,"Scania640",0,0,0);
        stopEngine();
    }

    /**
     * Increases the speed of the Scania640.
     * @param amount Amount to increase.
     */



    public void incrementSpeed(double amount){
        if(currentSpeed >= enginePower){
            currentSpeed = enginePower;
        }else {
            currentSpeed = 1;
        }
    }

    /**
     * Decreases the speed of the Scania640.
     * @param amount Amount to decrease.
     */

    public void decrementSpeed(double amount){
        if(currentSpeed >= enginePower){
            currentSpeed = enginePower;
        }else {
            currentSpeed = 0;
        }
    }

//Behövde implementeras här eftersom de implementeras inte i platform (abstrakta klassen)
    @Override
    public void platformAngleInterval() {

    }

    @Override
    public void startTruck() {

    }

    @Override
    public boolean checkPlatformAngle() {
        return false;
    }
}


