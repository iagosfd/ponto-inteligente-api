package br.com.PontoInteligente.services.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.PontoInteligente.model.Funcionario;
import br.com.PontoInteligente.repository.FuncionarioRepository;

@Service
public class FuncioarioServiceImpl {
	
	private static final Logger log = LoggerFactory.getLogger(FuncioarioServiceImpl.class);
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public Funcionario persistir(Funcionario funcionario) {
		log.info("Persistindo funcioanrio: {}", funcionario);
		return this.funcionarioRepository.save(funcionario);
	}
	
	public Optional<List<Funcionario>> buscarPorCpf(String cpf){
		log.info("Buscando funcionario pelo CPF: {}",cpf);
		return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));
	}
	
	public Optional<List<Funcionario>> buscarPorEmail(String email){
		log.info("Buscando funcionario pelo Email: {}",email);
		return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));
	}
	
	public Optional<Optional<Funcionario>> buscarPorId(Long id){
		log.info("Buscar funcionario por ID : {}",id);
		return Optional.ofNullable(this.funcionarioRepository.findById(id));
	}
	
	

}
