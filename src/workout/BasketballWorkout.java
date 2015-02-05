package workout;

/**
 * Created by sebluy on 12/25/14.
 */

public class BasketballWorkout implements Workout {

    public static final String NAME = "Basketball" ;

    private int mDuration ;

    public BasketballWorkout(int duration) {
        mDuration = duration ;
    }

    public int getDuration() {
        return mDuration;
    }

    @Override
    public String getName() {
        return NAME ;
    }

    @Override
    public void commit() {}

    @Override
    public Workout generate() {
        return this ;
    }


}
