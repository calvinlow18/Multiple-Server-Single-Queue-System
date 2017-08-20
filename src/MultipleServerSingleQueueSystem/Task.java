/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleServerSingleQueueSystem;

import com.sun.glass.events.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Calvin Low
 */
public class Task {
    
    public static List<Integer> arrival;
    public static Server[] server = new Server[5];
    public static int[] counter = {0, 0, 0};
    
    public static int randomNumber(int minimum, int maximum) {
        Random random = new Random();
        return random.nextInt((maximum - minimum) + 1) + minimum;
    }
    
    public static String randID() {
        String id = Character.toString((char) randomNumber(65, 90)) + Integer.toString(randomNumber(1, 999)) + Character.toString((char) randomNumber(65, 90));
        return id;
    }
    
    public static void randArrival() {
        int total = 360;
        arrival = new ArrayList<>();
        while(total>=22) {
            int arriveGap = randomNumber(2, 4);
            total -= arriveGap;
            arrival.add(total);
            //System.out.print(total + " ");
        }
    }
    
    public static boolean check(int time) {
        Iterator it = arrival.iterator();
        while(it.hasNext()) {
            if(it.next().equals(time))
                return true;
        }
        return false;
    }
    
    public static void initServer() {
        for(int i=0;i<5;i++) {
            server[i] = new Server();
        }   
    }
    
    public static Double arrivalRate() {
        return arrival.size()/6.0;
    }
    
}
