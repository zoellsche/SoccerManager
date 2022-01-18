public class APP {

    public static void main(String[] args) {

        Team team1 = new Team("Jürgenshagen");
        Player robert = new Player("Robert");
        Player marco = new Player("Marco");
        Team team2 = new Team("Satow");
        team1.addPlayer(robert);
        team2.addPlayer(marco);

       FriendlySoccerGame game = new FriendlySoccerGame(team1, team2);
       int[] results = game.gameStart();
       System.out.println(results[0]);
       System.out.println(results[1]);

    }
}
