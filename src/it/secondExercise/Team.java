package it.secondExercise;

public class Team {

    public String teamName;
    public Programmer p1 = new Programmer();
    public Programmer p2 = new Programmer();

    public void printTeamDetails(){
        System.out.println(teamName);
        System.out.println(p1.name + p1.yearsOfExperience + p1.programmingLanguage);
        System.out.println(p2.name + p2.yearsOfExperience + p2.programmingLanguage);
    }




}
