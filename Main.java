/*
 * IT-2660 - Lab 1
 * Student Name: Taras Yakym
 */

public class Main {
    public static void main(String[] args) {

        Lab1 lab = new Lab1();

        int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

        // print array using while loop
        int i = 0;
        while (i < nums.length) {
            System.out.print(nums[i] + " ");
            i++;
        }
        System.out.println();

        // print array in reverse using for loop
        for (int j = nums.length - 1; j >= 0; j--) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();

        // first and last values
        System.out.println(nums[0]);
        System.out.println(nums[nums.length - 1]);

        // method calls
        System.out.println(lab.max(4, 9));
        System.out.println(lab.min(4, 9));
        System.out.println(lab.sum(nums));
        System.out.println(lab.average(nums));
        System.out.println(lab.max(nums));
        System.out.println(lab.min(nums));
    }
}

class Lab1 {

    public int increment(int num) {
        return num + 1;
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public double average(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum / (double) nums.length;
    }

    public int max(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public int min(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}
