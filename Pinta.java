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

package Pinta;

public class Pinta {
    
    //------------------------------------------------------------//
    //                          Atributos                         //
    //------------------------------------------------------------//
    private String apelido;
    private Double risco_atual;
    private Set fotos = new HashSet();
    //------------------------------------------------------------//

    
    //------------------------------------------------------------//
    //                      Setters e getters                     //
    //------------------------------------------------------------//
    private String getApelido() {
        return this.apelido;
    }
    
    private String setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    private Double getRisco_atual() {
        return this.risco_atual;
    }
    
    private Double setRisco_atual(Double risco_atual) {
        this.risco_atual = risco_atual;
    }

    //------------------------------------------------------------//
    //               Codigos proprios adicionados                 //
    //------------------------------------------------------------//
    public Set getFotos() {                                       //
        return Collection.unmodifiableSet(fotos);                 //
    }                                                             //
                                                                  //
    public Pinta adicionarFoto(Foto foto) {                       //
        this.fotos.add(foto);                                     //
    }                                                             //
                                                                  //
    public void removerFoto(Foto foto) {                          //
        this.fotos.remove(foto);                                  //
    }                                                             //
    //------------------------------------------------------------//
    
    //------------------------------------------------------------//

    
    //------------------------------------------------------------//
    //                          Operations                        //
    //------------------------------------------------------------//
    public void criarTendencia() {
        //TODO
    }

    public Foto criarFoto(File fotoPNG) {
        //TODO
    }

    public Set listarFotos() {
        //TODO
    }
    //------------------------------------------------------------//
    
}
