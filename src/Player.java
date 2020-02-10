import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
//    Class instantiating
    DiceFactory diceFac = new DiceFactory();
    Combination combination = new Combination();
    Point points = new Point(0);
//    Variables
    private int rerollCount;
    List<Dice> dices = new ArrayList<>();
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
    private void RollDice()
    {
        Random rnd = new Random();
        for (Dice dice: dices)
        {
            int num = rnd.nextInt(1 - dice.eyes.size());
            reserveDice.add(dice.eyes.get(num));
        }
    }
    private void AddToReserve(Dice dice)
    {
        reserveDice.add(dice);
    }
}
