package PorrDuplicateDetection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


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
        wordsListToCheck= wordsToCheckText.getListOfWordsFromText();
        numerOfreats=new ArrayList<>();
    }

     private HashMap<String,Integer> repeats(ArrayList<String> text){
        HashMap<String,Integer> countMap = new HashMap<>();
        int count;
        for (String w: wordsListToCheck) {
            count=0;
            //System.out.println(wordsListToCheck.size());
            for (String s: text) {
                if(w.equals(s)){
                    count++;
                    //System.out.println(count);
                }
            }
            countMap.put(w,count);
            }
            countMap.entrySet().forEach(System.out::println);
        return countMap;
        }

    private HashMap<String,Integer> minimum(HashMap<String,Integer> a, HashMap<String,Integer>b){
        HashMap<String,Integer> final_list = new HashMap<>();
            for (Map.Entry<String,Integer> entry : a.entrySet())
            {
                if(  entry.getValue() < b.get(entry.getKey()))
                    final_list.put(entry.getKey(), entry.getValue());

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
        int sum=
        sumRepeats(
            minimum(
                repeats(baseText.getListOfWordsFromText()),
                repeats(examinedText.getListOfWordsFromText())
            )
        );

        System.out.println("Ilosc słow w textBase: " + baseText.getListOfWordsFromText().size());
        System.out.println("Ilosc słow w textExamined: " + examinedText.getListOfWordsFromText().size());
        System.out.println("Poziom podobienstwa: " + (double)sum/baseText.getListOfWordsFromText().size()*100 + "%");
    }
}





