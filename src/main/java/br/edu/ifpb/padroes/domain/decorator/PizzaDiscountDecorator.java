package br.edu.ifpb.padroes.domain.decorator;



public class PizzaDiscountDecorator extends PizzaDecorator{
    public PizzaDiscountDecorator(Pizza pizzaBase){
        super(pizzaBase);
    }
    @Override
    public Float getPrice() {

        return this.pizzaBase.getPrice() * 0.75f;
    }

    @Override
    public String getName() {
        return this.pizzaBase.getName();
    }
}
