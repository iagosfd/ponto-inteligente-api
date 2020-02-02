package br.com.PontoInteligente.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.PontoInteligente.model.Empresa;


public interface EmpresaService {
	
	  Object buscarPorCnpj(String cnpj); 
		
	
	
	Empresa persistir(Empresa empresa);
		
	}



