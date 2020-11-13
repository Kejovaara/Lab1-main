import java.awt.*;

/**
 * This class specified the vehicle Saab95.
 *
 *   @author André Kejovaara
 *   @author Ingrid Nistal Sköldberg
 *   @author Shada Al-Wakkal
 *
 *   @version 1.0
 */
public class Saab95 extends VehicleTurbo{

    /**
     * Sets value for the vehicle Volvo240.
     */
    public Saab95(){
        super(2, 125, Color.red, "Saab95",false, 0, 0);
        stopEngine();
    }

    /**
     * Increases the speed of the Saab95.
     * @param amount Amount to increase.
     */
    public void incrementSpeed(double amount){
        if(currentSpeed >= enginePower){
            currentSpeed = enginePower;
        }else{
            currentSpeed = getCurrentSpeed() + speedFactor() * amount;
        }
    }

    /**
     * Decreases the speed of the Saab95.
     * @param amount Amount to increase.
     */
    public void decrementSpeed(double amount){
        if(currentSpeed <= 0){
            currentSpeed = 0;
        }else {
            currentSpeed = getCurrentSpeed() - speedFactor() * amount;
        }
    }
}
