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
    private int rerollCount = 0;
    List<Dice> dices = new ArrayList<>();
    List<Integer> rolledEyes = new ArrayList<>();
    List<Dice> reserveDice = new ArrayList<>();
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
    }
    int diceCount = 1;

//    Show rolled dices
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
      int unReserve = 9;
        System.out.print("Choose dices to reserve");
        while (reserveBool)
        {
            if (rerollCount < 3)
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
                    rerollCount++;
                    System.out.print("Current reserve ");
                    for (Integer num : reserveEye) {
                        System.out.print(num + " ");
                    }
                }
//               else if(diceSelector == unReserve)
////               {
////                   System.out.print("Hej");
////                   dices.addAll(reserveDice);
//////                   reserveDice.clear();
//////                   reserveEye.clear();
////               }
                else {
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





    }
}