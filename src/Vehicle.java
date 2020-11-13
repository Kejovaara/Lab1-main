import java.awt.*;

/**
 * The class Vehicle represents a vehicle of any type.
 * @author André Kejovaara
 * @author Ingrid Nistal Sköldberg
 * @author Shada Al-Wakkal
 *
 * @version 1.0
 */

public abstract class Vehicle implements Driveable, Moveable{

    /**
     * Engine power of the vehicle.
     */
    protected double enginePower;
    /**
     * The current speed of the vehicle.
     */
    protected double currentSpeed;

    private int nrDoors; // Number of doors on the vehicle
    private Color color; // Color of the vehicle
    private String modelName; // The vehicle model name
    private double x;
    private double y;

    /**
     * Tells us which parameters a vehicle needs to have to be created.
     */
    public Vehicle(int nrDoors, double enginePower, Color color, String modelName, double x, double y) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.x = x;
        this.y = y;
    }

    /**
     * Sets a specified color to the specified vehicle.
     * @param clr The specified color.
     */
    public void setColor(Color clr){
        color = clr;
    }

    /**
     * Fetches the color of the specified vehicle.
     * @return the color.
     */
    public Color getColor(){
        return color;
    }

    /**
     * Fetches the number of doors of the specified vehicle.
     * @return the number of doors.
     */
    public int getNrDoors(){
        return nrDoors;
    }

    /**
     * Starts the engine of the specified vehicle.
     */
    public void startEngine(){
        currentSpeed = 0.1;
    }

    /**
     * Stops the engine of the specified vehicle.
     */
    public void stopEngine(){
        currentSpeed = 0;
    }

    /**
     * Fetches the power of the engine.
     * @return the power of the engine.
     */
    public double getEnginePower(){
        return enginePower;
    }

    /**
     * Fetches the current speed of the specified vehicle.
     * @return current speed of vehicle.
     */
    public double getCurrentSpeed(){
        if(currentSpeed < 0){
            currentSpeed = 0;
        }else if(currentSpeed > enginePower){
            currentSpeed = enginePower;
        }
        return currentSpeed;
    }

    /**
     * Fetches the model name of the specified vehicle.
     * @return the model name.
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Increases speed of the specified vehicle.
     * @param amount Amount to increase.
     */
    public abstract void incrementSpeed(double amount);

    /**
     * Decreases speed of the specified vehicle.
     * @param amount Amount to decrease.
     */
    public abstract void decrementSpeed(double amount);

    /**
     * Sets the given amount to always lie in the interval [0,1]
     * @param amount Amount to decrease/increase.
     * @return the amount.
     */
    public double checkInterval(double amount){
        if(amount < 0) {
            amount = 0;
        }
        if(amount > 1){
            amount = 1;
        }
        return amount;
    }

    /**
     * Gets the x coordinate of the specified vehicle.
     * @return the x coordinate.
     */
    public double getX() {
        return x;
    }

    /**
     * Gets the y coordinate of the specified vehicle.
     * @return the y coordinate.
     */
    public double getY() {
        return y;
    }

    /**
     * Moves the specified vehicle.
     */
    public void move(){
        this.y += currentSpeed;
    }

    /**
     * Turns the specified vehicle left.
     */
    public void turnLeft(){
        this.x -= currentSpeed;
    }

    /**
     * Turns the specified vehicle right.
     */
    public void turnRight(){
        this.x += currentSpeed;
    }

    /**
     * Presses the gas pedal to increase the speed of the specified vehicle.
     * @param amount Amount to increase.
     */
    public void gas(double amount){
        checkInterval(amount);
        incrementSpeed(amount);
    }

    /**
     * Presses the brake pedal to slow down the specified vehicle.
     * @param amount Amount to decrease.
     */
    public void brake(double amount){
        checkInterval(amount);
        decrementSpeed(amount);
    }

}
