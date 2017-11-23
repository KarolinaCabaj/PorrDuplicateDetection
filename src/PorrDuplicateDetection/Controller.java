package PorrDuplicateDetection;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Karolka on 2017-11-23.
 */
public class Controller {

    private Text baseText,examinedText;
    private ArrayList<String> wordsListToCheck;
    private ArrayList<Integer> numerOfreats;

    public Controller( Text baseText, Text examinedText, String pathname){
        this.baseText=baseText;
        this.examinedText=examinedText;
        wordsListToCheck= new ArrayList<>();
        numerOfreats=new ArrayList<>();
        loadList(pathname);

    }
    private void loadList(String pathname)  {
        try {
            Scanner input = new Scanner(new File(pathname));
            while(input.hasNext())
            {
                wordsListToCheck.add(input.nextLine());
            }
            input.close();
        }
        catch(IOException e){
            System.out.println("Ojoj... coś nie bangla");
        }

    }
     private ArrayList<Integer> repeats(ArrayList<String> t){
        ArrayList<Integer> tmp_list = new ArrayList<>();
        for (String w:
             wordsListToCheck) {
            for (String s:
                 t) {


            }
                
            }
        return tmp_list;
        }

    private ArrayList<Integer> minimum(ArrayList<Integer> a, ArrayList<Integer>b){
        ArrayList<Integer> tmp = new ArrayList<>();

        return tmp;
    }
    //metoda fasada
    public void check(){

    }

    }





