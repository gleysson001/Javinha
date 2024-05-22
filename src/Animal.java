public class Animal {
    protected String nome;
    protected int idade;
    protected String porte;

    public Animal (){

    }
    public Animal(String nome, int idade, String porte) {
        this.nome = nome;
        this.idade = idade;
        this.porte = porte;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", porte='" + porte + '\'' +
                '}';
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
