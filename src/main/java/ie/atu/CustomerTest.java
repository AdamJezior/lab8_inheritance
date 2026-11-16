package ie.atu;

public class CustomerTest {
    public static void main(String[] args) {
        Customer firstC = new Customer("Paul","1234","tuam",12345, true);
        System.out.println(firstC);

        Customer secondC = new Customer();
        secondC.setName("jhon");
        secondC.setPhoneNum("12435");
        secondC.setAddress("cork");
        secondC.setCustomerNum(124);
        secondC.setMailingList(false);
        System.out.println("");
        System.out.println(secondC);

    }
}
