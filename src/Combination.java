import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Combination  {
   private List<String> combos = new ArrayList<>();
    Point points = new Point(0);

    public Combination()
    {
        combos.add("ones");
        combos.add("twos");
        combos.add("threes");
        combos.add("fours");
        combos.add("fives");
        combos.add("sixes");
        combos.add("one par");
        combos.add("two pars");
        combos.add("3 like");
        combos.add("4 likes");
        combos.add("little straight");
        combos.add("big straight");
        combos.add("house");
        combos.add("chance");
        combos.add("YATZY");

    }


public void CheckCombo(List<Integer> rolledEyes)
{
    Scanner scan = new Scanner(System.in);

    System.out.print("Available combo eyes ");

    for (Integer num: rolledEyes)
    {
     System.out.print(num);
    }
    int comobNum = 1;
    for (String text: combos)
    {
        System.out.println(comobNum + ". " + text + " ");
        comobNum++;
    }
    int comboChoise = scan.nextInt();
    int pointsToAdd = 0;
        switch (comboChoise)
        {
            //region 1-6
            case 1:
                for (Integer num: rolledEyes)
                {
                    if (num == 1)
                    {
                        pointsToAdd = pointsToAdd + 1;
                    }
                }
                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());
                break;

            case 2:
                for (Integer num: rolledEyes)
                {
                    if (num == 2)
                    {
                        pointsToAdd = pointsToAdd + 2;
                    }
                }
                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());
                break;

            case 3:
                for (Integer num: rolledEyes)
                {
                    if (num == 3)
                    {
                        pointsToAdd = pointsToAdd + 3;
                    }
                }
                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());
                break;

            case 4:
                for (Integer num: rolledEyes)
                {
                    if (num == 4)
                    {
                        pointsToAdd = pointsToAdd + 4;
                    }
                }
                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());
                break;
            case 5:
                for (Integer num: rolledEyes)
                {
                    if (num == 5)
                    {
                        pointsToAdd = pointsToAdd + 5;
                    }
                }
                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());
                break;
            case 6:
                for (Integer num: rolledEyes)
                {
                    if (num == 6)
                    {
                        pointsToAdd = pointsToAdd + 6;
                    }
                }
                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());
                break;
            //endregion

            //region Pairs and kinds
            //            Pair
            case 7:
                    for (int i = 0; i < rolledEyes.size(); i++)
                    {
                        for (int j = i + 1; j  < rolledEyes.size(); j++)
                        {
                            if (rolledEyes.get(i) == rolledEyes.get(j)) {
                               pointsToAdd = rolledEyes.get(i) + rolledEyes.get(j);
                            }
                        }
                    }
                points.setPoints(pointsToAdd);
                System.out.print(pointsToAdd);
                break;
//                2 paris
            case 8:
                int firstPair = 0;
                    for (int i = 0; i < rolledEyes.size(); i++)
                    {
                        for (int j = i + 1; j < rolledEyes.size(); j++)
                        {
                            if (rolledEyes.get(i) == rolledEyes.get(j))
                            {
                                 firstPair = rolledEyes.get(i) + rolledEyes.get(j);
                                rolledEyes.remove(i);
                                 break;

                            }
                        }
                    }
                for (int k = 0; k < rolledEyes.size(); k++)
                {
                    for (int l = k + 1; l < rolledEyes.size(); l++)
                    {
                        if (rolledEyes.get(k) == rolledEyes.get(l))
                        {
                            pointsToAdd = firstPair + rolledEyes.get(k) + rolledEyes.get(l);
                        }
                    }
                }

                points.setPoints(pointsToAdd);
                System.out.print(pointsToAdd);
                break;
//                3 of a kind
            case 9:

                for (int i = 0; i < rolledEyes.size(); i++)
                {
                    for (int j = i + 1; j < rolledEyes.size(); j++)
                    {
                        for (int k = j + 1; k < rolledEyes.size(); k++)
                        {
                            if (rolledEyes.get(i).equals(rolledEyes.get(j)) && rolledEyes.get(j).equals(rolledEyes.get(k))) {
                                pointsToAdd = rolledEyes.get(i) + rolledEyes.get(j) + rolledEyes.get(k);
                            }
                        }
                    }
                }



                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());
                break;
//                4 of a kind
            case 10:

                for (int i = 0; i < rolledEyes.size(); i++)
                {
                    for (int j = i + 1; j < rolledEyes.size(); j++)
                    {
                        for (int k = j + 1; k < rolledEyes.size(); k++)
                        {
                            for (int l = k + 1; l < rolledEyes.size(); l++) {

                                if (rolledEyes.get(i).equals(rolledEyes.get(j)) && rolledEyes.get(j).equals(rolledEyes.get(k)) && rolledEyes.get(k).equals(rolledEyes.get(l))) {
                                    pointsToAdd = rolledEyes.get(i) + rolledEyes.get(j) + rolledEyes.get(k) + rolledEyes.get(l);
                                }
                            }

                        }
                    }
                }
                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());
                break;
            //endregion

            //region Straight to Yatzy
            //                small straight
            case 11:
                for (int i = 0; i < rolledEyes.size(); i++) {
                    if (rolledEyes.contains(1) && rolledEyes.contains(2) && rolledEyes.contains(3) && rolledEyes.contains(4) && rolledEyes.contains(5)){
                        pointsToAdd = pointsToAdd + rolledEyes.get(i);
                    }
                }
                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());
                break;
//                big straight
            case 12:
                for (int i = 0; i < rolledEyes.size(); i++) {
                    if (rolledEyes.contains(2) && rolledEyes.contains(3) && rolledEyes.contains(4) && rolledEyes.contains(5) && rolledEyes.contains(6)){
                        pointsToAdd = pointsToAdd + rolledEyes.get(i);
                    }
                }
                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());
                break;
//                full house
            case 13:
                int firstPair2 = 0;
                for (int i = 0; i < rolledEyes.size(); i++)
                {
                    for (int j = i + 1; j < rolledEyes.size(); j++)
                    {
                        if (rolledEyes.get(i) == rolledEyes.get(j))
                        {
                            firstPair2 = rolledEyes.get(i) + rolledEyes.get(j);


                        }
                    }
                }
                for (int k = 0; k < rolledEyes.size(); k++)
                {
                    for (int l = k + 1; l < rolledEyes.size(); l++)
                    {
                        for (int m = l + 1; m < rolledEyes.size(); m++) {

                            if (rolledEyes.get(k) == rolledEyes.get(l) && rolledEyes.get(l) == rolledEyes.get(m))
                            {
                                pointsToAdd = firstPair2 + rolledEyes.get(k) + rolledEyes.get(l) + rolledEyes.get(m);
                            }
                        }

                    }
                }
                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());
                break;
//                chance
            case 14:
                for (Integer num: rolledEyes)
                {
                    pointsToAdd = pointsToAdd + num;
                }
                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());
                break;
//                Yatzy
            case 15:
                for (Integer num: rolledEyes) {
                    if (num.equals(rolledEyes.get(0))){
                        pointsToAdd += num;
                    }

                }
                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());

                break;
            //endregion

        }

}
private void SortAvailable(List<Integer> available)
{

}
private void ChooseCombo(){

}

}
