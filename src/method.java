public class method {
    public static void main(String[] args){
        boolean gameover = true;
        int score =800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameover,score,levelCompleted,bonus);

        calculateScore(false,10000,8,200);
    }

    public static int calculateScore(boolean gameover,int score,int levelCompleted,int bonus){
        if(gameover){
            int finalScore=score+(levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final Score is " + finalScore);
            return finalScore;
        }
        return -1;
    }


}
