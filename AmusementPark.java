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

public class AmusementPark implements Park {

    private double admissionCost;
    private boolean arcade;
    private boolean bowling;
    private boolean indoor;
    private double land;
    private String name;
    private boolean outdoor;
    private ArrayList<Ride> rides;
    private boolean[] seasons;

    public AmusementPark(String name, double admissionCost, double land, ArrayList<Ride> rides,
                         boolean indoor, boolean outdoor, boolean arcade,
                         boolean bowling, boolean[] seasons) {
        this.name = name;
        this.admissionCost = admissionCost;
        this.land = land;
        this.rides = rides;
        this.indoor = indoor;
        this.outdoor = outdoor;
        this.arcade = arcade;
        this.bowling = bowling;
        this.seasons = seasons;
    }

    public void addRide(Ride ride) throws WrongRideException {

        if (ride instanceof Rollercoaster) {
            rides.add(ride);
        } else {
            throw new WrongRideException("An amusement park can only have rollercoaster rides!");
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
        arcade = false;
        bowling = false;
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

    public boolean isArcade() {
        return arcade;
    }

    public void setArcade(boolean arcade) {
        this.arcade = arcade;
    }

    public boolean isBowling() {
        return bowling;
    }

    public void setBowling(boolean bowling) {
        this.bowling = bowling;
    }

    @Override
    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
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
    public boolean isOutdoor() {
        return outdoor;
    }

    public void setOutdoor(boolean outdoor) {
        this.outdoor = outdoor;
    }

    @Override
    public ArrayList<Ride> getRides() {
        return rides;
    }

    public void modifyRide(Ride ride, String newName, String newColor,
                           int newMinHeight, int newMaxRiders, boolean newSimulated) {

        rides.set(rides.indexOf(ride), new Rollercoaster(newName, newColor , newMinHeight, newMaxRiders, newSimulated));

//        ride.setName(newName);
//        ride.setColor(newColor);
//        ride.setMinHeight(newMinHeight);
//        ride.setMaxRiders(newMaxRiders);
//        Rollercoaster.isSimulated()
    }

    public void setRides(ArrayList<Ride> rides) {
        this.rides = rides;
    }

    @Override
    public boolean[] getSeasons() {
        return seasons;
    }

    @Override
    public void setSeasons(boolean[] seasons) {
        this.seasons = seasons;
    }

    public void removeRide(Ride ride) {
        rides.remove(ride);
    }

    public void enlarge(double addedLand, double maxLand, boolean addedIndoor,
                        boolean addedOutdoor) throws SpaceFullException {
        if (land + addedLand > maxLand) {
            throw new SpaceFullException();
        } else {
            land += addedLand;
        }
    }
}
