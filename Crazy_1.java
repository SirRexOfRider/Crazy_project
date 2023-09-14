/*
 * Name:Crazy_1.java
 * Author:Rex
 * Date:9/13/23
 * Purpose:Go crazy
 */


public class Crazy_1 {
    public static void main(String[] args) {
        while (true) {

        //Code I found to delay code
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        
        System.out.println("Crazy?");
        System.out.println();
          try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("I was crazy once...");
        System.out.println();
          try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("They locked me in a room");
        System.out.println();
          try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("A rubber room");
        System.out.println();
          try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("A rubber room with rats");
        System.out.println();
          try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        
        System.out.println("And rats make me crazy...");
        System.out.println();

        
        
        }
    }
}
