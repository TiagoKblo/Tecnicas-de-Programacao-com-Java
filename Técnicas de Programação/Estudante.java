class Estudante
{ // inicio do bloco da classe

    //Atributos
    private int id;
    private String nome;
    private String endereco;
    private long telefone;
    private long cpf;
    private String rg;
    private String ra;

    //Construtor
    public Estudante()
    { // inicio bloco do construtor sem parâmetros

        // Este construtor inicialize TODOS os atributos com
        // valor (conteúdo) padrão:
        this.id = 0;
        this.nome = "";
        this.endereco = "";
        this.telefone = 0l;
        this.cpf = 0l;
        this.rg = "";
        this.ra = "";
    } // fim bloco do construtor sem parâmetros
    
    public Estudante( int varId, String varNome, String varEndereco
        long varTel, long varCpf, String varRg, String varRa ) 
    { // inicio constr. com parâmetros
        this.id = varId;
        this.nome = varNome;
        this.endereco = varEndereco;
        this.telefone = varTel;
        this.cpf = varCpf;
        this.rg = varRg;
        this.ra = varRa;
    } // fim constr. com parâmetros
    // Métodos Getter adn Setter: interface pública pois
    // permitem que em outras classes tenham acesso ao conteúdo 
    // de cada atributo (GET) ou POSSAM fazer alterações no 
    // conteúdo dos atributos (SET)
    public int getId()
    {
        return this.id; // retorna o que tem dentro do id
    }
    public void setId(int varId)
    {
        this.id = varId; // altera o conteúdo do id
    }

    public String getNome()
    {
        return this.nome; 
    }
    public void setNome(String varNome)
    {
        this.nome = varNome;
    }
    public String getEndereco()
    {
        return this.endereco; 
    }
    public void setEndereco(String varEndereco)
    {
        this.endereco = varEndereco;
    }
    public long getTelefone()
    {
        return this.telefone; 
    }
    public void setTelefone(String varTel)
    {
        this.telefone = varTel;
    }
    public long getCpf()
    {
        return this.cpf; 
    }

    public void setCpf(long varCpf)
    {
        if(varCpf.size > 10)
        {
            this.cpf = varCpf;
        }
    }

    public String getRg()
    {
        return this.rg; 
    }
    public void setRG(String varRg)
    {
        this.rg = varRg;
    }
    public String getRa()
    {
        return this.ra; 
    }
    public void setRa(String varRa)
    {
        this.ra = varRa;
    }

} // fim do bloco da classe
