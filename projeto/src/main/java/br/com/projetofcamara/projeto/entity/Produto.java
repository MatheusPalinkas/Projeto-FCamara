package br.com.projetofcamara.projeto.entity;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produto {

	@Id
	private String id;
	private String nome;
	private double preco;
	private int quantidade;
	private String descricao;
	private LocalDateTime dataCriacao;
	private String urlFoto;
	private boolean produtoDemanda;
	private boolean produtoEstoque;
	private boolean produtoDisponivel;
	@DBRef
	private Comercio comercio;	
	@DBRef
	private Categoria categoria;
	
	public Produto() {
		this.produtoDisponivel = true;
		this.dataCriacao = LocalDateTime.now();
	}	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
		
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getUrlFoto() {
		return urlFoto;
	}
	
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}	
	
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	
	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isProdutoDisponivel() {
		return produtoDisponivel;
	}

	public void setProdutoDisponivel(boolean produtoDisponivel) {
		this.produtoDisponivel = produtoDisponivel;
	}

	public Comercio getComercio() {
		return comercio;
	}
	
	public void setComercio(Comercio comercio) {
		this.comercio = comercio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public boolean isProdutoDemanda() {
		return produtoDemanda;
	}

	public void setProdutoDemanda(boolean produtoDemanda) {
		this.produtoDemanda = produtoDemanda;
	}

	public boolean isProdutoEstoque() {
		return produtoEstoque;
	}

	public void setProdutoEstoque(boolean produtoEstoque) {
		this.produtoEstoque = produtoEstoque;
	}
	
}
