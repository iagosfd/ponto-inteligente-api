package br.com.PontoInteligente.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.PontoInteligente.model.Lancamento;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
	List<Lancamento> findById(String id);
	
	
	
}
