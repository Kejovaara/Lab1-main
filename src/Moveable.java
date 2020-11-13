/**
 * Makes a vehicle able to move.
 *   @author André Kejovaara
 *   @author Ingrid Nistal Sköldberg
 *   @author Shada Al-Wakkal
 *
 *  * @version 1.0
 */

public interface Moveable {
    void move();
    void turnLeft();
    void turnRight();
    double getX();
    double getY();
}
