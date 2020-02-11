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

//        System.out.print("Select dices to add to reserve. \n");
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
        boolean addingToReserve = true;


//      int unReserve = 9;
        System.out.print("Choose dices to reserve");
       while (addingToReserve)
       {
           Scanner scan = new Scanner(System.in);
           int diceSelector = scan.nextInt();
           diceSelector = diceSelector -1;

               if (diceSelector <= rolledEyes.size())
               {
                   reserveDice.add(dices.get(diceSelector));
                   dices.remove(diceSelector);
                   reserveEye.add(rolledEyes.get(diceCount));
                   rolledEyes.remove(diceSelector);
                   DisplayrolledEyes();
                    System.out.print("dices" + dices.size());
                   System.out.print("rolledeyes" + rolledEyes.size());
                   System.out.print("reserved" + reserveDice.size());
                   System.out.print("Current reserve " );
                   for (Integer num: reserveEye) {
                       System.out.print(num);

                   }

               }
//              else if(diceSelector = 9)
////               {
////                   for (Dice dice: reserveDice) {
////                       rolledEyes.add(reserveDice.get(dice.));
////                   }
////               }
           else
               {
                   System.out.print("Wrong input");
                   addingToReserve = false;
               }
       }
        for (Dice dice: reserveDice) {
            System.out.print("Eyes of added dice" + dice.eyes);
        }


    }
}

//import java.util.ArrayList;
//        import java.util.List;
//        import java.util.Random;
//        import java.util.Scanner;
//
//public class Player {
//    //    Class instantiating
//    DiceFactory diceFac = new DiceFactory();
//    Combination combination = new Combination();
//    Point points = new Point(0);
//
//    //    Variables
//    private int rerollCount;
//    List<Dice> dices = new ArrayList<>();
//    List<Integer> rolledEyes = new ArrayList<>();
//    List<Dice> reserveDice = new ArrayList<>();
//
//    //    Getters & Setters
//    public int getRerollCount()
//    {
//        return rerollCount;
//    }
//    public void setRerollCount(int rerollCount)
//    {
//        this.rerollCount = rerollCount;
//    }
//
//    //    Constructor
//    public Player(){
//        for (int i = 0; i < 5; i++)
//        {
//            dices.add(diceFac.ProduceDice());
//        }
//    }
//
//    //    Rolls all players dices
//    public void RollDice()
//    {
//        Random rnd = new Random();
//        for (Dice dice: dices)
//        {
//            int num = rnd.nextInt( dice.eyes.size());
//            rolledEyes.add(dice.eyes.get(num));
//        }
//
//    }
//
//    int diceCount = 1;
//    //    Show rolled dices
//    public void DisplayrolledEyes()
//    {
//
//        System.out.print("Select dices to add to reserve. \n");
//        for (Integer num : rolledEyes)
//        {
//            System.out.print(diceCount + ". " + num + " /");
//            diceCount++;
//        }
//    }
//
//    //    Adds wanted dices to the reserve
//    public void AddToReserve()
//    {
//        boolean addingToReserve = true;
//        Scanner scan = new Scanner(System.in);
//        int diceSelector = scan.nextInt();
////        int unReserve = 9;
////      HER STARTER VI.
//        while (addingToReserve)
//        {
//            if (diceSelector >= rolledEyes.size())
//            {
//                reserveDice.add(dices.);
//            }
////              else if(diceSelector = 9)
//////               {
//////                   for (Dice dice: reserveDice) {
//////                       rolledEyes.add(reserveDice.get(dice.));
//////                   }
//////               }
//            else
//            {
//                System.out.print("Wrong input");
//            }
//        }
//
//    }
//}

