package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.domain.decorator.Pizza;
import br.edu.ifpb.padroes.domain.PizzaShopPizza;
import br.edu.ifpb.padroes.domain.decorator.PizzaDiscountDecorator;
import br.edu.ifpb.padroes.domain.decorator.PizzaStuffedCrushDecorator;
import br.edu.ifpb.padroes.domain.decorator.PizzaXCheeseDecorator;
import br.edu.ifpb.padroes.service.PizzaShopService;

public class Main {

    public static void main(String[] args) {

        PizzaShopService pizzaShopService = new PizzaShopService();

        System.out.println("Pizzas - menu");

        // TODO - implementar adapter para juntar as pizzas da PizzaHot e Damenos em um único conjunto

        for (PizzaHotPizza pizza : pizzaShopService.getPizzasPizzaHot()) {
            System.out.println(String.format("%s - %.2f", pizza.getTopping(), pizza.getPrice()));
        }
        for (DamenosPizza pizza : pizzaShopService.getPizzasDamenos()) {
            System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getCost()));
        }

        Pizza pizza = new PizzaShopPizza("pepperoni", 55.0f);

        pizza = new PizzaXCheeseDecorator(pizza);
        pizza = new PizzaStuffedCrushDecorator(pizza);
        pizza = new PizzaDiscountDecorator(pizza);


        // TODO - implementar padrão decorator para só precisar passar o objeto pizza
        pizzaShopService.orderPizza(pizza);
        //desconto, queijo, borda
    }

}
