import java.util.ArrayList;
import java.util.Scanner;

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

        while (true) {
            Scanner myScnr = new Scanner(System.in);
            System.out.println("Please Select an Option : \nA : Add a Player\nB : Display two best batsman\nC : Display two best bowlers\nD : Display two best keepers\nV : View all players");
            String get = myScnr.nextLine();

            switch (get){
                case "A":
                    break;
                case "B":
                    break;
                case "C":
                    break;
                case "D":
                    break;
                case "V":
                    System.out.println("hi");
            }
        }
//        for(int i = 0 ;i< playerList.size(); i++) {
//            System.out.println("Player Name : " + playerList.get(i).getPlayerName());
//            System.out.println("Player Age : " + playerList.get(i).getPlayerAge());
//            System.out.println("Player Type : " + playerList.get(i).getPlayerType());
//            System.out.println("Player Statistics : " + playerList.get(i).getPlayerStatistics());
//        }
    }


}
