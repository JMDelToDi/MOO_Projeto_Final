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

package Foto;

public class Foto {
    
    //------------------------------------------------------------//
    //                          Atributos                         //
    //------------------------------------------------------------//
    private File png;
    private Client_connection client_connection;
    private Diagnostico diagnostico;
    //------------------------------------------------------------//
    
    
    //------------------------------------------------------------//
    //                      Setters e getters                     //
    //------------------------------------------------------------//
    private File getPng() {
        return this.png;
    }
    
    private File setPng(File png) {
        this.png = png;
    }
    
    public Diagnostico getDiagnostico() {
        return this.diagnostico;
    }
    
    public Diagnostico setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
    
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
    public Diagnostico obterProbabilidade() {
        //TODO
    }

    public String criarMensagemProbabilidade() {
        //TODO
    }

    public String criarMensagemValidade() {
        //TODO
    }
    //------------------------------------------------------------//
    
}
