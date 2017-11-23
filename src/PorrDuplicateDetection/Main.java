package PorrDuplicateDetection;

/**
 * Created by Karolka on 2017-10-31.
 */
public class Main {
    public static void main(String []args)
    {
        Text baseText = new Text("cos1.txt");
        System.out.println("to sa dla text cos1");
        baseText.readText();
        Text examinedText = new Text("cos2.txt");
        System.out.println("to sa dla text cos2");
        examinedText.readText();
        Text wordsToCheckText = new Text("check.txt");
        System.out.println("to sa dla text check");
        wordsToCheckText.readText();

        Controller control = new Controller(baseText, examinedText, wordsToCheckText);
        control.check();

    }
}
