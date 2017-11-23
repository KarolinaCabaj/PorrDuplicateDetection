package PorrDuplicateDetection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Karolka on 2017-11-23.
 *
 */
public class Text {

    private File file;
    private String filePath;
    private ArrayList<String> listOfWordsFromText;

    Text(String filePath)
    {
        this.filePath = filePath;
        listOfWordsFromText = new ArrayList<>();
        getWordsFromFile();
        readText();
    }

    public ArrayList<String> getListOfWordsFromText() {
        return listOfWordsFromText;
    }

    private void readText()
    {
        try{
            for (String aListOfWordsFromText : listOfWordsFromText) {
                System.out.println(aListOfWordsFromText);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    private void getWordsFromFile() //throws FileNotFoundException
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

    }
}
