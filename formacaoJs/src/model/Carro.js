class Carro {
    constructor(modelo = "", cor = "", velocidade = 0, estaLigado = false) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = velocidade;
        this.estaLigado = estaLigado;
    }
}

module.exports = Carro;
