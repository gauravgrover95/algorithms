import java.util.Arrays;

/**
 * WeightedQuickUnion
 */
public class WeightedQuickUnion {

    private int[] id;
    private int[] size;

    WeightedQuickUnion(int N) {
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    int root(int i) {
        while(id[i] != i) {
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
        if(size[proot] < size[qroot]) {
            id[proot] = qroot; // smaller tree should connect to larger tree
            size[qroot] += size[proot]
        } else if (size[qroot] < size[proot]) {
            id[qroot] = proot;
            size[proot] += size[qroot];
        }
    }

    public void boink() {
        System.out.println("boink boink");
        printId();
    }


    private void printId() {
        System.out.println(Arrays.toString(this.id));
    }
}