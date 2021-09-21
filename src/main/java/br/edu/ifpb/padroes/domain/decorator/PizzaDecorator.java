package br.edu.ifpb.padroes.domain.decorator;


public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizzaBase;

    public PizzaDecorator(Pizza pizzaBase){
        this.pizzaBase = pizzaBase;
    }

    @Override
    public Float getPrice() {
        return this.pizzaBase.getPrice();
    }

    @Override
    public String getName() {
        return this.pizzaBase.getName();
    }
}
