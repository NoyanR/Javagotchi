/**
 * Created by k1764201 on 30/10/17.
 */

import java.util.Scanner;

public class Game {

    Creature creature;
    Scanner input = new Scanner(System.in);
    boolean userQuits = false;

    public void run(){

        startTutorial();
        while(!userQuits){
            interact();
            System.out.println(this.creature.checkStatus());
        }
    }

    private void startTutorial(){
        System.out.println("Hi there! Welcome to javagotchi.");
        System.out.println("What's the name of you creature?");

        String name = input.nextLine();

        this.creature = new Creature(name);

        System.out.println("Great, you can now meet "+this.creature.getName()+"!");
    }

    private void interact(){
        System.out.println("What would you like to do?");
        System.out.println("1. Play");
        System.out.println("2. Eat");
        System.out.println("3. Sleep");
        System.out.println("4. Quit");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                creature.play();
                break;
            case 2:
                creature.eat();
                break;
            case 3:
                creature.sleep();
                break;
            case 4:
                userQuits=true;
                break;
            default:
                System.out.println("Whoops, you have to pick a number between 1 and 4");
                break;
        }
    }

}
