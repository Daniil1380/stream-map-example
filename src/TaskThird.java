import java.util.ArrayList;
import java.util.List;

public class TaskThird {

    public static void main(String[] args) {

        //узнать общий вес посылок у всех курьеров (выполненных и невыполненных)

        Delivery delivery1 = new Delivery(45.3);
        Delivery delivery2 = new Delivery(5.3);
        Delivery delivery3 = new Delivery(2.1);
        Delivery delivery4 = new Delivery(78.4);
        Delivery delivery5 = new Delivery(98.4);
        Delivery delivery6 = new Delivery(23.4);
        Delivery delivery7 = new Delivery(89.0);

        Courier courier = new Courier("Даниил", List.of(delivery1, delivery2), List.of(delivery3));
        Courier secondCourier = new Courier("Иван", List.of(delivery4), List.of(delivery5, delivery6, delivery7));

        List<Courier> couriers = new ArrayList<>();
        couriers.add(courier);
        couriers.add(secondCourier);

        couriers.stream()



    }
}
