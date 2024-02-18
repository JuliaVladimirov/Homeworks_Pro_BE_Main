package org.example.restaurant;

import org.example.bank.Ticket;

import java.util.LinkedHashSet;
import java.util.TreeSet;

//        2)* В ресторане официанты подают заказы Order на кухню. Очень важно чтобы заказы брались в работу поварами строго в том порядке,
//        в котором они были переданы на кухню. Создайте множество (Set) заказов, которые будут передаваться на кухню официантом и реализуйте
//        механизм взятия в работу этих заказом поваром.
//        Используйте LinkedHashSet для решения этой задачи.
//        Характеристики Order определите самостоятельно.
//
//
public class Restaurant {
    public static void main(String[] args) {

        Order order1 = new Order(1, PizzaNames.PEPPERONI_PIZZA);
        Order order2 = new Order(2, PizzaNames.GREEK_PIZZA);
        Order order3 = new Order(3, PizzaNames.FOUR_CHEESE_PIZZA);
        Order order4 = new Order(4, PizzaNames.HAWAIIAN_PIZZA);
        Order order5 = new Order(5, PizzaNames.NEAPOLITAN_PIZZA);
        Order order6 = new Order(6, PizzaNames.PIZZA_CARBONARA);
        Order order7 = new Order(7, PizzaNames.PIZZA_DIAVOLA);
        Order order8 = new Order(8, PizzaNames.PIZZA_MARGHERITA);
        Order order9 = new Order(9, PizzaNames.SICILIAN_PIZZA);
        Order order10 = new Order(10, PizzaNames.PIZZA_FRUTTI_DI_MARE);
        Order order11 = new Order(11, PizzaNames.PIZZA_CARBONARA);
        Order order12 = new Order(12, PizzaNames.FOUR_CHEESE_PIZZA);

        LinkedHashSet<Order> orderList = new LinkedHashSet<>();
        orderList.add(order12);
        orderList.add(order11);
        orderList.add(order10);
        orderList.add(order9);
        orderList.add(order8);
        orderList.add(order7);
        orderList.add(order6);
        orderList.add(order5);
        orderList.add(order4);
        orderList.add(order3);
        orderList.add(order2);
        orderList.add(order1);
        System.out.println(orderList);
        System.out.println();

        operateOrders(orderList);
        System.out.println(orderList);

    }

    public static void operateOrders(LinkedHashSet<Order> orderList) {
        LinkedHashSet<Order> orderList1 = new LinkedHashSet<>();
        for (Order order : orderList) {
            cookPizza(order);
            orderList1.add(order);
        }
        orderList.removeAll(orderList1);
        orderList1.clear();
    }

    public static void cookPizza (Order order){
        switch (order.getPizzaNames()){
            case GREEK_PIZZA -> System.out.println("Order # " + order.getOrderNumber() + ". The chef cooks " + order.getPizzaNames());
            case PIZZA_DIAVOLA -> System.out.println("Order # " + order.getOrderNumber() + ". The chef cooks " + order.getPizzaNames());
            case HAWAIIAN_PIZZA -> System.out.println("Order # " + order.getOrderNumber() + ". The chef cooks " + order.getPizzaNames());
            case SICILIAN_PIZZA -> System.out.println("Order # " + order.getOrderNumber() + ". The chef cooks " + order.getPizzaNames());
            case PEPPERONI_PIZZA -> System.out.println("Order # " + order.getOrderNumber() + ". The chef cooks " + order.getPizzaNames());
            case PIZZA_CARBONARA -> System.out.println("Order # " + order.getOrderNumber() + ". The chef cooks " + order.getPizzaNames());
            case NEAPOLITAN_PIZZA -> System.out.println("Order # " + order.getOrderNumber() + ". The chef cooks " + order.getPizzaNames());
            case PIZZA_MARGHERITA -> System.out.println("Order # " + order.getOrderNumber() + ". The chef cooks " + order.getPizzaNames());
            case FOUR_CHEESE_PIZZA -> System.out.println("Order # " + order.getOrderNumber() + ". The chef cooks " + order.getPizzaNames());
            case PIZZA_FRUTTI_DI_MARE -> System.out.println("Order # " + order.getOrderNumber() + ". The chef cooks " + order.getPizzaNames());
        }
    }
}
