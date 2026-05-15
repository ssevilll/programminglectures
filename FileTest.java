import java.io.*;
import java.util.*;

class ParallelProcessor extends Thread {
    String str;

    public ParallelProcessor(String text) {
        str = text;
    }

    public void run() {
        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            String word = (String) st.nextToken();

            if (word.length() > 3) {
                FileTest.increment();
            }
        }
    }
}

public class FileTest {
    static int globalCount = 0;

    static synchronized void increment() {
        globalCount++;
    }

    public static void main(String[] args) {
        List<ParallelProcessor> list = new ArrayList<>();

        try (FileReader fr = new FileReader("input.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String text = "";
            String line = "";
            int lineIdx = 1;

            while ((line = br.readLine()) != null) {
                text += line + " ";

                if (lineIdx++ == 200) {
                    lineIdx = 1;

                    String input = new String(text);
                    ParallelProcessor pp = new ParallelProcessor(input);
                    // each loop divides the file into 200 lines and creates a thread to process those lines
                    // without waiting for the previous thread to finish, so they can run in parallel
                    pp.start();
                    list.add(pp);

                    text = "";
                }
            }

            // For the ending of the file that did not fit into 200 lines
            if (text.length() > 0) {
                String input = new String(text);
                ParallelProcessor pp = new ParallelProcessor(input);

                pp.start();
                list.add(pp);
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }

        try {
            for (ParallelProcessor p : list) {
                p.join();
            }
        } catch (InterruptedException iex) {
            System.out.println("Error: " + iex);
        }

        System.out.println("Word count: " + globalCount);
        System.out.println("Threads: " + list.size());
    }
}