import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean cipherActive = true;

        while (cipherActive) {
            System.out.println("Please type yes if you want to continue else type no to exit");
            String response = scan.nextLine();
            if (response.equals("yes")) {
                System.out.println("Enter the message to encrypt.");
                String message = scan.nextLine();
                System.out.println("Enter the key to encrypt the message");
                int key = scan.nextInt();

                CaeserCipher caeserCipher = new CaeserCipher(message, key);
                String encryptedMessage = caeserCipher.messageEncryption();
                String decryptedMessage = caeserCipher.messageDecryption();

                System.out.println("Your message encrypted is : " + encryptedMessage);
                System.out.println("Your message decrypted is : " + decryptedMessage);

            }
        }
