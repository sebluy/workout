package workout.calisthenic;

import workout.Exercise;

import java.util.*;

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

    public Queue<Exercise> generateUniqueSets() {
        Queue<Exercise> exercises = new LinkedList<>() ;
        Stack<String> pool = new Stack<>() ;
        while (exercises.size() < mSets) {
            if (pool.isEmpty()) {
                pool.addAll(mVariations);
                Collections.shuffle(pool);
            }
            exercises.add(new CalisthenicExercise(pool.pop(), mRepetitions)) ;
        }
        return exercises ;
    }
}
