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

    private Text baseText,examinedText, wordsToCheckText;
    private ArrayList<String> wordsListToCheck;
    private ArrayList<Integer> numerOfreats;

    public Controller( Text baseText, Text examinedText, Text wordsToCheckText){
        this.baseText=baseText;
        this.examinedText=examinedText;
        this.wordsToCheckText = wordsToCheckText;
        wordsListToCheck= wordsToCheckText.getListOfWordsFromText();//new ArrayList<>();
        numerOfreats=new ArrayList<>();
        //loadList(pathname);

    }

     private HashMap<String,Integer> repeats(ArrayList<String> text){
        HashMap<String,Integer> countMap = new HashMap<>();
        int count;
        for (String w: wordsListToCheck) {
            count=0;
            System.out.println(wordsListToCheck.size());
            for (String s: text) {
                if(w.equals(s)){
                    count++;
                    System.out.println(count);
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
                if(  entry.getValue() < b.get(entry.getKey())){
                    final_list.put(entry.getKey(), entry.getValue());
                }
                else
                    final_list.put(entry.getKey(), b.get(entry.getKey()));
            }
        return final_list;
    }
    private int sumRepeats(HashMap<String,Integer> finalMap){
        int sum=0;
        for (Map.Entry<String,Integer> map:
                finalMap.entrySet()) {
            sum+=map.getValue();
        }
        return sum;
    }
    //metoda fasada
    public void check()
    {
        System.out.println(wordsListToCheck.size());
        int sum=
        sumRepeats(
            minimum(
                repeats(baseText.getListOfWordsFromText()),
                repeats(examinedText.getListOfWordsFromText())
            )
        );

        System.out.println(sum);//baseText.getListOfWordsFromText().size());

    }


}





