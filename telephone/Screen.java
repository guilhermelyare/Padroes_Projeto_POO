/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen {
    private final PhoneModel model;
    private final int numDigits;

    public Screen(PhoneModel model, int numDigits) {
        this.model = model;
        this.numDigits = numDigits;
    }

    public void printRecentDigit(int newDigit) {
        System.out.println(newDigit);
    }

    public void printDialingMessage() {
        if (model.getDigits().size() >= numDigits) {
            StringBuilder dialingMessage = new StringBuilder("Agora discando ");
            for (int digit : model.getDigits()) {
                dialingMessage.append(digit);
            }
            System.out.println(dialingMessage.toString() + "...");
        }
    }
}