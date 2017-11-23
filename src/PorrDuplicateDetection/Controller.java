package PorrDuplicateDetection;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
     private HashMap<String,Integer> repeats(ArrayList<String> text){
        HashMap<String,Integer> countMap = new HashMap<>();
        int count;
        for (String w:
             wordsListToCheck) {
            count=0;
            for (String s:
                 text) {
                if(w.equals(s)){
                    count++;
                }
            }
            countMap.put(w,count);
            }
        return countMap;
        }

    private HashMap<String,Integer> minimum(HashMap<String,Integer> a, HashMap<String,Integer>b){
        HashMap<String,Integer> final_list = new HashMap<>();
        for (Map.Entry<String,Integer> entry : a.entrySet())
        {
            if(entry.getValue()>b.
        }
        return final_list;
    }
    //metoda fasada
    public void check(){

    }

    }





