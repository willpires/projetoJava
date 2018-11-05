package br.com.infox.domain;

public class Usuario {
    
    private String idUsuario;
    private String usuario;
    private String fone;
    private String login;
    private String senha;
    private String perfi;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfi() {
        return perfi;
    }

    public void setPerfi(String perfi) {
        this.perfi = perfi;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idUsuario=" + 
                idUsuario + ", usuario=" + 
                usuario + ", fone=" + 
                fone + ", login=" + 
                login + ", senha=" + 
                senha + ", perfi=" +
                perfi + '}';
    }
    
}
