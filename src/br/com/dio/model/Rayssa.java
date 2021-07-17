package br.com.dio.model;

import java.util.Objects;

public class Rayssa {
    private string nome;
    private string cor;
    private integer idade;

    public Rayssa() {}

    public Rayssa(string nome, string cor, integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public string getCor() {
        return cor;
    }

    public void setCor(string cor) {
        this.cor = cor;
    }

    public integer getIdade() {
        return idade;
    }

    public void setIdade(integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rayssa rayssa = (Rayssa) o;
        return Objects.equals(nome, rayssa.nome) && Objects.equals(cor, rayssa.cor) && Objects.equals(idade, rayssa.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Rayssa{" +
                "nome=" + nome +
                ", cor=" + cor +
                ", idade=" + idade +
                '}';
    }
}
