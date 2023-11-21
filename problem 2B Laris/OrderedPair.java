
/**
 * Write a description of class orderedpair here.
 *
 * @author (laris)
 * @version (nov 20)
 */
public class OrderedPair {
    //instace variables
    double x, y;

    public OrderedPair() { //constructor initializes instance vars
        x = 0;
        y = 0;
    }

    public OrderedPair(double myX, double myY) { //constructor initializes instance vars
        x = myX;
        y = myY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
}