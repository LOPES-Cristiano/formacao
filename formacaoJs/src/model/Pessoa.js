class Pessoa {
    constructor(nome = "", cpf = "", idade = 0, telefone = "") {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
    }
}

module.exports = Pessoa;
