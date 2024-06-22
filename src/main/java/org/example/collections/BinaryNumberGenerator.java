package org.example.collections;



import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryNumberGenerator {
    //write logic to find binary number from 1 to given input
    public String findBinaryNumbersSequence(int input) {

        if (input < 1)
            return "Give proper input not zero or negative";
        else if (input >= 1 && input <= 20) {
            StringBuilder result = new StringBuilder();
            // create an empty Queue and push 1 to it
            Queue<String> queue = new ArrayDeque<>();
            queue.add("1");

            // run n times
            int index = 1;
            while (index++ <= input) {
                // append 0 and 1 to the front element of the queue and
                // enqueue both Strings
                queue.add(queue.peek() + "0");
                queue.add(queue.peek() + "1");

                // pop the front element and print it
                result.append(queue.poll() + " ");
            }
            //removing the last empty space
            return result.toString().substring(0, result.toString().length() - 1);
        } else
            return "Give proper input not greater than 20";
    }
}
