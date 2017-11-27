import java.util.Scanner;

/**
 * Created by adavi on 27.11.2017.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String arrayChar [] = {".",",",":",";","\"","(",")","!","?","\'"," "};

        ClassCrypto crypto = new ClassCrypto();

//        String userEnterText = crypto.inputTextFromUser();

        String userEnterText = "teremok? !tv !";
       String cryptoText =  crypto.normalizeText(userEnterText,arrayChar);

        System.out.println(cryptoText);
    }
}
