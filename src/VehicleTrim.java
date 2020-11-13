import java.awt.*;

/**
 * The class that determines the trimFactor of a specified vehicle.
 *
 *   @author André Kejovaara
 *   @author Ingrid Nistal Sköldberg
 *   @author Shada Al-Wakkal
 *
 *  * @version 1.0
 */

public abstract class VehicleTrim extends Vehicle implements Trimmable {
    private final static double trimFactor = 1.25;

    /**
     * Tells us which parameters a vehicle with trim needs to have to be created.
     * @param nrDoors Number of doors of the vehicle
     * @param enginePower Horsepower of the engine
     * @param color Color of the vehicle
     * @param modelName Model name of the vehicle
     * @param x x-coordinate of the vehicle (position)
     * @param y y-coordinate of the vehicle (position)
     */
    public VehicleTrim(int nrDoors, double enginePower, Color color, String modelName, double x, double y) {
        super(nrDoors, enginePower, color, modelName, x, y);
    }

    /**
     * Fetches the speedFactor of the specified vehicle.
     * @return the speedFactor.
     */
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }
}
