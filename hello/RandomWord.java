import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Random;

public class RandomWord {
    public static void main(String[] args) {
        while (StdIn.hasNextLine()) {
            String line = StdIn.readLine();
            if (line.isEmpty()) {
                break;
            }

            String[] words = line.split(" ");
            Random random = new Random();
            int i = random.nextInt(words.length);
            StdOut.println(words[i]);
        }
    }
}
