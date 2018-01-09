package BuilderPattern;

/**
 * Created by Ado on 2018-01-08.
 */
public class BuildAccount implements BuildAccountInterface{

    private Account account;

    public BuildAccount() {
        this.account = new Account();
    }


    @Override
    public void BuildAccountFirstName() {
        account.firstName("Adonai");
    }

    @Override
    public void BuildAccountLastName() {
        account.lastName("Tesfay");
    }

    @Override
    public void BuildAccountBalance() {
        account.balance(1000000.00);
    }

    @Override
    public void BuildAccountNumber() {
        account.accountNumber(992393323);
    }

    @Override
    public void BuildAccountEmail() {
        account.email("hallo.adonai@gmail.com");
    }

    @Override
    public void BuildAccountPhone() {
        account.phone(993234234);
    }

    @Override
    public Account getAccount() {
        return this.account;
    }

    public void createAccount() {
        BuildAccountFirstName();
        BuildAccountLastName();
        BuildAccountBalance();
        BuildAccountNumber();
        BuildAccountEmail();
        BuildAccountPhone();
    }

}
