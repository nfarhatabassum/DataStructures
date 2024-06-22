package org.example.collections;

import java.util.*;

public class DequueImpl {
    public static void main(String[] args) {
        Deque<String> customerNames = new ArrayDeque<>();
        customerNames.add("James");
        customerNames.add("Anne");
        customerNames.add("Smith");
        customerNames.add("John");
        customerNames.addFirst("Dave");
        customerNames.addLast("Mario");

        System.out.println("First Element "+customerNames.peekFirst());
        customerNames.pollLast();
        Iterator<String> itrFwd = customerNames.iterator();
        while(itrFwd.hasNext()){
            System.out.println(itrFwd.next());
        }
        System.out.println("Reverse Direction");
        Iterator<String> itrRev = customerNames.descendingIterator();
        while(itrRev.hasNext()){
            System.out.println(itrRev.next());
        }

        System.out.println("****************User Defined Objects***********");
        Deque<Customer> customers = new LinkedList<>();
        customers.add(new Customer(101,"Anne","Anne@gmail.com"));
        customers.add(new Customer(102,"James","James@gmail.com"));
        customers.add(new Customer(103,"Smith","Smith@gmail.com"));
        customers.add(new Customer(104,"Mario","Mario@gmail.com"));
        customers.offerFirst(new Customer(105,"Mani","Mani@gmail.com"));
//        for(Customer c : customers){
//
//            System.out.println(c);
//        }
        Iterator<Customer> customerIterator = customers.iterator();
        while(customerIterator.hasNext()){
            Customer customer = customerIterator.next();
            if(customer.getCustomerName().startsWith("M")){
                customerIterator.remove();
            }else {
                System.out.println(customer);
            }
        }
    }
}
