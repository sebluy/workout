package workout.lifting;

import java.util.ArrayList;

/**
 * Created by sebluy on 1/18/15.
 */
public interface LiftingWorkoutStorage {

    LiftingExerciseInfo getExercise(String name) ;

    void commit() ;

    ArrayList<ArrayList<String>> getPrimaryPairs() ;

    ArrayList<ArrayList<String>> getInjuryPrevention() ;

}

