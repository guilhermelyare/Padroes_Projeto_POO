public class CarCompositeDemo {
    public static void main(String[] args) {
        
        CarComposite carro = new CarComposite();
        CarComposite carroceria = new CarComposite();
        CarComposite chassi = new CarComposite();
        CarComposite tremDeForca = new CarComposite();
        
        //Elementos da carroceria
        CarPart paraLamas = new CarLeaf("para-lamas", 15);
        CarPart portas = new CarLeaf("portas", 40);
        CarPart paineis = new CarLeaf("painéis", 30);
        CarPart portaMalas = new CarLeaf("porta-malas", 25);
        CarPart capo = new CarLeaf("capô", 20);
        
        //Elementos Trem de força
        CarPart motor = new CarLeaf("motor", 300);
        CarPart transmissao = new CarLeaf("transmissão", 100);
        CarPart diferencial = new CarLeaf("diferencial", 50);
        CarPart rodas = new CarLeaf("rodas", 80);

        //Elementos chassi
        CarPart suspensao = new CarLeaf("suspensão", 30);
        
        carroceria.addComponent(paraLamas);
        carroceria.addComponent(portas);
        carroceria.addComponent(paineis);
        carroceria.addComponent(portaMalas);
        carroceria.addComponent(capo);
        
        
        tremDeForca.addComponent(motor);
        tremDeForca.addComponent(transmissao);
        tremDeForca.addComponent(diferencial);
        tremDeForca.addComponent(rodas);
        
        chassi.addComponent(tremDeForca);
        chassi.addComponent(suspensao);

        carro.addComponent(carroceria);
        carro.addComponent(chassi);
        
        double pesoTotal = carro.getWeight();
        System.out.println("Peso total do carro: " + pesoTotal + " kg");
    }
}
