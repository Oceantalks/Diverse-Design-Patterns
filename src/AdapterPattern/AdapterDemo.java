package AdapterPattern;

/**
 * Created by Ado on 2018-01-09.
 */
public class AdapterDemo {

    public static void main(String[] args) {

        String name = "adonai";

        EnemyTank tank = new EnemyTank();
        EnemyRobotAdaptee robotAdaptee = new EnemyRobotAdaptee();

        EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(robotAdaptee);

        System.out.println("Enemy Tank");

        tank.fireWeapon();
        tank.assignDriver(name);
        tank.driveForward();

        System.out.println("Robot Adaptee");

        robotAdaptee.smash();
        robotAdaptee.humanAlert(name);
        robotAdaptee.walkForward();

        System.out.println("Robot Adapter");

        robotAdapter.fireWeapon();
        robotAdapter.assignDriver(name);
        robotAdapter.driveForward();

    }

}
