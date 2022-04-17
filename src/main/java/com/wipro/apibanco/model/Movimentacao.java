package com.wipro.apibanco.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_movimetacao")
public class Movimentacao implements Serializable{
	
	 private static final long serialVersionUID = 1L; 
	 
	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 Integer id; 
	 
	 @Size(max=10 ,min = 3)
	 String nome; 
	 
	 String email; 
	 
	 String senha; 
	 
	 String sobrenome; 
	 
	 String cartao; 
	 
	 double valor;
	 
	public Movimentacao() {
	}

	public Movimentacao(Integer id, String nome, String email, String senha, String sobrenome, String cartao,
			double valor, Date data) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.sobrenome = sobrenome;
		this.cartao = cartao;
		this.valor = valor;
		this.data = data;
	}


	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	Date data = new Date();

	@Override
	public int hashCode() {
		return Objects.hash(cartao, data, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movimentacao other = (Movimentacao) obj;
		return Objects.equals(cartao, other.cartao) && Objects.equals(data, other.data)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
}


