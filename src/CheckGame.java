import java.util.regex.Pattern;

public class CheckGame {
    void checkalpha(String guess) {
        if(!Pattern.matches("[a-zA-Z]+", guess ))
        {
            System.out.println("Please enter an alphabetical character.");
        }
    }
}