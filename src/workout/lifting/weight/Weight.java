package workout.lifting.weight;

/**
 * Created by sebluy on 1/29/15.
 */
public interface Weight {

    void next() ;

    void reset() ;

    String toString() ;

    String getUnit() ;

    public String getName() ;

    public double getForce() ;

}