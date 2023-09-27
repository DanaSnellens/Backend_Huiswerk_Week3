import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Twee arrays: 1 numeriek en 1 alfabetisch
        Integer[] numeric = {1,2,3,4,5,6,7,8,9,0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes",
                "zeven", "acht", "negen", "nul"};

        //Translator object
        Translator numbers = new Translator(alphabetic,numeric);

        System.out.println(numbers.translate(8));

        boolean play = true;
        String ongeldig = "ongeldige invoer";

        //Scanner object
        Scanner scanner = new Scanner(System.in);

        //Logica v.d. applicatie: while(boolean)-loop
        while (play){
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();

            if (input.equals("x")) {
                play = false;
            }
            else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine();

                if (number < 10) {
                    String result = numbers.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                }
                else {
                    System.out.println(ongeldig);
                }
            }
            else
                System.out.println(ongeldig);
        }
    }
}
