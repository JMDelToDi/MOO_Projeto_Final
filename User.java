package User;


/**
* @generated
*/
public class User {
    
    /**
    * @generated
    */
    private String nome;
    
    /**
    * @generated
    */
    private String email;
    
    /**
    * @generated
    */
    private String senha;
    
    /**
    * @generated
    */
    private Date data_nascimento;
    
    /**
    * @generated
    */
    private Integer idade;
    
    /**
    * @generated
    */
    private String sexo;
    
    /**
    * @generated
    */
    private String localizacao;
    
    
    /**
    * @generated
    */
    private Set pintas = new HashSet();
    
    /**
    * @generated
    */
    private Client_connection client_connection;
    
    
    /**
    * @generated
    */
    private String getNome() {
        return this.nome;
    }
    
    /**
    * @generated
    */
    private String setNome(String nome) {
        this.nome = nome;
    }
    
    /**
    * @generated
    */
    private String getEmail() {
        return this.email;
    }
    
    /**
    * @generated
    */
    private String setEmail(String email) {
        this.email = email;
    }
    
    /**
    * @generated
    */
    private String getSenha() {
        return this.senha;
    }
    
    /**
    * @generated
    */
    private String setSenha(String senha) {
        this.senha = senha;
    }
    
    /**
    * @generated
    */
    private Date getData_nascimento() {
        return this.data_nascimento;
    }
    
    /**
    * @generated
    */
    private Date setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    /**
    * @generated
    */
    private Integer getIdade() {
        return this.idade;
    }
    
    /**
    * @generated
    */
    private Integer setIdade(Integer idade) {
        this.idade = idade;
    }
    
    /**
    * @generated
    */
    private String getSexo() {
        return this.sexo;
    }
    
    /**
    * @generated
    */
    private String setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    /**
    * @generated
    */
    private String getLocalizacao() {
        return this.localizacao;
    }
    
    /**
    * @generated
    */
    private String setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public Set getPintas() {
        return Collection.unmodifiableSet(pintas);
    }
    
    public Pinta adicionarPinta(Pinta pinta) {
        this.pintas.add(pinta);
    }

    public void removerPinta(Pinta pinta) {
        this.pintas.remove(pinta);
    }
    
    /**
    * @generated
    */
    public Client_connection getClient_connection() {
        return this.client_connection;
    }
    
    /**
    * @generated
    */
    public Client_connection setClient_connection(Client_connection client_connection) {
        this.client_connection = client_connection;
    }
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public Set listarPintas() {
        //TODO
    }
    /**
    * @generated
    */
    public Pinta buscarPinta(String nomePinta) {
        //TODO
    }
    /**
    * @generated
    */
    public Pinta criarPinta(String nomePinta) {
        //TODO
    }
    /**
    * @generated
    */
    public String criarMensagemCadastro() {
        //TODO
    }
    
}
