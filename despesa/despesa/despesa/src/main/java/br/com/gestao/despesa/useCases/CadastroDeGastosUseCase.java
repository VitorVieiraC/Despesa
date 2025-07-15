package br.com.gestao.despesa.Controller.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gestao.despesa.Controller.entity.Despesa;
import br.com.gestao.despesa.repository.CustosRepository;

@Service
public class CadastroDeGastosUseCase {
    @Autowired
    private CustosRepository custosRepository;

    public void execute(Despesa custos ){
        custos = custosRepository.save(custos);
        System.out.println(custos);
    }
}
