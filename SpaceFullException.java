/**
 * A program that reads names from a text file, sorts them, then writes them to another text file.
 *
 * <p>Purdue University -- CS18000 -- Spring 2022</p>
 *
 * @author Purdue CS
 * @version January 10, 2022
 */

public class SpaceFullException extends Exception {
    public SpaceFullException(String errorMessage) {
        super(errorMessage);
    }
    public SpaceFullException() {
        super();
    }
}
