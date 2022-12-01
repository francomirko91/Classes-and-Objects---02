package it.secondExercise;

public class Competition {

    public static void main(String[] args) {

        CompetitionRules rules = CompetitionRules.getInstance();
        CompetitionRules.printRules();

        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "Milan";
        teamB.teamName = "Napoli";

        teamA.p1.name = "Marco";
        teamA.p2.name = "Paolo";
        teamB.p1.name = "Max";
        teamB.p2.name = "Luca";

        teamA.p1.programmingLanguage = "Java";
        teamA.p2.programmingLanguage = "Ruby";
        teamB.p1.programmingLanguage = "python";
        teamB.p2.programmingLanguage = "Javascript";

        teamA.p1.yearsOfExperience = 10;
        teamA.p2.yearsOfExperience = 14;
        teamB.p2.yearsOfExperience = 5;
        teamB.p1.yearsOfExperience = 4;

        teamA.printTeamDetails();
        teamB.printTeamDetails();




    }


}
