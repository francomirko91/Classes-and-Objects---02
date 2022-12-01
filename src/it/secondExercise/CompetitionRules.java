package it.secondExercise;

public class CompetitionRules {

    private static CompetitionRules competitionRules = new CompetitionRules();

    private CompetitionRules() {
    }

    private static String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private static String competitionRule2 = "Learn every day!";
    private static String competitionRule3 = "Be the best team!";

    public static void  printRules(){
        System.out.println(competitionRule1);
        System.out.println(competitionRule2);
        System.out.println(competitionRule3);
    }


    public static CompetitionRules getInstance() {
        return competitionRules;
    }

}
