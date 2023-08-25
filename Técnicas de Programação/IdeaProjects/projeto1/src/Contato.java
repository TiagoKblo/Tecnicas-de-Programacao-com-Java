import java.util.Objects;

public class Contato implements Comparable<Contato> {
    private int idContato;
    private String nome;
    private String email;

    public Contato(int idContato, String nome, String email) {
        this.idContato = idContato;
        this.nome = nome;
        this.email = email;
    }

    public Contato() {

    }

    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
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

    @Override
    public String toString() {
        return "Contato{" +
                "idContato=" + idContato +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Contato) &&
                ((Contato) o).idContato == this.idContato;
    }

    @Override
    public int hashCode() {
        return nome.length();
    }

    @Override
    public int compareTo(Contato o) {
        return Integer.compare(this.idContato, o.idContato);
    }
}