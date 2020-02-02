package br.com.PontoInteligente.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.PontoInteligente.model.Funcionario;


public interface FuncionarioService {
	
	Funcionario persistir(Funcionario funcionario);
	
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	Optional<Funcionario> buscarPorEmail(String email);
	
	Optional<Funcionario> buscarPorId(Long id);

}
