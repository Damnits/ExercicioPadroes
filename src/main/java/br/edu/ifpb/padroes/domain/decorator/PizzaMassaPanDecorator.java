package br.edu.ifpb.padroes.domain.decorator;



public class PizzaMassaPanDecorator extends PizzaDecorator{
    public PizzaMassaPanDecorator(Pizza pizzaBase){
        super(pizzaBase);
    }
    @Override
    public Float getPrice() {

        return this.pizzaBase.getPrice()*1.15f;
    }

    @Override
    public String getName() {
        return this.pizzaBase.getPrice() + "(pan pizza)";
    }
}

