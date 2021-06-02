public class CaeserCipher {

    private String theMessage;
    private int shiftKey;

    public CaeserCipher(String message, int key){
        this.theMessage = message;
        this.shiftKey = key;

        public String getTheMessage() {
            return theMessage;

        }

        public int getShiftKey() {
            return shiftKey;
        }

        public int shiftKeyForEncryption(){
            int key = getShiftKey();
            if (key > 26){
                key = key % 26;
            }else if (key < 0){
                key = (key % 26) + 26;
            }
            return key;
        }

        public String messageEncryption() {
            int shiftedKey = shiftKeyForEncryption();
            String message = getTheMessage();
            String cipherText = "";

            int length = getTheMessage().length();
            for (int i = 0; i < length; i++) {
                char ch = message.charAt(i);
                if (Character.isLetter(ch)) {
                    if (Character.isLowerCase(ch)) {
                        char c = (char) (ch + shiftKey);
                        if (c > 'z') {
                            cipherText += (char) (ch - (26 - shiftKey));

                        }
                        else{
                            cipherText += c;
                        }

                    } else if (Character.isUpperCase(ch)) {
                        char c = (char) (ch + shiftKey);
                        if (c > 'Z') {
                            cipherText += (char) (ch - (26 - shiftKey));

                        }else{
                            cipherText += c;

                        }

                    }

                } else cipherText += ch;

            }
            return cipherText;
        }

        public String messageDecryption() {
            int shiftedKey = shiftKeyForEncryption();
            String message = messageEncryption();
            String decryptedText = "";

            int length = getTheMessage().length();
            for (int i = 0; i < length; i++) {
                char ch = message.charAt(i);
                if (Character.isLetter(ch)) {
                    if (Character.isLowerCase(ch)) {
                        char c = (char) (ch - shiftKey);
                        if (c <'a') {
                            decryptedText += (char) (ch + (26 - shiftKey));

                        }
                        else{
                            decryptedText += c;
                        }

                    } else if (Character.isUpperCase(ch)) {
                        char c = (char) (ch - shiftKey);
                        if (c < 'A') {
                            decryptedText += (char) (ch + (26 - shiftKey));

                        }else{
                            decryptedText += c;

                        }

                    }

                } else decryptedText += ch;

            }
            return decryptedText;



    }
}
