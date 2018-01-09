package BuilderPattern;

/**
 * Created by Ado on 2018-01-08.
 */
public class AccountDirector {

    private BuildAccount buildAccount;

    public AccountDirector(BuildAccount buildAccount) {
        this.buildAccount = buildAccount;
        this.buildAccount.createAccount();
    }

    public Account getAccount() {
        return this.buildAccount.getAccount();
    }



}
