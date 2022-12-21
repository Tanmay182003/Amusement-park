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

public class Rollercoaster extends Ride {
    private boolean simulated;

    public Rollercoaster(String name, String color, int minHeight, int maxRiders, boolean stimulated) {
        super(name, color, minHeight, maxRiders);
        this.simulated = stimulated;
    }

    public boolean isSimulated() {
        return simulated;
    }

    public void setSimulated(boolean stimulated) {
        this.simulated = stimulated;
    }

    public boolean equals(Object o) {
        {
            if (this == o) {                                               //Step 1
                return true;
            }

            if (!(o instanceof Ride)) {                                //Step 2
                return false;
            }

            Rollercoaster temp = (Rollercoaster) o;                                  //Step 3

            return (this.getName().equals(temp.getName()) && this.getColor().equals(temp.getColor())
                    && this.getMinHeight() == temp.getMinHeight() &&
                    this.getMaxRiders() == temp.getMaxRiders() && this.isSimulated() == isSimulated());
        }
    }

    @Override
    public String toString() {
        String slide = String.format("Name: %s\nColor: %s\nMinHeight: %d inches\nMaxRiders: %d\nSimulated: %b",
                Rollercoaster.this.getName(), Rollercoaster.this.getColor(), Rollercoaster.this.getMinHeight(),
                Rollercoaster.this.getMaxRiders(), simulated);
        return slide;
    }
}
