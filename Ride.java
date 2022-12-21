import java.util.Objects;
import java.util.Arrays;

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

public class Ride {
    private String color;
    private int maxRiders;
    private int minHeight;
    private String name;

    public Ride() {
        this.name = "";
        this.color = "";
        this.maxRiders = 0;
        this.minHeight = 0;
    }

    public Ride(String name, String color, int minHeight, int maxRiders) {
        this.name = name;
        this.color = color;
        this.minHeight = minHeight;
        this.maxRiders = maxRiders;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {

        if (this == o) {                                               //Step 1
            return true;
        }

        if (!(o instanceof Ride)) {                                //Step 2
            return false;
        }

        Ride temp = (Ride) o;                                  //Step 3

        return (this.getName().equals(temp.getName()) && this.getColor().equals(temp.getColor())
                && this.getMinHeight() == temp.getMinHeight() && this.getMaxRiders() == temp.getMaxRiders());
    }

    @Override
    public String toString() {
        String ride1 = String.format("Name: %s\nColor: %s\nMinHeight: %d inches\nMaxRiders: %d",
                name, color, minHeight, maxRiders);
        return ride1;
    }
}
