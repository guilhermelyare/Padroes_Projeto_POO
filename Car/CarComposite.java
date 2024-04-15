import java.util.ArrayList;
import java.util.List;

class CarComposite implements CarPart {
    private List<CarPart> components = new ArrayList<>();

    public void addComponent(CarPart component) {
        components.add(component);
    }

    public void removeComponent(CarPart component) {
        components.remove(component);
    }

    @Override
    public double getWeight() {
        double totalWeight = 0;
        for (CarPart component : components) {
            totalWeight += component.getWeight();
        }
        return totalWeight;
    }
}