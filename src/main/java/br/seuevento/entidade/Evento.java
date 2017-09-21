
package br.seuevento.entidade;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento extends Entidade{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    
    @Column(nullable = false)
    private String titulo;
    private String descricao;
    
    @Column(nullable = false)
    private Calendar data;
     
    @JoinColumn(name = "endereco")
    private Endereco endereco;
    @JoinColumn(name = "contato")
    private Contato contato;
    private String imagemCapa;
    private int classificacao;
    private double valor;
    private boolean ativo;

    public Evento() {
        
        this.endereco = new Endereco();
        this.contato = new Contato();
    }

    public Evento(long id, String titulo, String descricao, Calendar data, Endereco endereco, Contato contato, String imagemCapa, int classificacao, double valor, boolean ativo) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.endereco = endereco;
        this.contato = contato;
        this.imagemCapa = imagemCapa;
        this.classificacao = classificacao;
        this.valor = valor;
        this.ativo = ativo;
    }

    public Evento(String titulo, String descricao, Calendar data, Endereco endereco, Contato contato, String imagemCapa, int classificacao, double valor, boolean ativo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.endereco = endereco;
        this.contato = contato;
        this.imagemCapa = imagemCapa;
        this.classificacao = classificacao;
        this.valor = valor;
        this.ativo = ativo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getImagemCapa() {
        return imagemCapa;
    }

    public void setImagemCapa(String imagemCapa) {
        this.imagemCapa = imagemCapa;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

   
    
    
    
}
