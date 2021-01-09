package Pinta;


/**
* @generated
*/
public class Pinta {
    
    /**
    * @generated
    */
    private String apelido;
    
    /**
    * @generated
    */
    private Double risco_atual;
    
    
    /**
    * @generated
    */
    private Set fotos = new HashSet();
    
    /**
    * @generated
    */
    private String getApelido() {
        return this.apelido;
    }
    
    /**
    * @generated
    */
    private String setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    /**
    * @generated
    */
    private Double getRisco_atual() {
        return this.risco_atual;
    }
    
    /**
    * @generated
    */
    private Double setRisco_atual(Double risco_atual) {
        this.risco_atual = risco_atual;
    }

    public Set getFotos() {
        return Collection.unmodifiableSet(fotos);
    }
    
    public Pinta adicionarFoto(Foto foto) {
        this.fotos.add(foto);
    }

    public void removerFoto(Foto foto) {
        this.fotos.remove(foto);
    }
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public void criarTendencia() {
        //TODO
    }
    /**
    * @generated
    */
    public Foto criarFoto(File fotoPNG) {
        //TODO
    }
    /**
    * @generated
    */
    public Set listarFotos() {
        //TODO
    }
    
}
