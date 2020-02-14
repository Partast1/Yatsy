import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player
{
//    Class instantiating
    DiceFactory diceFac = new DiceFactory();
    Combination combination = new Combination();
//    PlayerMessage playerMes = new PlayerMessage();


//    Variables
    private int rerollCount = 0;
    List<Dice> dices = new ArrayList<>();
    List<Dice> reserveDice = new ArrayList<>();
    List<Integer> rolledEyes = new ArrayList<>();
    List<Integer> reserveEye = new ArrayList<>();

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
            num = num + 1;
            rolledEyes.add(num);
        }
        DisplayrolledEyes();
    }
    int diceCount = 1;
//    Show rolled dices playerMessage
    public void DisplayrolledEyes()
    {
        for (Integer num : rolledEyes)
        {
            System.out.print(diceCount + ". " + num + " /");
            diceCount++;
        }
        diceCount = 1;

    }

    //    Adds wanted dices to the reserve
    public void AddToReserve()
    {
        boolean reserveBool = true;
      int unReserve = 7;
      int stopReserve = 8;
        System.out.print("Choose dices to reserve /  8 for reroll / 9 to stop");
        while (reserveBool)
        {
            if (rerollCount < 7)
            {
                Scanner scan = new Scanner(System.in);
                int diceSelector = scan.nextInt();
                diceSelector = diceSelector - 1;

                if (diceSelector <= dices.size()) {
                    Dice dice = dices.get(diceSelector);
                    reserveDice.add(dice);
                    int resEye = rolledEyes.get(diceSelector);
                    dices.remove(diceSelector);
                    reserveEye.add(resEye);
                    rolledEyes.remove(diceSelector);

                    DisplayrolledEyes();
//                    playerMessage
                    System.out.print("Current reserve ");
                    for (Integer num : reserveEye) {
                        System.out.print(num + " ");
                    }
                }
               else if(diceSelector == unReserve)
               {
                   rolledEyes.clear();
                   RollDice();
                   rerollCount++;
               }
                else if(diceSelector == stopReserve)
                {
                    for (Integer num: rolledEyes)
                    {
                     reserveEye.add(num);
                    }
                    combination.CheckCombo(reserveEye);
                    reserveBool = false;

                }
                else {
//                    playerMessage
                    System.out.print("Wrong input");
                    reserveBool = false;
                }
            }
                    else
                        {
                            System.out.print("You have used all reserves attempts");
                            reserveBool = false;
                        }
        }
        combination.CheckCombo(reserveEye);
    }
}