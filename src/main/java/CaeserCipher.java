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


    }
}
