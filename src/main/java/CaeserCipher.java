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

    }
}
