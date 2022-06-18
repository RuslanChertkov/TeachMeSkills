package Exception;

import static Exception.Throw.demoproc;

public class MainDemoproc {
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("recaugh: " + e);
        }

    }
}
