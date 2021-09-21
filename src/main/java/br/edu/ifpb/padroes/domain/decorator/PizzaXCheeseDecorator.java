package br.edu.ifpb.padroes.domain.decorator;

public class PizzaXCheeseDecorator extends PizzaDecorator{
    public PizzaXCheeseDecorator(Pizza pizzaBase){
        super(pizzaBase);
    }
    @Override
    public Float getPrice() {
        return this.pizzaBase.getPrice()*1.10f;
    }

    @Override
    public String getName() {
        return this.pizzaBase.getName() + "(extra cheese)";
    }
}
