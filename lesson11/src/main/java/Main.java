import com.homework.formatter.TextFormatter;
import com.homework.model.Model;

public class Main {
    public static void main(String[] args) {
        String example = "Когда Афанасий хотел кушать, он лез на дереВо за яблоками!";
        String[] example2 = {"заказ", "восход", "казак", "дед", "запад"};
        String example3 = "Когда дед хотел кушать, он лез на дереВо за яблоками. " +
                "Когда Афанасий хотел кушать, он лез на дереВо за яблоками. " +
                "Лес был темным.";
        Model model = new Model();
        System.out.println(model.cutString(example)); //- #1 работает
        System.out.println(model.replaceString(example)); //- #2 работает
        for (String s : example2) { //- #3 работает
            model.foundWordPolindrome(s);
        }
        String[] parts = example3.split("\\.");

        for (String part : parts) { //- #4 работает
            if (TextFormatter.countingWords(part) >= 3 && TextFormatter.countingWords(part) <= 5) {
                System.out.println(part);
            }
            if (TextFormatter.foundWordPolindromeInString(part)) { //- #4 работает
                System.out.println(part);
            }
        }
    }
}
