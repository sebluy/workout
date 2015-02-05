package workout;

/**
 * Created by sebluy on 12/25/14.
 */

public interface Workout {

    String getName() ;

    void commit() ;

    Workout generate() ;

}
