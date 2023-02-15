package lab_11;

import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        StudentTask st1 = new StudentTask("Петров", java.util.Date.from( Instant.now()) , new Date());
        st1.printInfo();
    }
}
