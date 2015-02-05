package workout.staticcore;

import java.util.ArrayList;

/**
 * Created by sebluy on 1/18/15.
 */
public interface StaticCoreWorkoutStorage {

    ArrayList<StaticCoreExerciseInfo> getExerciseList() ;

    StaticCoreExerciseInfo getExercise(String name) ;

    void commit() ;

}

