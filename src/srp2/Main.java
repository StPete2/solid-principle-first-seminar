package srp2;

import srp2.model.Order;
import srp2.model.OrderSaver;
import srp2.model.OrderViewer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter order:");
//        Order order = new Order("", "", 0, 0);
        OrderViewer viewer = new OrderViewer();
        OrderSaver saver = new OrderSaver();
        Order order = viewer.inputFromConsole();
        saver.saveToJson(order);
    }
}
