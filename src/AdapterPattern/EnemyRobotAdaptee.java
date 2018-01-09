package AdapterPattern;

import java.util.Random;

/**
 * Created by Ado on 2018-01-09.
 */
public class EnemyRobotAdaptee {
    private static final String TAG = "EnemyRobotAdaptee";

    Random generator = new Random();


    public void smash() {

        int attackDamage = generator.nextInt(5) + 1;

        System.out.println(TAG + ": Smash damage: " + attackDamage);

    }

    public void walkForward() {

        int distance = generator.nextInt(2) + 1;

        System.out.println(TAG + ": Robot moved " + distance + " units");

    }

    public void humanAlert(String humanName) {

        System.out.println(TAG + ": Engaging " + humanName);

    }

}
