package workout.calisthenic;

import workout.BaseExerciseWorkout;
import workout.Exercise;
import workout.Workout;

import java.util.*;

/**
 * Created by sebluy on 12/25/14.
 */
public class CalisthenicWorkoutGenerator {

    private CalisthenicWorkoutController mController;
    private ArrayList<String> mOrder;
    private HashMap<String, CalisthenicExerciseInfo> mExercises;

    public CalisthenicWorkoutGenerator(CalisthenicWorkoutController info) {
        mController = info;
        mExercises = info.getStorage().getExercises();
        mOrder = info.getStorage().getOrder();
    }

    public Workout generate() {
        return new BaseExerciseWorkout(mController, generateExercises()) ;
    }

    private ArrayList<Exercise> generateExercises() {

        ArrayList<Exercise> exercises = new ArrayList<>() ;
        ArrayList<Queue<Exercise>> sets = new ArrayList<>();

        for (String type : mOrder) {
            sets.add(mExercises.get(type).generateUniqueSets());
        }

        while (!sets.isEmpty()) {

            ArrayList<Integer> empty = new ArrayList<>() ;

            /* add exercise from each set */
            for (int i = 0 ; i < sets.size() ; i++) {
                Queue<Exercise> set = sets.get(i) ;
                if (!set.isEmpty()) {
                    exercises.add(set.remove());
                } else {
                    empty.add(i) ;
                }
            }

            Collections.reverse(empty) ;
            /* remove empty sets */
            for (int i = 0 ; i < empty.size() ; i++) {
                sets.remove(empty.get(i).intValue()) ;
            }
        }

        return exercises ;
    }

}
