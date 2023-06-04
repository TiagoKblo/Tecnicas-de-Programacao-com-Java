public class Acampamento {
    private String Nome;
    private char equipe;
    private int idade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public char getEquipe() {
        return equipe;
    }

    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void imprimir() {
        System.out.println("Nome = " + Nome);
        System.out.println("equipe = " + equipe);
        System.out.println("idade = " + idade);

    }
    public void separarGrupo(){
        if (idade < 6){
            equipe = '-';
            return;
        }
        if (idade < 11){
            equipe = 'A';
            return;
        }
        if (idade<21){
            equipe= 'B';
            return;
        }
        equipe = 'C';
        }
}

