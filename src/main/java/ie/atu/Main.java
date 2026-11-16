package ie.atu;

import ie.atu.demo.EarlyBirdTicket;
import ie.atu.demo.StudentTicket;
import ie.atu.demo.Ticket;
import ie.atu.demo.VIPTicket;
import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Ticket Standard= new Ticket("Summer concert", "Alice", 50);
        StudentTicket Student= new StudentTicket("Summer concert", "Bob", 50, "102303");
        VIPTicket VIP= new VIPTicket("Summer concert", "Charlie", 50);
        EarlyBirdTicket one= new EarlyBirdTicket("Summer concert", "Leo", 50);
        EarlyBirdTicket two= new EarlyBirdTicket("Summer concert", "David", 7);

        System.out.println("Event: "+ Standard.getEventName()+"\nStandard Ticket\t- "+Standard.getHolderName()+":\t"+Standard.calculatePrice());
        System.out.println("\nStudent Ticket\t- "+ Student.getHolderName()+":\t"+Student.calculatePrice());
        System.out.println("\nVIP Ticket\t- "+ VIP.getHolderName()+":\t"+VIP.calculatePrice());
        System.out.println("Student Id: "+ Student.getStudentid());
        System.out.println("Benefits: ");
        VIP.getBenefit();

        System.out.println("\nEvent: "+ one.getEventName()+"\nEarly Ticket\t- "+one.getHolderName()+":\t"+one.calculatePrice());
        System.out.println("\nEvent: "+ two.getEventName()+"\nEarly Ticket\t- "+two.getHolderName()+":\t"+two.calculatePrice());
    }
}