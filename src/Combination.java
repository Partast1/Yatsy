import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Combination  {
    List<String> combos = new ArrayList<>();
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
            case 10:

                for (int i = 0; i < rolledEyes.size(); i++)
                {
                    for (int j = i + 1; j < rolledEyes.size(); j++)
                    {
                        for (int k = j + 1; k < rolledEyes.size(); k++)
                        {
                            for (int l = k + 1; l < rolledEyes.size(); l++) {

                                if (rolledEyes.get(i).equals(rolledEyes.get(j)) && rolledEyes.get(j).equals(rolledEyes.get(k))) {
                                    pointsToAdd = rolledEyes.get(i) + rolledEyes.get(j) + rolledEyes.get(k);
                                }
                            }

                        }
                    }
                }



                points.setPoints(pointsToAdd);
                System.out.print(points.getPoints());
                break;

        }

}
private void SortAvailable(List<Integer> available)
{

}
private void ChooseCombo(){

}

}
