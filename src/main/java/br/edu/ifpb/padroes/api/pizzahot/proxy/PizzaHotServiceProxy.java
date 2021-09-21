package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;
import br.edu.ifpb.padroes.domain.decorator.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class PizzaHotServiceProxy implements PizzaHotService {
    private PizzaHotServiceImpl pizzaHotService;
    private List<PizzaHotPizza> cacheAll;

    public PizzaHotServiceProxy(){
        this.pizzaHotService = new PizzaHotServiceImpl();
    }

    @Override
    public List<PizzaHotPizza> getPizzas() {
        // TODO - implementar proxy
        if(cacheAll == null){
            cacheAll = pizzaHotService.getPizzas();
        }
        return cacheAll;
    }
}
