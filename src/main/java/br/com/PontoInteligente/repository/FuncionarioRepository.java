package br.com.PontoInteligente.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.PontoInteligente.model.Funcionario;

@Repository
@Transactional(readOnly=true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
		
		List<Funcionario> findByCpf(String cpf);
		List<Funcionario> findByEmail(String email);
		List<Funcionario> findByCpfOrEmail(String cpf, String email);
		
		

}
