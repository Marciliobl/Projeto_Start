package Projeto;

public class UsuarioProprietario {
    public static void main(String[] args) {
         Proprietario proprietario = new Proprietario(1, "123456789", "João", "joao@example.com", "senha123", "987654321", "Rua A, 123", "12345-678", 5000.0, 100.0);

        // Imprimir informações do proprietário
        System.out.println("ID: " + proprietario.getId());
        System.out.println("Nome: " + proprietario.getNome());
        System.out.println("Email: " + proprietario.getEmail());

        // Modificar algumas propriedades do proprietário
        proprietario.setTelefone("999999999");
        proprietario.setEndereco("Rua B, 456");

        // Imprimir as novas informações do proprietário
        System.out.println("Telefone: " + proprietario.getTelefone());
        System.out.println("Endereço: " + proprietario.getEndereco());
    }
}
        
    



class Proprietario {
    private int id;
    private String cpf;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String endereco;
    private String cep;
    private double rendaTotal;
    private double pesoSuportadoMaquina;

    public Proprietario(int id, String cpf, String nome, String email, String senha, String telefone, String endereco, String cep, double rendaTotal, double pesoSuportadoMaquina) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cep = cep;
        this.rendaTotal = rendaTotal;
        this.pesoSuportadoMaquina = pesoSuportadoMaquina;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public double getRendaTotal() {
        return rendaTotal;
    }

    public void setRendaTotal(double rendaTotal) {
        this.rendaTotal = rendaTotal;
    }

    public double getPesoSuportadoMaquina() {
        return pesoSuportadoMaquina;
    }

    public void setPesoSuportadoMaquina(double pesoSuportadoMaquina) {
        this.pesoSuportadoMaquina = pesoSuportadoMaquina;
    }
}