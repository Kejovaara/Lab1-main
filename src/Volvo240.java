import java.awt.*;

/**
 * This class specified the vehicle Volvo240.
 *
 *   @author André Kejovaara
 *   @author Ingrid Nistal Sköldberg
 *   @author Shada Al-Wakkal
 *
 *   @version 1.0
 */

public class Volvo240 extends VehicleTrim{

    /**
     * Sets value for the vehicle Volvo240.
     */
    public Volvo240(){
        super(4, 125, Color.black, "Volvo240", 0, 0);
        stopEngine();
    }

    /**
     * Increases the speed of the Volvo240.
     * @param amount Amount to increase.
     */
    public void incrementSpeed(double amount){
	    if(currentSpeed >= enginePower){
            currentSpeed = enginePower;
        }else {
            currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
        }
    }

    /**
     * Decreases the speed of the Volvo240.
     * @param amount Amount to decrease.
     */
    public void decrementSpeed(double amount){
        if(currentSpeed <= 0){
            currentSpeed = 0;
        }else {
            currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        }
    }
}
