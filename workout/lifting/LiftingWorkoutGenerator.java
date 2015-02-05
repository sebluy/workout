package workout.lifting;

import workout.Exercise;
import workout.Workout;

import java.util.ArrayList;

/**
 * Created by sebluy on 12/25/14.
 */

public class LiftingWorkoutGenerator {

    private LiftingWorkoutController mController ;
    private LiftingWorkoutOrderGenerator mOrderGenerator ;

    public LiftingWorkoutGenerator(LiftingWorkoutController controller) {
        mController = controller ;
        mOrderGenerator = controller.getOrderGenerator() ;
    }

    public Workout generate() {
        return new LiftingWorkout(mController, generateExercises()) ;
    }

    private ArrayList<Exercise> generateExercises() {
        ArrayList<String> order = mOrderGenerator.generate() ;
        int size = order.size() ;
        ArrayList<Exercise> exerciseList = new ArrayList<>(size) ;

        for (int i = 0 ; i < size ; i++) {
            String exerciseName = order.get(i) ;
            LiftingExerciseInfo exerciseInfo = mController.getExercise(exerciseName) ;
            exerciseList.add(exerciseInfo.newExercise()) ;
        }

        return exerciseList ;
    }

}
