class CarLeaf implements CarPart {
    private String name;
    private double weight;

    public CarLeaf(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        System.out.println("Somando agora o peso de " + name + ": " + weight + " kg. Total parcial: " + weight + " kg");
        return weight;
    }
}