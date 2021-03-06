package br.com.projetofcamara.projeto.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import br.com.projetofcamara.projeto.entity.Categoria;
import br.com.projetofcamara.projeto.entity.Comercio;
import br.com.projetofcamara.projeto.entity.Produto;

public class ProdutoForm {
	
	@NotNull @NotEmpty
	private String nome;
	@NotNull 
	private double preco;
	@NotNull
	private int quantidade;
	@NotNull @NotEmpty
	private String descricao;
	private String urlFoto;	
	@NotNull @NotEmpty
	private String codigoComercio;
	@NotNull @NotEmpty
	private String codigoCategoria;	
	@NotNull 
	private boolean produtoDemanda;
	@NotNull	
	private boolean produtoEstoque;
		
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
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	
	public String getCodigoComercio() {
		return codigoComercio;
	}
	public void setCodigoComercio(String codigoComercio) {
		this.codigoComercio = codigoComercio;
	}
	public String getCodigoCategoria() {
		return codigoCategoria;
	}
	public void setCodigoCategoria(String codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
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
	public void setProdutoComEstoque(boolean produtoEstoque) {
		this.produtoEstoque = produtoEstoque;
	}
	
	public Produto converter() {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setPreco(preco);
		produto.setQuantidade(quantidade);
		produto.setDescricao(descricao);
		produto.setUrlFoto(urlFoto);		
		produto.setComercio(new Comercio(codigoComercio));
		produto.setCategoria( new Categoria(codigoCategoria));
		produto.setProdutoDemanda(produtoDemanda);
		produto.setProdutoEstoque(produtoEstoque);
		
		return produto;
	}	
}
