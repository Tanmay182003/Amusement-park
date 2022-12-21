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

public class Waterslide extends Ride {
    private double splashDepth;

    public Waterslide(String name, String color, int minHeight, int maxRiders, double splashDepth) {
        super(name, color, minHeight, maxRiders);
        this.splashDepth = splashDepth;
    }

    public double getSplashDepth() {
        return splashDepth;
    }

    public void setSplashDepth(double splashDepth) {
        this.splashDepth = splashDepth;
    }

    public boolean equals(Object o) {
        if (this == o) {                                               //Step 1
            return true;
        }

        if (!(o instanceof Ride)) {                                //Step 2
            return false;
        }

        Waterslide temp = (Waterslide) o;                                  //Step 3

        return (this.getName().equals(temp.getName()) && this.getColor().equals(temp.getColor())
                && this.getMinHeight() == temp.getMinHeight() && this.getMaxRiders() == temp.getMaxRiders() &&
                this.getSplashDepth() == temp.getSplashDepth());
    }

    @Override
    public String toString() {
        String slide = String.format("Name: %s\nColor: %s\nMinHeight: %d inches\nMaxRiders: " +
                        "%d\nSplashDepth: %.1f feet",
                Waterslide.this.getName(), Waterslide.this.getColor(), Waterslide.this.getMinHeight(),
                Waterslide.this.getMaxRiders(), splashDepth);
        return slide;

    }
}
