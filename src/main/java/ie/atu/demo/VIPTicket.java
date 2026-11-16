package ie.atu.demo;

public class VIPTicket extends Ticket{


    public VIPTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);
    }

    @Override
    public double calculatePrice(){
        double price=super.calculatePrice();
        return price+25;
    }

    public void getBenefit(){
        System.out.println("Priority entry and reserved seating");
    }
}
