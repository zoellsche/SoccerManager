public class Game {

    private static final int MAXPLAYTIME = 90;
    protected int currentPlayTime = 0;

    private Team team1;
    private Team team2;

    public Game(Team team1, Team team2){
        this.team1 = team1;
        this.team2 = team2;
    }

    public int[] gameStart(){
        while (currentPlayTime <= MAXPLAYTIME) {
            int timeUntilNextGoalChance = GetRandomNum.getNumber(1, 15);
                currentPlayTime += timeUntilNextGoalChance;
                Team teamWithGoalChance = this.whichTeamHasGoalChance();
                Player playerWithGoalChance = this.whichPlayerHasGoalChance(teamWithGoalChance);
                if (this.willMakeGoal(playerWithGoalChance)) {
                    playerWithGoalChance.addOneGoalToPlayer();
            }
        }
        int goalsTeam1 = team1.getAllTeamGoals();
        int goalsTeam2 = team2.getAllTeamGoals();
        return new int[]{goalsTeam1, goalsTeam2};
    }


    public Team whichTeamHasGoalChance(){
        //todo
        return this.team1;
    }

    public Player whichPlayerHasGoalChance(Team team) {
        //todo
        return team.getRandomPlayer();
    }

    public Goalkeeper getOpposingGoalkeeper(){
         return null;
    }

    public boolean willMakeGoal(Player player){
        //todo
        return true;
    }

}
