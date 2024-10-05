import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**     
 * Index
 */
public class Index {

    // public static void main(String[] args) {
    //     List<Integer> list = new ArrayList<>();
    //     list.add(1);
    //     list.add(2);
    //     list.add(3);
    //     list.add(4);
    //     System.out.println(list.get(2));
    // }

    public static void main(String[] args) {
        // quickFind();
        // quickUnion();
        weightedQuickUnion();
    }

    private static void quickFind() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the num of nodes: ");
            int N = scanner.nextInt();
            QuickFind uf = new QuickFind(N);
            uf.union(1, 2);
            uf.union(2, 6);
            uf.union(1, 5);
            uf.boink();
            

            while(true) {
                System.out.print("Enter nums to test: ");
                int p = scanner.nextInt();
                int q = scanner.nextInt();
                if(uf.connected(p, q)) {
                    System.out.println(String.format("%s & %s are connected", p, q));
                } else {
                    System.out.println(String.format("%s & %s are not connected", p, q));
                }
            }
        }
    }

    private static void quickUnion() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the num of nodes: ");
            int N = scanner.nextInt();
            WeightedQuickUnion uf = new WeightedQuickUnion(N);
            uf.union(1, 2);
            uf.union(2, 6);
            uf.union(1, 5);
            uf.boink();
            

            while(true) {
                System.out.print("Enter nums to test: ");
                int p = scanner.nextInt();
                int q = scanner.nextInt();
                if(uf.connected(p, q)) {
                    System.out.println(String.format("%s & %s are connected", p, q));
                } else {
                    System.out.println(String.format("%s & %s are not connected", p, q));
                }
            }
        }
    }

    private static void weightedQuickUnion() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the num of nodes: ");
            int N = scanner.nextInt();
            QuickUnion uf = new QuickUnion(N);
            uf.union(1, 2);
            uf.union(2, 6);
            uf.union(1, 5);
            uf.boink();
            

            while(true) {
                System.out.print("Enter nums to test: ");
                int p = scanner.nextInt();
                int q = scanner.nextInt();
                if(uf.connected(p, q)) {
                    System.out.println(String.format("%s & %s are connected", p, q));
                } else {
                    System.out.println(String.format("%s & %s are not connected", p, q));
                }
            }
        }
    }


}