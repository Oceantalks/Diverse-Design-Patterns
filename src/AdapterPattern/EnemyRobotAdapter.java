package AdapterPattern;

/**
 * Created by Ado on 2018-01-09.
 */
public class EnemyRobotAdapter implements EnemeyAttacker{

    EnemyRobotAdaptee adaptee;

    public EnemyRobotAdapter(EnemyRobotAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void fireWeapon() {
        adaptee.smash();
    }

    @Override
    public void driveForward() {
        adaptee.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        adaptee.humanAlert(driverName);
    }
}
