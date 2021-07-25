public class methodChallenge {
    /*
    Create a method called displayHighScorePosition
    it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    You should display the players name along with a message like " managed to get into position " and the
    position they got and a further message " on the high score table".

    Create a 2nd method called calculateHighScorePosition
    it should be sent one argument only, the player score
    it should return an int
    the return data should be
    1 if the score is >1000
    2 if the score is >500 and < 1000
    3 if the score is >100 and < 500
    4 in all other case
    call both methods and display the results of the following
    a score of 1500,900,400 and 50
     */
    public static void main(String[] args){
        int HighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("sakthivel ",HighScorePosition);

        HighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("sunil ",HighScorePosition);

        HighScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Riyaz ",HighScorePosition);

        HighScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tharun ",HighScorePosition);

        HighScorePosition = calculateHighScorePosition(389);
        displayHighScorePosition("karan ",HighScorePosition);

        HighScorePosition = calculateHighScorePosition(700);
        displayHighScorePosition("lokesh ",HighScorePosition);

        HighScorePosition = calculateHighScorePosition(20);
        displayHighScorePosition("puzhal ",HighScorePosition);

        HighScorePosition = calculateHighScorePosition(1200);
        displayHighScorePosition("varun ",HighScorePosition);
    }
    public static void displayHighScorePosition(String playarName, int HighScorePosition){
        System.out.println(playarName + " managed to get into position "+ HighScorePosition +" on the high score table ");
    }
    public static int calculateHighScorePosition(int playarScore){

//        if(playarScore >= 1000){
      //      return 1;
        //}else if(playarScore >=500 && playarScore < 1000){
       //     return 2;
      //  }else if(playarScore >=100 && playarScore < 500){
         //   return 3;
        //}else {
          //  return 4;
        //}

        int position = 4; // assumed position values

        if(playarScore >= 1000){
            position = 1;
        }else if(playarScore >=500){
            position = 2;
        }else if(playarScore >=100){
            position = 3;
        }
        return position;
    }
}
