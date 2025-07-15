package br.com.gestao.despesa.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gestao.despesa.Controller.entity.Despesa;

public interface  CustosRepository extends JpaRepository<Despesa, UUID> {
    
}
