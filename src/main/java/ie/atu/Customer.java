package ie.atu;

public class Customer extends Person {
    private int customerNum;
    private boolean mailingList;

    public Customer() {
        super();
        this.customerNum = 0;
        this.mailingList = false;
    }

    public Customer(String name, String address, String phoneNum, int customerNum, boolean mailingList) {
        super(name, address, phoneNum);
        this.customerNum = customerNum;
        this.mailingList = mailingList;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + "Customer{" +
                "customerNum=" + customerNum +
                ", mailingList=" + mailingList +
                '}';
    }
}
