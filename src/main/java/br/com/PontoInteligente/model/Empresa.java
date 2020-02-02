package br.com.PontoInteligente.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.hibernate.type.LocalDateTimeType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@Table(name ="empresa")
public class Empresa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "razao_social", nullable = false)
	private String razaoSocial;
	
	@Column(name = "cnpj", nullable = false)
	private String cnpj;
	
	@Column(name = "data_criacao", nullable = false)
	private LocalDate dataCriacao;
	
	@Column(name = "data_atualizacao", nullable = false)
	private LocalDate dataAtualizacao;
	
	@OneToMany(mappedBy ="empresa", fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	public List<Funcionario> funcionario;
	
	public Empresa() {
		
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", dataCriacao=" + dataCriacao
				+ ", dataAtualizacao=" + dataAtualizacao + "]";
	}
	
}
