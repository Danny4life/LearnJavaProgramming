public class MainOne {

    public static void main(String[] args) {
        displayHighScorePosition("Segun", 1);
        displayHighScorePosition("Zoe", 2);
        System.out.println(calculateHighScorePosition(1200));
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " " + "managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore > 1000){
            return 1500;
        }else if (playerScore > 500 &&  playerScore < 1000){
            return 900;
        } else if(playerScore > 100 && playerScore < 500){
            return 400;
        }

        return 50;
    }


}
