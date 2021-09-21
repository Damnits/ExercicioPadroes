package br.edu.ifpb.padroes.domain.decorator;


public class PizzaStuffedCrushDecorator extends PizzaDecorator{
    public PizzaStuffedCrushDecorator(Pizza pizzaBase){
        super(pizzaBase);
    }
    @Override
    public Float getPrice() {

        return this.pizzaBase.getPrice()*1.20f;
    }

    @Override
    public String getName() {
        return this.pizzaBase.getName() + "(stuffed crush)";
    }
}
