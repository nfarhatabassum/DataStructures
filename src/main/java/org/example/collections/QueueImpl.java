package org.example.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {
    Queue<String> restaurants;
    QueueImpl(){
        restaurants = new PriorityQueue<>();
        restaurants.add("Chung Wah");
        restaurants.add("Meghnas");
        restaurants.add("Nandhini");
    }
    public static void main(String[] args) {
        QueueImpl obj = new QueueImpl();
        obj.addRestaurant("Yum Yum");
        obj.displayRestaurantDetails();

    }
    public void addRestaurant(String input){
        if(restaurants.offer(input)){
            System.out.println("Object Added");
        }
    }
    public void displayRestaurantDetails(){
//        Iterator<String> inputs = restaurants.iterator();
//        while(inputs.hasNext()){
//            System.out.println(inputs.next());
//        }
        while(restaurants.element()!=null){
            System.out.println(restaurants.poll());
        }
    }
}
