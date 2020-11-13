import java.awt.*;

/**
 * The class that determines the turbo of a specified vehicle.
 *
 *   @author André Kejovaara
 *   @author Ingrid Nistal Sköldberg
 *   @author Shada Al-Wakkal
 *
 *   @version 1.0
 */

public abstract class VehicleTurbo extends Vehicle implements Turbo {
    private boolean hasTurbo;

    /**
     * Tells us which parameters a vehicle with a turbo needs to have to be created.
     * @param nrDoors Number of doors of the vehicle
     * @param enginePower Horsepower of the engine
     * @param color Color of the vehicle
     * @param modelName Model name of the vehicle
     * @param hasTurbo If vehicle has turbo or not
     * @param x x-coordinate of the vehicle (position)
     * @param y y-coordinate of the vehicle (position)
     */
    public VehicleTurbo(int nrDoors, double enginePower, Color color, String modelName, boolean hasTurbo, double x, double y) {
        super(nrDoors, enginePower, color, modelName, x, y);
        this.hasTurbo = hasTurbo;
    }

    /**
     * Sets the turbo on.
     */
    public void setTurboOn(){ hasTurbo = true; }

    /**
     * Sets the turbo off.
     */
    public void setTurboOff(){ hasTurbo = false; }

    /**
     * Fetches the speedFactor of the specified vehicle.
     * @return the speedFactor.
     */
    public double speedFactor(){
        double turbo = 1;
        if(hasTurbo) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }
}
