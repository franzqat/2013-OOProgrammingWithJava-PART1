
import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        // First goal
        System.out.println("Top ten by goals:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        // Second goal
        System.out.println("Top 25 on penalty amounts:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        //Third goal
        System.out.println("Sydney Crosby:");
        NHLStatistics.searchByPlayer("Crosby");
        //Fourth goal
        System.out.println("Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        //Fifth Goal
        System.out.println("Anaheim Ducks (abbreviation: ANA): ");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");




    }
}
