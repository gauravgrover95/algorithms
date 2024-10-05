import java.util.Arrays;

/**
 * QuickUnion
 */
public class QuickUnion {
    private int[] id;
    
    QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (id[i] != i) {
           i = id[i]; 
        }
        return i;
    }

    boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    void union(int p, int q) {
        int proot = root(p);
        int qroot = root(q);
        if(proot == qroot) {
            return;
        }
        id[proot] = qroot;
    }

    public void boink() {
        System.out.println("boink boink");
        printId();
    }


    private void printId() {
        System.out.println(Arrays.toString(this.id));
    }
    
}