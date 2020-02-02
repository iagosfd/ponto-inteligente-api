package br.com.PontoInteligente.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.PontoInteligente.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	@Transactional(readOnly = true)
	List<Empresa> findByCnpj(String cnpj);
	

}
