package agencia;

public class Conta extends Biblioteca { // verifcar

    private static int contadorDeContas = 1;

    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;
    
    public Conta(Pessoa pessoa) {
        
        this.numeroConta = contadorDeContas;
        this.pessoa = pessoa;
        contadorDeContas++; // verificar aqui se deu erro
  
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "\nNúmero da conta: " + this.getNumeroConta() +
                "\nNome: " + this.pessoa.getNome() +
                "\nCPF: " + this.pessoa.getCPF() +
                "\nEmail: " + this.pessoa.getEmail() + 
                "\nSaldo " + Biblioteca.doubleToString(this.getSaldo()) +
                "\n";
                
    }

    public void depositar(Double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Seu depósito foi realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel realizar o depósito");
        }
    }

    public void sacar(Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Seu saque foi realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel realizar o saque");
        }
    }
        public void tranferir(Conta contaParaDeposito ,Double valor) {
            if(valor > 0 && this.getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);

                contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
                System.out.println("Tranferência realizada com sucesso!");
            } else {
                System.out.println("Não foi possivel realizar o transferência!");
            }
    }

    

}




