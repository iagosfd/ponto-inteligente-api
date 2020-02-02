package br.com.PontoInteligente.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import br.com.PontoInteligente.Enums.PerfilEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@Table(name="funcionario")
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String nome;
	@NotBlank
	private String email;
	
	@NotBlank
	private String senha;
	
	private String cpf;
	
	
    @Column(name = "Valor_Hora")
	private BigDecimal valorHora;
	
	
	@Column(name="Quantidade_Horas_Trabalho_dia")
	private Float qtdHorasTrabalhoDia;
	
	
	@Column(name="Quantidade_Horas_Almoco")
	private Float qtdHorasAlmoco;
	
	@NotBlank
	@Enumerated(EnumType.STRING)
	private PerfilEnum perfil;
	
	@NotBlank
	@Column(name="Data_Criacao")
	private LocalDate dataCriacao;
	
	@NotBlank
	@Column(name="Data_Atualizacao")
	private LocalDate dataAtualizacao;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Empresa empresa;
	
	@OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Lancamento> lancamento;
	
	public Funcionario() {
		
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", cpf=" + cpf
				+ ", valorHora=" + valorHora + ", qtdHorasTrabalhoDia=" + qtdHorasTrabalhoDia + ", qtdHorasAlmoco="
				+ qtdHorasAlmoco + ", perfil=" + perfil + ", dataCriacao=" + dataCriacao + ", dataAtualizacao="
				+ dataAtualizacao + ", empresa=" + empresa + ", lancamento=" + lancamento + "]";
	}
	
	
	

}
