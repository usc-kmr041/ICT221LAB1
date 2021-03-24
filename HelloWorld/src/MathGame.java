/*
 * This is a simple math game for grades 3-5.
 *
 * @Kevin Chester Rovillos
 * 1131397
 */


import java.util.Random;
import java.util.Scanner;

/* Task 2 1st part *
public class MathGame {
    public static void main(String[] args) {
        int i = 1;
            while (i < 10){
            System.out.println("What is 4 + "+i+"?");
            i++;
    }
}}
*/

/* Task 2 random 1-12 **
public class MathGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = 1;
        while (i < 10){
            int x = rand.nextInt(11)+1;
            System.out.println("What is 4 + "+x+"?");
            i++;
        }
    }}
*/

/*
 * Task 2.1  *

public class MathGame {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 1; i < 10; i++){
            int x = rand.nextInt(11) + 1;
            int y = rand.nextInt(11) + 1;
            System.out.printf("What is "+y+" + " + x + "?%n");
        }
    }}
    */

/*
 * Task 3 *
 */

public class MathGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        for (int i = 1; i < 10; i++){
            int x = rand.nextInt(11) + 1;
            int y = rand.nextInt(11) + 1;
            System.out.printf("What is "+y+" + " + x + "?%n");
            int response = input.nextInt();
            int correct = x + y;
            if(response == correct) {
            System.out.println("CORRECT!");
            } else if(response != correct){
                System.out.println("Wrong");
            }
        }

    }}
