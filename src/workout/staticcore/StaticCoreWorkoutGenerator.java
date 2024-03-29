package workout.staticcore;

import workout.Exercise;
import workout.Workout;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sebluy on 12/25/14.
 */
public class StaticCoreWorkoutGenerator {

    private static final int CIRCUITS = 2 ;

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private StaticCoreWorkoutController mController;
    private ArrayList<StaticCoreExerciseInfo> mExercises ;

    public StaticCoreWorkoutGenerator(StaticCoreWorkoutController controller) {
        mController = controller ;
        mExercises = controller.getStorage().getExerciseList() ;
    }

    public Workout generate() {
        return new StaticCoreWorkout(mController, generateExercises()) ;
    }

    private ArrayList<Exercise> generateExercises() {
        Collections.shuffle(mExercises) ;
        ArrayList<Exercise> workout = new ArrayList<>(CIRCUITS * mExercises.size()) ;
        for (int i = 0 ; i < CIRCUITS ; i++) {
            for (StaticCoreExerciseInfo exercise : mExercises) {
                workout.add(exercise.newExercise()) ;
            }
        }
        return workout ;
    }

}
