package wesley.leonardo1.Cartao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wesley.leonardo1.Cartao.model.Cartao;

import java.util.ArrayList;
@RestController
public class HelloController {

    @GetMapping("/")
    public String mensagem() {
        return "Seja Bem-Vindo aos Setores dos Cartões!!!";
    }

}
