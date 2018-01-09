package AdapterPattern;

import javax.swing.text.html.HTML;
import java.util.Random;

/**
 * Created by Ado on 2018-01-09.
 */
public class EnemyTank implements EnemeyAttacker{
    private static final String TAG = "EnemyTank";

    Random generator = new Random();

    @Override
    public void fireWeapon() {

        int attackDamage = generator.nextInt(10) + 1;

        System.out.println(TAG + ": Damagae " + attackDamage + " done");

    }

    @Override
    public void driveForward() {

        int distance = generator.nextInt(5) + 1;

        System.out.println(TAG + ": Distance moved " + distance + " done");

    }

    @Override
    public void assignDriver(String driverName) {

        System.out.println(TAG + ": Name of driver is " + driverName);

    }
}
