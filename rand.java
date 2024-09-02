import java.util.Scanner;
import java.util.Random;
public class rand {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of passwords");
        int numPasswords = sc.nextInt();
        System.out.println("Please enter number of characters");
        int numChars = sc.nextInt();
        String[] passwords = rand.passwordGen(numPasswords, numChars);
        for(int i = 0; i < passwords.length; i++){
            System.out.println(passwords[i]);
        }
    }

    public static String[] passwordGen(int numPasswords, int numChars){
        String[] passwords = new String[numPasswords];
        Random rand = new Random();
        for(int i = 0; i < numPasswords; i++){
            String password = "";
            for(int j = 0; j < numChars; j++){
                int randVal = rand.nextInt(62);
                char character;
                if(randVal < 10){
                    character = (char) (randVal + 48);
                    password += character;
                }
                else if(randVal < 36){
                    character =(char) (randVal + 55);
                    password += character;
                }
                else {
                    character = (char) (randVal + 61);
                    password += character;
                }
            }
            passwords[i] = password;
        }
        return passwords;
    }
}