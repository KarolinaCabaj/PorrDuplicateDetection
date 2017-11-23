package PorrDuplicateDetection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Karolka on 2017-11-23.
 */
public class Text {

    private File file;
    private String filePath;
    private ArrayList<String> listOfWordsFromText;

    public Text(String filePath)
    {
        this.filePath = filePath;
        listOfWordsFromText = new ArrayList<String>();
        getWordsFromFile();
        readText();
    }


    public void readText()
    {
        try{
            for(int x = 0; x < listOfWordsFromText.size(); x++){
                System.out.println(listOfWordsFromText.get(x));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public void getWordsFromFile() //throws FileNotFoundException
    {
        Scanner s;
        try{
            file = new File(filePath);
            s = new Scanner(file);
            while (s.hasNext()) {
                listOfWordsFromText.add(s.next());
            }
            s.close();
        }
        catch (FileNotFoundException  e)
        {
            e.printStackTrace();
            System.out.println("FileNotFoundException ");
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("IOException");
        }

    }
}
