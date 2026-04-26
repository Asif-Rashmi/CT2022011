package Q7;
import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q7 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");

        JFrame frame = new JFrame(time.format(format));
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}