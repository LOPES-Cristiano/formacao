package formacao.model;

import java.math.BigDecimal;

/**
 * Carro
 */
public class Carro {
    
    private String  modelo;
    private String  cor;
    private BigDecimal velocidade;
    boolean estaLigado = false;
    


//construtor vazio
    public Carro() {
        
    }
//Construtor com modelo e cor
    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public BigDecimal getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(BigDecimal velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }
    
}