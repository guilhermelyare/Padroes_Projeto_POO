class StrawberryCake extends Cake {
    private final int CAKE_COST = 20; // Custo do bolo de morango é o dobro do padrão

    @Override
    public int getCost() {
        return CAKE_COST;
    }

    @Override
    public String getDescription() {
        return "Strawberry cake";
    }
}