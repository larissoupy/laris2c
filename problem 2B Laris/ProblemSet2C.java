
/**
 * Write a description of class ProblemSet2C here.
 *
 * @author still laris
 * @version nov 21
 */
public class ProblemSet2C {
    //slope?
    //aaaaaaaaaaaaaaaaaaaa
    
    public static void main (String[] args) {
        OrderedPair p1, p2;
        p1 = new OrderedPair(0,0);
        p2 = new OrderedPair(2,3);
        System.out.println(midPoint(p1, p2));
    
    }
    
    public static double slopeFinder (OrderedPair a1, OrderedPair a2){
        double slope = (a2.getY() - a1.getY()) / (a2.getX() - a1.getX());
        //             name of thing, then get_ is something we already wrote
        //referenced for help with this
        return slope;
    }
    
    //im gonna try the midpoint one
    public static OrderedPair midPoint(OrderedPair b1, OrderedPair b2){
        double midX = (b1.getX() + b2.getX()) / 2;
        double midY = (b1.getY() + b2.getY()) / 2;
        OrderedPair answer = new OrderedPair(midX, midY);
        return answer;
        
        
    }

}
