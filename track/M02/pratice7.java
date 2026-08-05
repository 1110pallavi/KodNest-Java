package track.M02;

public class pratice7 {
    public static void main(String[] args) {

        int CompletedTopics = 17;
        int TotalTopics = 20;
        int Dailylearninghours = 3;
        int Learningdays = 5;

        int remainingTopics = TotalTopics - CompletedTopics;
        int weeklylearninghours = Dailylearninghours * Learningdays;

        double progresspercentage = (double) CompletedTopics * 100 / TotalTopics;

        System.out.println("Completed Topics: " + CompletedTopics);
        System.out.println("Remaining Topics: " + remainingTopics);
        System.out.println("Weekly Learning Hours: " + weeklylearninghours);
        System.out.println("Progress Percentage: " + progresspercentage);
    }
}
