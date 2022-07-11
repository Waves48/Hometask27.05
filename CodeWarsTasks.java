public class CodeWarsTasks {
    public static void main(String[] args) {
// You are given array of integers, your task will be to count all pairs in that array and return their count.
        int[] taskArray = {0, 5, 7, 8, 6, 3, 4, 2, 4, 0, 6, 7, 3, 5, 2};
        int pairNumber = 0;
        for (int i = 0; i < taskArray.length; i++) {
            for (int j = i + 1; j < taskArray.length; j++) {
                if (taskArray[i] == taskArray[j]) {
                    pairNumber++;
                }
            }
        }
        System.out.println("Task 1 Complete - number of pairs: " + pairNumber);
        System.out.println("");
        //In this kata you get the start number and the end number of a region and should
        // return the count of all numbers except numbers with a 5 in it.
        // The start and the end number are both inclusive!
        // Example 1,9 -> 1,2,3,4,6,7,8,9 -> Result 8
        int[] taskTwoArray = new int[40];
        // 7-46
        int j = 7;
        for (int i = 0; i < taskTwoArray.length; i++) {
            taskTwoArray[i] = j;
            j++;
        }
        int placeholderCount = 0;
        for (int i = 0; i < taskTwoArray.length; i++) {
            if (taskTwoArray[i] % 5 == 0 && taskTwoArray[i] % 10 != 0) {
                taskTwoArray[i] = 0;
                placeholderCount++;
            }
        }

        int[] goodArray = new int[taskTwoArray.length - placeholderCount];

        int temp;
        for (int i = 0; i < taskTwoArray.length; i++) {
            for (int a = i + 1; a < taskTwoArray.length; a++) {
                if (taskTwoArray[i] == 0) {
                    temp = taskTwoArray[a];
                    taskTwoArray[a] = taskTwoArray[i];
                    taskTwoArray[i] = temp;
                }
            }
        }
        for (int i = 0; i < goodArray.length; i++) {
            goodArray[i] = taskTwoArray[i];
        }
        System.out.println("Task 2 Complete - From 7 to 46 without any fives: ");

        for (int i = 0; i < goodArray.length; i++) {
            System.out.print(" " + goodArray[i]);
        }
        System.out.println("");
        System.out.println("Final numbers count: " + goodArray.length);
        System.out.println("");
        // Find the greatest common divisor of two positive integers.
        // The integers can be large, so you need to find a clever solution.
        //The inputs x and y are always greater or equal to 1, so the greatest
        // common divisor will always be an integer that is also greater or equal to 1.
        int x = 4479;
        int y = 2208;
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        System.out.println("Task 3 Complete - The greatest common divisor is "+ x);
    }
}
