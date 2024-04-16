class DialingObserver implements PhoneObserver {
    private Screen screen;

    public DialingObserver(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void update(int newDigit) {
        screen.printDialingMessage();
    }
}