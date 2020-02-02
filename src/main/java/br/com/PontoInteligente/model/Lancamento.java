package br.com.PontoInteligente.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import br.com.PontoInteligente.Enums.TipoEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@Table(name ="lancamento")
public class Lancamento implements Serializable{

	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String descricao;
	
	@NotBlank
	private String  localizacao;
	
	//@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Data_Criacao")
	private LocalDate dataCriacao;
	
	//@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Data_Alteracao")
	private LocalDate dataAtualizacao;
	
	@NotBlank
	@Enumerated(EnumType.STRING)
	private TipoEnum tipo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Funcionario funcionario;
	
	public Lancamento() {
		
	}

	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", descricao=" + descricao + ", localizacao=" + localizacao + ", dataCriacao="
				+ dataCriacao + ", dataAtualizacao=" + dataAtualizacao + ", tipo=" + tipo + ", funcionario="
				+ funcionario + "]";
	}

}
