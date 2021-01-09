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

package Diagnostico;

public class Diagnostico {
    
    //------------------------------------------------------------//
    //                          Atributos                         //
    //------------------------------------------------------------//
    private Double porcentagem_risco;
    private Date data_diagnostico;
    //------------------------------------------------------------//
    
    
    //------------------------------------------------------------//
    //                      Setters e getters                     //
    //------------------------------------------------------------//
    private Double getPorcentagem_risco() {
        return this.porcentagem_risco;
    }
    
    private Double setPorcentagem_risco(Double porcentagem_risco) {
        this.porcentagem_risco = porcentagem_risco;
    }
    
    private Date getData_diagnostico() {
        return this.data_diagnostico;
    }
    
    private Date setData_diagnostico(Date data_diagnostico) {
        this.data_diagnostico = data_diagnostico;

    }
    //------------------------------------------------------------//
    
}
