import java.util.HashMap;

public class Translator {
    //Hashmap variabele
    HashMap<Integer,String> numericAlpha = new HashMap<>();

    //Constructor met 2 arrays (numeriek en alfabetisch) als parameter.
    // --> Zet zowel de numeric als alphabetic waardes in de Hashmap
    public Translator (String[] alphabetic, Integer[] numeric){
        for (int i = 0; i < numeric.length; i++){
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    //Translate functie/method
    public String translate (Integer number){
        String value = numericAlpha.get(number);
        return value;
    }
}
