
public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 10;

        
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model, NUM_DIGITS);
        KeyPad keyPad = new KeyPad(model);

        RecentDigitObserver digitObserver = new RecentDigitObserver(screen);
        DialingObserver dialingObserver = new DialingObserver(screen);

        model.addObserver(digitObserver);
        model.addObserver(dialingObserver);


        keyPad.simulateKeyPresses(NUM_DIGITS);

        // model.removeObserver(dialingObserver);

        // keyPad.simulateKeyPresses(NUM_DIGITS);
    }
}
