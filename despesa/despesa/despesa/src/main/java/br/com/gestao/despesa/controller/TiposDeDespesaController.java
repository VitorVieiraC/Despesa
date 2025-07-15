package br.com.gestao.despesa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gestao.despesa.Controller.entity.Despesa;
import br.com.gestao.despesa.Controller.useCases.CadastroDeGastosUseCase;

@RequestMapping("/gastos")
@RestController
public class TiposDeDespesaController {
    
    @Autowired
    CadastroDeGastosUseCase cadastroDeGastosUseCase;
    @PostMapping("/create")
    public void create(@RequestBody Despesa despesas){
   
        
        cadastroDeGastosUseCase.execute(despesas);
        





    }
}
