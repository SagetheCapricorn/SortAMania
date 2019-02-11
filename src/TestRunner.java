public class TestRunner {
    public static String[] randomStringArr(int num, int length) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            for (int w = 1; w < num; w++) {
                arr[i] += abc.charAt(((int) (Math.random() * length * 10)));
            }

        }
        return arr;


    }

    public static int[] randomIntsArr(int length) {
        int[] arr = new int[length];
        for (int w = 0; w < arr.length; w++) {
            arr[w] = (int) (Math.random() * 100000);
        }
        return arr;
    }


    public static void main(String[] args)
    {
        SortCompetition team13 = new Team13SortCompetition();
        int[] randIntArr = {1,2,4,5,8,9,0,7,2,1,4,2,6,5,9,6};
        String[] randomStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        Team13SortCompetition.printArr(randIntArr);

        //Challenge One
        long time = System.currentTimeMillis();
        int median = team13.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + "Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
       Team13SortCompetition.printArr(randIntArr);

        //Challenge Two
        System.out.println("Unsorted");
        Team13SortCompetition.printArr(randomStringArr);

        long time2 = System.currentTimeMillis();
        int indexOfQuery = team13.challengeTwo(randomStringArr,"query");
        time2 = System.currentTimeMillis() - time2;
        System.out.println("Challenge Two Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Index equals: " + indexOfQuery);

        System.out.println("Sorted");
        Team13SortCompetition.printArr(randomStringArr);
        //Challenge 3
        int[] randIntArr2 = randomIntsArr(100000);
        System.out.println("Unsorted");
        Team13SortCompetition.printArr(randIntArr2);

        long time3 = System.currentTimeMillis();
        int median3 = team13.challengeOne(randIntArr2);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        Team13SortCompetition.printArr(randIntArr);


        //Challenger Four
        /*int[][] doubleArr = Sorting_Algorithims.doubleRandIntArr();
        System.out.println("Unsorted");
        System.out.println(Arrays.toString(doubleArr));
        time = System.currentTimeMillis();
        median = team13.challengeFour(doubleArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Four Time Taken: " + time*.001+"Seconds");
        System.out.println("Median equals: " +median);

        System.out.println("Sorted");
        System.out.println(Arrays.toString(doubleArr));*/


    }
}

