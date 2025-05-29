public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    Pessoa(String nome, String endereco, String telefone)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome()
    {
        return this.nome;
    }

    public String getEndereco()
    {
        return this.endereco;
    }

    public String getTelefone()
    {
        return this.telefone;
    }

    public void setNome(String novoNome)
    {
        this.nome = novoNome;
    }

    public void setEndereco(String novoEndereco)
    {
        this.endereco = novoEndereco;
    }

    public void setTelefone(String novoTelefone)
    {
        this.telefone = novoTelefone;
    }

    @Override
    public String toString()
    {
        return "Nome: " + this.nome + ", Endereco: " + this.endereco + ", Telefone: " + this.telefone;
    }
}
