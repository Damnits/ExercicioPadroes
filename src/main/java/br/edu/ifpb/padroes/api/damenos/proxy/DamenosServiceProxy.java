package br.edu.ifpb.padroes.api.damenos.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.DamenosServiceImpl;
import br.edu.ifpb.padroes.api.pizzahot.proxy.PizzaHotServiceProxy;

import java.util.ArrayList;
import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class DamenosServiceProxy implements DamenosService {
    private DamenosServiceImpl damenosService;
    private List<DamenosPizza> cacheAll;

    public DamenosServiceProxy(){this.damenosService = new DamenosServiceImpl();}

    @Override
    public List<DamenosPizza> getPizzas() {
        // TODO - implementar proxy
        if(cacheAll == null){
            cacheAll = damenosService.getPizzas();
        }
        return cacheAll;
    }
}
