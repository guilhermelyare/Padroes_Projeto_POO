import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    private List<PhoneObserver> observers = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyObservers(newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public void addObserver(PhoneObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(PhoneObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(int newDigit) {
        for (PhoneObserver observer : observers) {
            observer.update(newDigit);
        }
    }
}
