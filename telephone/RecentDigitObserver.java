class RecentDigitObserver implements PhoneObserver {
    private Screen screen;

    public RecentDigitObserver(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void update(int newDigit) {
        screen.printRecentDigit(newDigit);
    }
}