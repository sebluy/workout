package workout.calisthenic;

import workout.Workout;
import workout.WorkoutController;

/**
 * Created by sebluy on 12/25/14.
 */
public class CalisthenicWorkoutController implements WorkoutController {

    public static final String NAME = "Calisthenic" ;

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private CalisthenicWorkoutGenerator mGenerator ;
    private CalisthenicWorkoutStorage mStorage ;

    public CalisthenicWorkoutController(CalisthenicWorkoutStorage storage) {
        mStorage = storage ;
        mGenerator = new CalisthenicWorkoutGenerator(this) ;
    }

    @Override
    public void commit(Workout workout) {}

    @Override
    public Workout generate() {
        return mGenerator.generate() ;
    }

    public CalisthenicWorkoutStorage getStorage() {
        return mStorage ;
    }

    public String getName() {
        return NAME ;
    }

}
