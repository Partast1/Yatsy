import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {
//    Class instantiating
    DiceFactory diceFac = new DiceFactory();
    Combination combination = new Combination();
    Point points = new Point(0);

//    Variables
    private int rerollCount;
    List<Dice> dices = new ArrayList<>();
    List<Integer> rolledDices = new ArrayList<>();
    List<Dice> reserveDice = new ArrayList<>();

//    Getters & Setters
    public int getRerollCount()
    {
        return rerollCount;
    }

    public void setRerollCount(int rerollCount)
    {
        this.rerollCount = rerollCount;
    }

//    Constructor
    public Player(){
        for (int i = 0; i < 5; i++)
        {
            dices.add(diceFac.ProduceDice());
        }
    }

//    Rolls all players dices
    public void RollDice()
    {
        Random rnd = new Random();
        for (Dice dice: dices)
        {
            int num = rnd.nextInt( dice.eyes.size());
            rolledDices.add(dice.eyes.get(num));
        }

    }
//    Show rolled dices
    public void DisplayRolledDices()
    {
        int diceCount = 1;
        System.out.print("Select dices to add to reserve. \n");
        for (Integer num : rolledDices)
        {
            System.out.print(diceCount + ". " + num + " /");
            diceCount++;
        }
    }

    //    Adds wanted dices to the reserve
    public void AddToReserve()
    {
        boolean addingToReserve = true;
        Scanner scan = new Scanner(System.in);
//      HER STARTER VI.
       while (addingToReserve){
           for (){

           }

       }

    }
}
