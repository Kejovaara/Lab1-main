import java.awt.*;

/**
 * Makes a vehicle able to drive.
 *   @author André Kejovaara
 *   @author Ingrid Nistal Sköldberg
 *   @author Shada Al-Wakkal
 *
 *  * @version 1.0
 */

public interface Driveable {
    int getNrDoors();

    double getEnginePower();

    double getCurrentSpeed();

    Color getColor();

    String getModelName();

}
