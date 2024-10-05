import java.util.Arrays;

public class QuickFind {
    private int[] id;
    
    public QuickFind(int N) {
        id = new int[N];
        for(int i=0; i < id.length; ++i) {  
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        if(pid == qid) {
            return;
        }

        for(int i=0; i < id.length; ++i) {
            if(id[i] == pid) {
                id[i] = qid;
            }
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