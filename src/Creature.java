/**
 * Created by k1764201 on 30/10/17.
 */
public class Creature {
    int energy,fullness,happiness;
    String name;

    public Creature(String name){
        energy=15;
        fullness=15;
        happiness=15;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        if (fullness>=12){
            System.out.println("Whoops, "+this.getName()+" is already full");
        }else {
            fullness += 8;
            happiness-=6;
            energy-=6;
        }
        if(fullness>15){fullness=15;}
        System.out.println("That was a good name!");

    }

    public void sleep(){
        if (energy>=12){
            System.out.println("Whoops, "+this.getName()+" is not that sleepy");
        }else {
            energy += 8;
            happiness-=5;
            fullness-=5;
            System.out.println("That was a good nap!");
        }
        if(energy>15){energy=15;}

    }

    public void play(){
         happiness += 8;
         fullness-=6;
         energy-=4;
        if(happiness>15){happiness=15;}
        System.out.println("That was fun!");
    }

    public String checkStatus(){
        String status = "";

        if (happiness <= 6){
            status += "oh. " + this.getName() + " is feeling sad!\n";
        }

        if (energy <= 6){
            status += "oh. " + this.getName() + " is feeling tired!\n";
        }

        if (fullness <= 6){
            status += "oh. " + this.getName() + " is feeling super hungry!\n";
        }

        return status;
    }


}
