package introducaoPoo.entities;

public class ContaBanco {
    private int numConta;
    private String nome;
    private double saldo;


    public ContaBanco() {
    }

    public ContaBanco(int numConta, String nome, double saldo) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void addSaldo(double saldo) {
         this.saldo += saldo;
    }
    public void saqueSaldo(double saldo) {
        this.saldo -= saldo;
         double  taxa = -5;
         this.saldo+=taxa;


        ;

    }




}
