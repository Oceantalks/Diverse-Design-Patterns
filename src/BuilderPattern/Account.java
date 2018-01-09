package BuilderPattern;

/**
 * Created by Ado on 2018-01-08.
 */
public class Account implements AccountInterface{

    private String accountFirstName;
    private String accountLastName;
    private Double accountBalance;
    private Integer aAccountNumber;
    private String accountEmail;
    private Integer accountPhone;

    @Override
    public void firstName(String firstName) {
        accountFirstName = firstName;
    }

    public String getAccountFirstName() {
        return accountFirstName;
    }

    @Override
    public void lastName(String lastName) {
        accountLastName = lastName;
    }

    public String getAccountLastName() {
        return accountLastName;
    }

    @Override
    public void balance(Double balance) {
        accountBalance = balance;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public void accountNumber(Integer accountNumber) {
        aAccountNumber = accountNumber;
    }

    public Integer getaAccountNumber() {
        return aAccountNumber;
    }

    @Override
    public void email(String email) {
        accountEmail = email;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    @Override
    public void phone(Integer phone) {
        accountPhone = phone;
    }

    public Integer getAccountPhone() {
        return accountPhone;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountFirstName='" + accountFirstName + '\'' +
                ", accountLastName='" + accountLastName + '\'' +
                ", accountBalance=" + accountBalance +
                ", aAccountNumber=" + aAccountNumber +
                ", accountEmail='" + accountEmail + '\'' +
                ", accountPhone=" + accountPhone +
                '}';
    }
}
