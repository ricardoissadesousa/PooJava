package introducaoPoo.Enumeracoes_Composicao;

import introducaoPoo.entities.Enum.OrderStatus;
import introducaoPoo.entities.Order;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

      Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println("Order ID: " + order);

             OrderStatus os1 = OrderStatus.DELIVERED;
             OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);


    }
}
