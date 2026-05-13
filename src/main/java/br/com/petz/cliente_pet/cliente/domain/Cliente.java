package br.com.petz.cliente_pet.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor( access =  AccessLevel.PRIVATE)
public class Cliente {
@NotBlank
	private String nomeCompleto;
@NotBlank
@Email
private String email;
@NotBlank
private String celular;
private String telefone;
private Sexo sexo;
@NotNull
private LocalDate dataNascimento;
@CPF
private String cpf;
@NotNull
private Boolean aceitaTermos;

private LocalDateTime dataHoraDoCadastro;
private LocalDateTime dataHoraDaUltimaAlteracao;


}
