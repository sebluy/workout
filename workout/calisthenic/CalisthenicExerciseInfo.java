package workout.calisthenic;

import workout.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Created by sebluy on 12/22/14.
 */
public class CalisthenicExerciseInfo {

    private String mName ;
    private ArrayList<String> mVariations;
    private int mRepetitions ;
    private int mSets ;

    public CalisthenicExerciseInfo(String name, ArrayList<String> variations, int repetitions, int sets) {
        mName = name ;
        mVariations = variations ;
        mRepetitions = repetitions ;
        mSets = sets ;
    }

    public Stack<Exercise> generateUniqueSets() {
        Stack<Exercise> exercises = new Stack<>() ;
        Stack<String> pool = new Stack<>() ;
        while (exercises.size() < mSets) {
            if (pool.isEmpty()) {
                pool.addAll(mVariations) ;
                Collections.shuffle(pool);
            }
            exercises.push(new CalisthenicExercise(pool.pop(), mRepetitions)) ;
        }
        return exercises ;
    }
}
