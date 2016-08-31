/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm;

/**
 *
 * @author matheus
 */

public class Usuario {
    //ATRIBUTOS
    
    //Obrigatórios.
    private String nome;
    private String sobrenome;       
    //Fim Obrigatórios.
    
    //Opcionais (podemos ou não inserir/usar essas informações).
    private String nascimento;            
    private String cargo;           //Profissional ou estudante.
    private String instituicao;     //Instituição da qual faz parte.
    private int nivel;              //Nivel de permissão do usuário no programa. Usuário master define.
    //Fim Opcnionais.
    
    private int idade;              //Será calculada automaticamente
    
    //MÉTODOS DE ALTERAÇÃO
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public void setInstituicao(String instituicao){
        this.instituicao = instituicao;
    }
    
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    
    public void setIdade(){
        //Calcula idade do usuário, conforme data de nascimento inserida.
    }
    
    
    //MÉTODOS DE RETORNO
    
    public String getNome(String nome){
        return this.nome;
    }
    
    public String getSobrenome(String sobrenome){
        return this.sobrenome;
    }
    
    public String getNascimento(String nascimento){
        return this.nascimento;
    }
    
    public String getCargo(String cargo){
        return this.cargo;
    }
    
    public String getInstituicao(String instituicao){
        return this.instituicao;
    }
    
    public int getNivel(int nivel){
        return this.nivel;
    }
    
    public int getIdade(){
        return this.idade;
    }
}
