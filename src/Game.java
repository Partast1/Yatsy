public class Game {

public void StartGame(){
    Player player = new Player();
    Player computer = new Player();
boolean gameOnGoing = true;
    while (gameOnGoing){
        player.RollDice();
        player.AddToReserve();

        computer.RollDice();
        computer.AddToReserve();
    }

}

}
