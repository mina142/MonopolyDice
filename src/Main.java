import java.util.Random;

public class Main {

    public static void main(String[] args){
        Random r = new Random();
        int x = 1 + r.nextInt(6);
        int y = 1 + r.nextInt(6);
        int sum = x + y;
        int roll = 0;

        while (roll < 3) {

            if (x != y) {
                sum = x + y;
                System.out.println("My random numbers are " + x + " and " + y);
                System.out.println("Move " + sum + " Spaces");
                break;
            } else if (x == y) {
                roll = roll + 1;
                sum = x + y;
                if(roll==3) {
                    System.out.println("My random numbers are " + x + " and " + y);
                    System.out.println("GO TO JAIL .....");
                } else {
                    System.out.println("My random numbers are " + x + " and " + y);
                    System.out.println("Move " + sum + " Spaces and roll again getting");
                    x = 1 + r.nextInt(6);
                    y = 1 + r.nextInt(6);
                }

        }


        }

    }
}
