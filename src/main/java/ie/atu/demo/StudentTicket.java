package ie.atu.demo;

public class StudentTicket extends Ticket {
    private String Studentid;

    public StudentTicket(String eventName, String holderName, double basePrice, String studentid) {
        super(eventName, holderName, basePrice);
        this.Studentid = studentid;
    }

    public String getStudentid() {
        return Studentid;
    }

    @Override
    public double calculatePrice() {
        double price=super.calculatePrice();
        return price*.8;
    }
}
