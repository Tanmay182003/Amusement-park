import java.util.ArrayList;

/**
 * Amusement Park
 *
 * The program is the generating the array for the game.
 *
 * @author Tanmay Singla singlat L-15
 *
 * @version 2022-02-28
 *
 */

public class WaterPark implements Park {
    private String name;
    private double admissionCost;
    private double land;
    private ArrayList<Ride> rides;
    private boolean indoor;
    private boolean outdoor;
    private boolean lazyRiver;
    private boolean wavePool;
    private boolean[] seasons;

    public WaterPark(String name, double admissionCost, double land, ArrayList<Ride> rides,
                     boolean indoor, boolean outdoor, boolean lazyRiver, boolean wavePool, boolean[] seasons) {
        this.name = name;
        this.admissionCost = admissionCost;
        this.land = land;
        this.rides = rides;
        this.indoor = indoor;
        this.outdoor = outdoor;
        this.lazyRiver = lazyRiver;
        this.wavePool = wavePool;
        this.seasons = seasons;
    }

    public void addRide(Ride ride) throws WrongRideException {
        if (ride instanceof Waterslide) {
            rides.add(ride);
        } else {
            throw new WrongRideException("A waterpark can only have waterslide rides!");
        }
    }

    public void close() {
        name = "";
        admissionCost = 0;
        land = 0;
        rides = null;
        seasons = null;
        indoor = false;
        outdoor = false;
        lazyRiver = false;
        wavePool = false;
    }

    public boolean isLazyRiver() {
        return lazyRiver;
    }

    public boolean isWavePool() {
        return wavePool;
    }

    @Override
    public double getAdmissionCost() {
        return admissionCost;
    }

    @Override
    public void setAdmissionCost(double admissionCost) {
        this.admissionCost = admissionCost;
    }

    @Override
    public double getLand() {
        return land;
    }

    public void setLand(double land) {
        this.land = land;
    }

    public void setLazyRiver(boolean lazyRiver) {
        this.lazyRiver = lazyRiver;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<Ride> getRides() {
        return rides;
    }

    public void setRides(ArrayList<Ride> rides) {
        this.rides = rides;
    }

    @Override
    public boolean[] getSeasons() {
        return seasons;
    }

    public void setSeasons(boolean[] seasons) {
        this.seasons = seasons;
    }

    @Override
    public boolean isIndoor() {
        return indoor;
    }

    @Override
    public boolean isOutdoor() {
        return outdoor;
    }

    public void setWavePool(boolean wavePool) {
        this.wavePool = wavePool;
    }

    public void modifyRide(Ride ride, String newName, String newColor, int newMinHeight,
                           int newMaxRiders, double newSplashDepth) {
        rides.set(rides.indexOf(ride), new Waterslide(newName, newColor, newMinHeight, newMaxRiders, newSplashDepth));

    }

    public void removeRide(Ride ride) {
        rides.remove(ride);
    }

    public void enlarge(double addedLand, double maxLand, boolean addedIndoor, boolean addedOutdoor)
            throws SpaceFullException {
        if (land + addedLand > maxLand) {
            throw new SpaceFullException();
        } else {
            land += addedLand;
            if (addedIndoor) {
                this.indoor = true;
            }
            if (addedOutdoor) {
                this.outdoor = true;
            }
        }
    }

}
