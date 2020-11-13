import java.awt.*;

public abstract class Platform extends Vehicle implements IPlatform{

    private double anglePlatform;

    public Platform(int nrDoors, double enginePower, Color color, String modelName, double x, double y, double anglePlatform) {
        super(nrDoors, enginePower, color, modelName, x, y);
        this.anglePlatform = anglePlatform;
    }

    public double getAnglePlatform(){ return anglePlatform; }

    /**
     * Sets the given angle of the platform to always lie in the interval [0,70].
     * @param anglePlatform that the platform has.
     */



    public void platformAngleInterval(double anglePlatform){
        if(anglePlatform <= 0){
            anglePlatform = 0;
        }else if(anglePlatform >= 70){
            anglePlatform = 70;
        }
    }

    /**
     * Controls whether the platform is raised or not.
     * @param anglePlatform of the platform.
     * @return true or false depending on the platforms position.
     */

    public boolean checkPlatformAngle(double anglePlatform){
        if(anglePlatform == 0){
            return true;
        }
        return false;
    }

    /**
     *
     * @param anglePlatform
     */

    public void startTruck(double anglePlatform){
        if(checkPlatformAngle(anglePlatform)) {
            startEngine();
        }else{
            stopEngine();
        }
    }

}
