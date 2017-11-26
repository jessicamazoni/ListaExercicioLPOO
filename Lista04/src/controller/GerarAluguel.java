package controller;
import model.AluguelAutomovel;
import model.Automovel;
import model.Cliente;
import model.Diaria;
import model.Mensal;
public class GerarAluguel{
    public AluguelAutomovel calcularAluguel(Cliente cliente, Automovel automovel, int tipoAluguel){
        if(tipoAluguel == 1){
            Diaria d = new Diaria(automovel,cliente);
            d.setAutomovel(automovel);
            d.setPessoa(cliente);
            return d;
        }else if(tipoAluguel == 2){
            Mensal m = new Mensal(automovel,cliente);
            m.setAutomovel(automovel);
            m.setPessoa(cliente);
            return m;
        } 
        System.out.println("Erro");
        AluguelAutomovel aluguel = null;
        return aluguel; 
    }
}
