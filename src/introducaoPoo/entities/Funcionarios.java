package introducaoPoo.entities;

import javax.swing.*;

public class Funcionarios {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionarios(){

    }

    public Funcionarios(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void increaseSalary(double porcentage){
        salario += salario * porcentage/100;


    }

    @Override
    public String toString() {
        return id +", "+nome+", "+ String.format("%.2f", salario);
    }
}
