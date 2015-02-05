package workout.run;

import java.util.ArrayList;

/**
 * Created by sebluy on 1/18/15.
 */
public interface RunWorkoutStorage {

    CHIRunWorkoutInfo getCHIInfo() ;

    LSDRunWorkoutInfo getLSDInfo() ;

    INTRunWorkoutInfo getINTInfo() ;

    ArrayList<String> getOrder() ;

}

