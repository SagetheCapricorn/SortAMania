public class Test13_Runner
{
    public static void main(String[] args)
    {
        SortCompetition team13 = new Team13SortCompetition();
        int[][] doubleArr = Team13SortCompetition.doubleRandIntArr();
        System.out.println("Unsorted");
        long time = System.currentTimeMillis();
        int median = team13.challengeFour(doubleArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Four Time Taken: " + time * .001 + "Seconds");
        System.out.println("Median equals: " + median);
        System.out.println("Sorted");

    }
}
