public class MultiLayeredCake extends Cake {
    private Cake cake;

    public MultiLayeredCake(Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return cake.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + cake.getDescription();
    } 
}
