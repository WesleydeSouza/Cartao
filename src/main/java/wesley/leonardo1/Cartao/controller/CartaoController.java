package wesley.leonardo1.Cartao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wesley.leonardo1.Cartao.model.Cartao;

import java.util.ArrayList;
@RestController
public class CartaoController {

    @GetMapping("/cartao")
    public Cartao getCartao() {

        Cartao cartao = new Cartao();

        cartao.setCartao("Visa");
        cartao.setNumero("7856 4488 3232 2684");
        cartao.setDataValidade("02/28");
        cartao.setCodigoSeguranca("851");

        return cartao;
    }
    @GetMapping("/cadastros")
    public ArrayList<Cartao> getCadastros(){

        Cartao cartao1 = new Cartao();

        cartao1.setCartao("Visa");
        cartao1.setNumero("7856 4488 3232 2684");
        cartao1.setDataValidade("02/28");
        cartao1.setCodigoSeguranca("851");

        Cartao cartao2 = new Cartao();

        cartao2.setCartao("Master");
        cartao2.setNumero("4546 5555 3288 0205");
        cartao2.setDataValidade("01/29");
        cartao2.setCodigoSeguranca("963");

        Cartao cartao3 = new Cartao();

        cartao3.setCartao("Elo");
        cartao3.setNumero("4776 1478 8596 4563");
        cartao3.setDataValidade("05/21");
        cartao3.setCodigoSeguranca("741");


        ArrayList<Cartao> cadastro = new ArrayList<>();

        cadastro.add(cartao1);
        cadastro.add(cartao2);
        cadastro.add(cartao3);
        return cadastro;
    }

}

