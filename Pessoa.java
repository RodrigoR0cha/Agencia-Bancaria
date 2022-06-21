package agencia;
public class Pessoa {
    
    private static int id = 1; // 1° id do 1° Cliente
    private String nome;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf, String email ){
     this.nome = nome;
     this.cpf = cpf;
     this.email = email;
     id = id + 1; // +=
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) { 
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Nome: " + this.getNome() +
                "\nCPF: " + this.getCPF() +
                "\nEmail: " + this.getEmail();
    }           
}
