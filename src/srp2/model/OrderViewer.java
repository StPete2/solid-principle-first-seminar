package srp2.model;

import java.util.Scanner;

public class OrderViewer {

    public Order inputFromConsole(){
//        String clientName = prompt("Client name: ");
//        String product = prompt("Product: ");
//        int quantity = Integer.parseInt(prompt("Quantity: "));
//        int price = Integer.parseInt(prompt("Price: "));
        return new Order(prompt("Client name: "),prompt("Product: "),Integer.parseInt(prompt("Quantity: ")),Integer.parseInt(prompt("Price: ")));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
