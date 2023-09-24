import java.util.HashMap;

public class Translator {
    HashMap<Integer,String> numericAlpha = new HashMap<>();

    //Zet zowel de numeric als alphabetic waardes in de Hashmap
    public Translator (String[] alphabetic, Integer[] numeric){
        for (int i = 0; i < numeric.length; i++){
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    public String translate (Integer number){
        String value = numericAlpha.get(number);
        return value;
    }
}
