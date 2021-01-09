//------------------------------------------------------------//
//                      MOO - Projeto Final                   //
//------------------------------------------------------------//
//                           Grupo 8                          //
//                                                            //
// Antônio Sebastian Fernandes Rabelo - NUSP 10797781         //
// João Marcos Della Torre Divino - NUSP 10377708             //
// Paulo Inay Cruz - NUSP 10388691                            //
// Samuel Libardi Godoy - NUSP 9805891                        //
// Vitor Oliveira Caires - NUSP 10748027                      //
// Vinícius Molina Garcia - NUSP 8929296                      //
//------------------------------------------------------------//

package User;

/**
* @generated
*/
public class User {
    
    //------------------------------------------------------------//
    //                          Atributos                         //
    //------------------------------------------------------------//
    private String nome;
    private String email;
    private String senha;
    private Date data_nascimento;    
    private Integer idade;    
    private String sexo;    
    private String localizacao;    
    private Set pintas = new HashSet();    
    private Client_connection client_connection;
    //------------------------------------------------------------//
    
    
    //------------------------------------------------------------//
    //                      Setters e getters                     //
    //------------------------------------------------------------//
    private String getNome() {
        return this.nome;
    }
    
    private String setNome(String nome) {
        this.nome = nome;
    }
    
    private String getEmail() {
        return this.email;
    }
    
    private String setEmail(String email) {
        this.email = email;
    }
    
    private String getSenha() {
        return this.senha;
    }
    
    private String setSenha(String senha) {
        this.senha = senha;
    }
    
    private Date getData_nascimento() {
        return this.data_nascimento;
    }
    
    private Date setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    private Integer getIdade() {
        return this.idade;
    }
    
    private Integer setIdade(Integer idade) {
        this.idade = idade;
    }
    
    private String getSexo() {
        return this.sexo;
    }
    
    private String setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    private String getLocalizacao() {
        return this.localizacao;
    }
    
    private String setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    //------------------------------------------------------------//
    //               Codigos proprios adicionados                 //
    //------------------------------------------------------------//
    public Set getPintas() {                                      //
        return Collection.unmodifiableSet(pintas);                //
    }                                                             //
                                                                  //
    public Pinta adicionarPinta(Pinta pinta) {                    //
        this.pintas.add(pinta);                                   //
    }                                                             //
                                                                  //
    public void removerPinta(Pinta pinta) {                       //
        this.pintas.remove(pinta);                                //
    }                                                             //
    //------------------------------------------------------------//
    
    public Client_connection getClient_connection() {
        return this.client_connection;
    }
    
    public Client_connection setClient_connection(Client_connection client_connection) {
        this.client_connection = client_connection;
    }
    //------------------------------------------------------------//
    
    
    //------------------------------------------------------------//
    //                          Operations                        //
    //------------------------------------------------------------//
    public Set listarPintas() {
        //TODO
    }
    
    public Pinta buscarPinta(String nomePinta) {
        //TODO
    }
    
    public Pinta criarPinta(String nomePinta) {
        //TODO
    }
    
    public String criarMensagemCadastro() {
        //TODO
    }
    //------------------------------------------------------------//
    
}
