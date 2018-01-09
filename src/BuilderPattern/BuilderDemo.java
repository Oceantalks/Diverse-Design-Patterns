package BuilderPattern;

/**
 * Created by Ado on 2018-01-08.
 */
public class BuilderDemo {

    private static BuildAccount buildAccount = new BuildAccount();

    public static void main(String[] args) {

        AccountDirector accountBuilder = new AccountDirector(buildAccount);
        System.out.println(accountBuilder.getAccount());
    }

}
