/**
 * Created by adavi on 27.11.2017.
 */
public class ClassCrypto implements Crypto {





    public String inputTextFromUser() {

        System.out.println("Enter text");

         String textFromUser = Main.scanner.next();

        return textFromUser;
    }

    @Override
    public String normalizeText(String text, String arrayChar[]) {


        for (int i = 0; i < text.length();i++) {
            for (int j = 0; j < arrayChar.length; j++) {

                if (text.contains(arrayChar[j])) {
                    System.out.println(text);
                    int indexString = text.indexOf(arrayChar[j]);
                    text = text.substring(0, indexString) + text.substring(indexString + 1);
                }
            }
        }

        return text;
    }



}
