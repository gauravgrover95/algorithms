/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

class Student {
    public int rollNo;
    public String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "roll no: " + rollNo + " with name: " + name;
    }
}

public class HelloWorld {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("ele at %s: %s%n", i, arr[i]);
        }
    }

    static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int x) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == x) {
                return mid;
            }

            if (x < arr[mid]) { // go left
                hi = mid - 1;
            }

            if (x > arr[mid]) { // go left
                lo = mid - 1;
            }
        }

        return -1;
    }

    static int binarySearch2(int[] arr, int x) {
        int lo = 0;
        int hi = arr.length - 1;

        int mid = (lo + hi) / 2;

        return -1;
    }

    static void printArray(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("ele at %s: %s%n", i, arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World");
        int[] x = new int[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < x.length - 1; ++i) {
            System.out.println(x[i]);
            x[i + 1] = x[i + 1] + 1;
        }


        int[][] multiArray = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < multiArray.length; ++i) {
            for (int j = 0; j < multiArray[i].length; ++j) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

        Student[] studentArr;
        studentArr = new Student[5];

        studentArr[0] = new Student(1, "Gaurav");
        studentArr[1] = new Student(2, "Aman");
        studentArr[2] = new Student(3, "Kavya");
        studentArr[3] = new Student(4, "Anjana");
        studentArr[4] = new Student(5, "Shelly");

        for (int i = 0; i < studentArr.length; i++) {
            System.out.println(studentArr[i]);
        }

        System.out.println();
        printArray(studentArr);

        System.out.println();

        int[] y = new int[] { 5, 6, 7, 8, 9, 10 };
        int index = linearSearch(y, 7);
        System.out.println("7 is available at: " + index);
    }
}
