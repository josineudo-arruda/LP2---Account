package InOutPutData;

public class accountRecord {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    public accountRecord() {
        this(0,"","",0.0);
    }

    public accountRecord(int acct, String first, String last, double bal) {
        setAccount(acct);
        setFirstName(first);
        setLastName(last);
        setBalance(bal);
    }

    public void setAccount(int acct) {
        this.account = acct;
    }

    public int getAccount() {
        return this.account;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }

    public double getBalance() {
        return this.balance;
    }
}
