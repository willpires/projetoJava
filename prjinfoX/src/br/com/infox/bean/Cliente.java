package br.com.infox.bean;

public class Cliente {
 
    private String idCliente;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + 
                idCliente + ", nome=" + 
                nome + ", endereco=" + 
                endereco + ", telefone=" +
                telefone + ", email=" +
                email + '}';
    }
    
}
