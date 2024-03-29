package Classes_Terceiros;
// Generated 12/11/2015 19:54:26 by Hibernate Tools 4.3.1



/**
 * Agendamento generated by hbm2java
 */
public class Agendamento  implements java.io.Serializable {


     private Integer codservico;
     private ClientePrestador clientePrestador;
     private Servicos servicos;
     private String data;
     private String hora;
     private String descricao;

    public Agendamento() {
    }

	
    public Agendamento(ClientePrestador clientePrestador, Servicos servicos, String descricao) {
        this.clientePrestador = clientePrestador;
        this.servicos = servicos;
        this.descricao = descricao;
    }
    public Agendamento(ClientePrestador clientePrestador, Servicos servicos, String data, String hora, String descricao) {
       this.clientePrestador = clientePrestador;
       this.servicos = servicos;
       this.data = data;
       this.hora = hora;
       this.descricao = descricao;
    }
   
    public Integer getCodservico() {
        return this.codservico;
    }
    
    public void setCodservico(Integer codservico) {
        this.codservico = codservico;
    }
    public ClientePrestador getClientePrestador() {
        return this.clientePrestador;
    }
    
    public void setClientePrestador(ClientePrestador clientePrestador) {
        this.clientePrestador = clientePrestador;
    }
    public Servicos getServicos() {
        return this.servicos;
    }
    
    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }
    public String getData() {
        return this.data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return this.hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




}


