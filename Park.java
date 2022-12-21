import java.util.ArrayList;

/**
 * Lab Manager
 *
 * The program is the generating the array for the game.
 *
 * @author Tanmay Singla singlat L-15
 *
 * @version 2022-02-28
 *
 */

public interface Park {
    public void setName(String name);
    public String getName();
    public void setAdmissionCost(double admissionCost);
    public double getAdmissionCost();
    void enlarge(double addedLand, double maxLand, boolean addedIndoor, boolean addedOutdoor) throws SpaceFullException;
    double getLand();
    void addRide(Ride ride) throws WrongRideException;
    void removeRide(Ride ride);
    ArrayList<Ride> getRides();
    boolean isIndoor();
    boolean isOutdoor();
    void setSeasons(boolean[] seasons);
    boolean[] getSeasons();
    void close();
}
