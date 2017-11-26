package model;
public class Mensal extends AluguelAutomovel{
    private Automovel automovel;
    private Pessoa pessoa;

    public Mensal(Automovel automovel, Pessoa pessoa) {
        super();
        this.automovel = automovel;
        this.pessoa = pessoa;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}