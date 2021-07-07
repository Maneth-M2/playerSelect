import java.util.ArrayList;

public class PlayerSelection {
    public static void main(String[] args) {
        Player newPlayer1 = new Player("sad",14,"spin",15);
        Player newPlayer2 = new Player("fad",14,"spin",15);
        Player newPlayer3 = new Player("grd",14,"spin",15);
        Player newPlayer4 = new Player("sod",14,"spin",15);

        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(newPlayer1);
        playerList.add(newPlayer2);
        playerList.add(newPlayer3);
        playerList.add(newPlayer4);

        for(int i = 0 ;i< playerList.size(); i++) {
            System.out.println("Player Name : " + playerList.get(i).getPlayerName());
            System.out.println("Player Age : " + playerList.get(i).getPlayerAge());
            System.out.println("Player Type : " + playerList.get(i).getPlayerType());
            System.out.println("Player Statistics : " + playerList.get(i).getPlayerStatistics());
        }
    }


}
