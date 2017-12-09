package PorrDuplicateDetection;

/**
 * Created by Karolka on 2017-10-31.
 */
public class Main {
    public static void main(String []args)
    {
        //long startTime = System.currentTimeMillis();
        long startTime = System.nanoTime();

        Text baseText = new Text("6_image.txt");
        System.out.println("to sa dla text cos1");
        baseText.readText();
        Text examinedText = new Text("2_image.txt");
        System.out.println("to sa dla text cos2");
        examinedText.readText();
        Text wordsToCheckText = new Text("check_image_recognition.txt");
        System.out.println("to sa dla text check");
        wordsToCheckText.readText();

        Controller control = new Controller(baseText, examinedText, wordsToCheckText);
        control.check();

        //long endTime   = System.currentTimeMillis();
        //long totalTime = endTime - startTime;
        //System.out.println(totalTime);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("Czas wykonania : " + duration/(1000000) + " [ms]");


    }
}
