package ie.atu.demo;

public class EarlyBirdTicket extends Ticket{

    public EarlyBirdTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);
    }

    @Override
    public double calculatePrice(){
        double price=super.calculatePrice();
        price-=10;
        if(price<=0){
            price=0;
        }
        return price;
    }
}
