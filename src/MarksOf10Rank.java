public class MarksOf10Rank {
    public static void main(String[] args){

        int RankPosition = Rankpositon(499);
        double avg = averagePosition(499);
        displayRankOlders("Riyaz",RankPosition,avg);

        RankPosition = Rankpositon(350);
        avg = averagePosition(350);
        displayRankOlders("sakthivel",RankPosition,avg);

        RankPosition = Rankpositon(220);
        avg = averagePosition(220);
        displayRankOlders("sunil",RankPosition,avg);

        RankPosition = Rankpositon(150);
        avg = averagePosition(150);
        displayRankOlders("Tharun",RankPosition,avg);

        RankPosition = Rankpositon(50);
        avg = averagePosition(350);
        displayRankOlders("varun",RankPosition,avg);





    }
    public static void displayRankOlders(String StudentName,int RankPosition,double avg){
        System.out.println(StudentName + " managed to get into Rank "+ RankPosition + " On the High Rank and "+ avg + " On the High avg");
    }
    public static int Rankpositon(int Mark){
        int Ranking=5;

        if(Mark >=400 && Mark <=500){
            Ranking = 1;
        }else if(Mark >=300 && Mark < 400){
            Ranking = 2;
        }else if(Mark >= 200 && Mark < 300) {
            Ranking = 3;
        }else if (Mark >=100 && Mark < 200){
            Ranking = 4;
        }
        return Ranking;
    }
    public static double averagePosition(int Mark){
        double average = 50.0;
        if(Mark >=400 && Mark <=500){
            average = 90.0;
        }else if(Mark >=300 && Mark < 400){
            average = 80.0;
        }else if(Mark >= 200 && Mark < 300) {
            average = 70.0;
        }else if (Mark >=100 && Mark < 200){
            average = 60.0;
        }
        return average;

    }

}
